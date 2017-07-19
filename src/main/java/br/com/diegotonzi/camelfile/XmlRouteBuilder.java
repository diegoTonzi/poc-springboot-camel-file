package br.com.diegotonzi.camelfile;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.springframework.stereotype.Component;

/**
 * Comel configuration to listen a target directory
 */
@Component
public class XmlRouteBuilder extends RouteBuilder {

	private static final String FILE_EXTENSION = "xml";
	private static final String SOURCE_FOLDER = "/home/maz_dcosta/Documentos/zurique/pocs/files/" + FILE_EXTENSION;
	private static final Integer CONSUMER_DELAY = 1000;
	private static final String CONSUMER_LOCK = "rename";
	private static final Integer CONSUMER_LOCK_INTERVAL = 1000;
	private static final String MOVE_ON_SUCCESS = ".success";
	private static final String MOVE_ON_ERROR = ".error";

	/**
	 * When a file is moved/created in the target directory, the camel takes this file, unmarshal the xml to an object
	 * @throws Exception
	 */
	@Override
	public void configure() throws Exception {
		from("file:" + SOURCE_FOLDER +
			     "?include=.*." + FILE_EXTENSION +
				 "&delay=" + CONSUMER_DELAY +
			     "&readLock="+ CONSUMER_LOCK +
			     "&readLockCheckInterval=" + CONSUMER_LOCK_INTERVAL +
			     "&move=" + MOVE_ON_SUCCESS +
			     "&moveFailed=" + MOVE_ON_ERROR)
			.autoStartup(true)
			.unmarshal(getDataFormat())
			.process(exchange -> {
				UserVo user = exchange.getIn().getBody(UserVo.class);
				System.out.println("file name: " + user.getName());
			});
	}

	private JaxbDataFormat getDataFormat() throws JAXBException {
		JaxbDataFormat jaxb = new JaxbDataFormat(JAXBContext.newInstance(UserVo.class));
		return jaxb;
	}

}
