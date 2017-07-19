package br.com.diegotonzi.camelfile.txttostring;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



/**
 * Created by diego on 18/07/17.
 * Listening a folder to process file when it is created
 * The file is splited and each line is sent to be processed on StringProcessor class
 */
@Component
public class TxtConsumerRouteBuilder extends RouteBuilder {

    private static final String SOURCE_FOLDER = "/home/diego/Documentos/string";
    private static final Integer CONSUMER_DELAY = 1000;
    private static final String CONSUMER_LOCK = "rename";
    private static final Integer CONSUMER_LOCK_INTERVAL = 1000;
    private static final String MOVE_ON_SUCCESS = ".success";
    private static final String MOVE_ON_ERROR = ".error";

    @Autowired
    private StringProcessor processor;

    public void configure() throws Exception {
        System.out.println("file://" + SOURCE_FOLDER);
        from("file:" + SOURCE_FOLDER +
                "?delay=" + CONSUMER_DELAY +
                "&readLock="+ CONSUMER_LOCK +
                "&readLockCheckInterval=" + CONSUMER_LOCK_INTERVAL +
                "&move=" + MOVE_ON_SUCCESS +
                "&moveFailed=" + MOVE_ON_ERROR)
                .autoStartup(true)
                .split(bodyAs(String.class).tokenize("\n"))
                .streaming()
                .parallelProcessing()
                .process(processor);

    }

}
