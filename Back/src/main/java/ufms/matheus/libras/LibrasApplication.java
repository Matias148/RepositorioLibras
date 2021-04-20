package ufms.matheus.libras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ufms.matheus.libras.pojo.FileStorageProperties;
//import org.springframework.stereotype.Component;

//@Component
@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class LibrasApplication{

	public static void main(String[] args) {
		SpringApplication.run(LibrasApplication.class, args);
	}
}
