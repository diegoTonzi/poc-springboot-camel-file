package br.com.diegotonzi.camelfile;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;


/**
 * Created by diego on 18/07/17.
 */
@Component
public class TxtFileProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {

        String lineToProcess = exchange.getIn().getBody(String.class);
        System.out.println("Line received: " + lineToProcess);

    }
}
