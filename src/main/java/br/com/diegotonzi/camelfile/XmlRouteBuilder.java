package br.com.diegotonzi.camelfile;

import javax.xml.bind.JAXBContext;

import br.com.diegotonzi.camelfile.model.User;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.springframework.stereotype.Component;

/**
 * Created by diego on 20/07/17.
 *
 * Comel configuration to listen a target directory
 */
@Component
public class XmlRouteBuilder extends RouteBuilder {

	private static final String FILE_EXTENSION = "xml";
	private static final String SOURCE_FOLDER = "/home/diego/Documentos/pocs/files/" + FILE_EXTENSION;
	private static final Integer CONSUMER_DELAY = 1000;
	private static final String CONSUMER_LOCK = "rename";
	private static final Integer CONSUMER_LOCK_INTERVAL = 1000;
	private static final String MOVE_ON_SUCCESS = ".success";
	private static final String MOVE_ON_ERROR = ".error";

	/**
	 * When a file is moved, created or changed in the target directory,
	 * the camel takes this file and unmarshal the xml to an object using jaxb
	 * @throws Exception
	 */
	@Override
	public void configure() throws Exception {
		from("file:" + getTarget())
			.autoStartup(true)
			.unmarshal(new JaxbDataFormat(JAXBContext.newInstance(User.class)))
			.process(exchange -> {
				User user = exchange.getIn().getBody(User.class);
				System.out.println("file name: " + user.getName());
			});
	}

	private String getTarget(){
		StringBuilder sb = new StringBuilder(SOURCE_FOLDER);
		sb.append("?include=.*.").append(FILE_EXTENSION);
		sb.append("&delay=").append(CONSUMER_DELAY);
		sb.append("&readLock=").append(CONSUMER_LOCK);
		sb.append("&readLockCheckInterval=").append(CONSUMER_LOCK_INTERVAL);
		sb.append("&move=").append(MOVE_ON_SUCCESS);
		sb.append("&moveFailed=").append(MOVE_ON_ERROR);
		return sb.toString();
	}

}
