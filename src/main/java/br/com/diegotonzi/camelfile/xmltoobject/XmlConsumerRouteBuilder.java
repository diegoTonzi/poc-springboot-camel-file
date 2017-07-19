package br.com.diegotonzi.camelfile.xmltoobject;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import br.com.diegotonzi.camelfile.xmltoobject.vo.importer.credit.ret.RetCreditDocumentVO;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.springframework.stereotype.Component;


/**
 * Created by diego on 18/07/17.
 */
@Component
public class XmlConsumerRouteBuilder extends RouteBuilder {

    private static final String SOURCE_FOLDER = "/home/diego/Documentos/xml";
    private static final Integer CONSUMER_DELAY = 1000;
    private static final String CONSUMER_LOCK = "rename";
    private static final Integer CONSUMER_LOCK_INTERVAL = 1000;
    private static final String MOVE_ON_SUCCESS = ".success";
    private static final String MOVE_ON_ERROR = ".error";

    public void configure() throws Exception {
        from("file:" + SOURCE_FOLDER +
                "?delay=" + CONSUMER_DELAY +
                "&readLock="+ CONSUMER_LOCK +
                "&readLockCheckInterval=" + CONSUMER_LOCK_INTERVAL +
                "&move=" + MOVE_ON_SUCCESS +
                "&moveFailed=" + MOVE_ON_ERROR)
                .autoStartup(true)
                .unmarshal(getDataFormat())
                .process(exchange -> {
                    RetCreditDocumentVO vo = exchange.getIn().getBody(RetCreditDocumentVO.class);
                    System.out.println("file name: " + vo.getBcarq().getFileName());
                });
    }

    private JaxbDataFormat getDataFormat() throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(RetCreditDocumentVO.class);
        JaxbDataFormat jaxb = new JaxbDataFormat(JAXBContext.newInstance(RetCreditDocumentVO.class));
        jaxb.setEncoding("UTF-16BE");
        return jaxb;
    }

}
