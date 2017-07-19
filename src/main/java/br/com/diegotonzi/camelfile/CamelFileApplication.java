package br.com.diegotonzi.camelfile;

import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CamelFileApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(CamelFileApplication.class, args);
		CamelSpringBootApplicationController applicationController = applicationContext.getBean(CamelSpringBootApplicationController.class);
		applicationController.run();
	}

}
