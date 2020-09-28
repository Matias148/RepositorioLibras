package ufms.matheus.libras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@SpringBootApplication//(scanBasePackages={"ufms.matheus.libras.service", "ufms.matheus.libras.repository"})
@SpringBootApplication
//@ComponentScan({"ufms.matheus.libras.controller"})
//@EntityScan("ufms.matheus.libras.entity")
//@EnableJpaRepositories("ufms.matheus.libras.repository")
public class LibrasApplication{ //extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LibrasApplication.class, args);
	}
}
