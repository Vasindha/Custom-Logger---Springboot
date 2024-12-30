package vipendrasinh.logger;

import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class LoggerApplication {
	public static void main(String[] args) throws UnknownHostException {
		System.setProperty("hostname", InetAddress.getLocalHost().getHostName());
		var logger = LogManager.getLogger(LoggerApplication.class);
		logger.info("hello world");
		SpringApplication.run(LoggerApplication.class, args);
	}

}
