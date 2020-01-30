 package com.accenture.lkm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource(locations= {"classpath:dispatcher-servlet.xml","classpath:webapp-root.xml"})
public class SpringJpaHandsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaHandsonApplication.class, args);
	}

}
