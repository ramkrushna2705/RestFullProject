package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ram.entity.ContactEntity;
import com.ram.service.ContactService;

@SpringBootApplication
public class SbProject10SpringDataGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbProject10SpringDataGeneratorApplication.class,
				args);
		ContactService bean = context.getBean(ContactService.class);
		ContactEntity allContact = bean.saveContact();
		System.out.println("===============================================================================");
		System.out.println("*******************************ONE OBJECT GENERATOR****************************");
		System.out.println("================================================================================");
		System.out.println("All :: " + allContact);
		System.out.println("================================================================================");
		System.out.println("===============================================================================");
		System.out.println("*************************BUNCH OF OBJECT GENERATOR******************************");
		System.out.println("================================================================================");
		Iterable<ContactEntity> saveAll = bean.saveAll();
		System.out.println(saveAll);
	}

}
