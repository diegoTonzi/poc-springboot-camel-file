package br.com.diegotonzi.camelfile.txttostring;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;


/**
 * Created by diego on 18/07/17.
 */
@Component
public class StringProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        try {
            Message message = exchange.getIn();
            String lineToProcess = message.getBody(String.class);
            System.out.println("File detected: " + lineToProcess);

        } catch (Exception e) {
            System.err.println("Exception while trying to process file: " + e);
        }
    }
}
