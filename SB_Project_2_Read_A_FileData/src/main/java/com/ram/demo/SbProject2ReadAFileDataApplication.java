package com.ram.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ram.demo.service.ContactInfoService;

@SpringBootApplication
public class SbProject2ReadAFileDataApplication {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(SbProject2ReadAFileDataApplication.class, args);
		ContactInfoService bean = context.getBean(ContactInfoService.class);
		bean.readContactInfo("contact.txt");
	}
}
