package br.com.diegotonzi.camelfile;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by diego on 20/07/17.
 *
 * Comel configuration to listen a target directory
 */
@Component
public class TxtRouteBuilder extends RouteBuilder {

	private static final String FILE_EXTENSION = "txt";
	private static final String SOURCE_FOLDER = "/home/maz_dcosta/Documentos/zurique/pocs/files/" + FILE_EXTENSION;
	private static final Integer CONSUMER_DELAY = 1000;
	private static final String CONSUMER_LOCK = "rename";
	private static final Integer CONSUMER_LOCK_INTERVAL = 1000;
	private static final String MOVE_ON_SUCCESS = ".success";
	private static final String MOVE_ON_ERROR = ".error";

	@Autowired
	private TxtFileProcessor txtProcessor;

	/**
	 * When a file is moved, created or changed in the target directory,
	 * the camel takes this file and split each line to be processed in parallel by {@link TxtFileProcessor}
	 * @throws Exception
	 */
	@Override
	public void configure() throws Exception {
		from("file:" + SOURCE_FOLDER +
				 "?include=.*-RET." + FILE_EXTENSION +
				 "&delay=" + CONSUMER_DELAY +
			     "&readLock="+ CONSUMER_LOCK +
			     "&readLockCheckInterval=" + CONSUMER_LOCK_INTERVAL +
			     "&move=" + MOVE_ON_SUCCESS +
			     "&moveFailed=" + MOVE_ON_ERROR)
				.autoStartup(true)
				.split(bodyAs(String.class).tokenize("\n"))
				.streaming()
				.parallelProcessing()
				.process(txtProcessor);
	}

}
