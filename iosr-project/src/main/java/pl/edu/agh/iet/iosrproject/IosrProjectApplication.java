package pl.edu.agh.iet.iosrproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IosrProjectApplication {

	static final Logger logger = LoggerFactory.getLogger(IosrProjectApplication.class);

	public static void main(String[] args) {
		logger.error("#1 IOSR Project is starting. Be careful! ");
		logger.debug("#2 IOSR Project is starting. Be careful! ");
		logger.info("#3 IOSR Project is starting. Be careful! ");
		SpringApplication.run(IosrProjectApplication.class, args);
	}
}
