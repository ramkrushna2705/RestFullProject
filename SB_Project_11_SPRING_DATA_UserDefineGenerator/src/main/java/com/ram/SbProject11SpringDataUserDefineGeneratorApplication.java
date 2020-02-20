package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ram.entity.ContactEntity;
import com.ram.service.ContactService;

@SpringBootApplication
public class SbProject11SpringDataUserDefineGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbProject11SpringDataUserDefineGeneratorApplication.class, args);
		ContactService bean = context.getBean(ContactService.class);
		System.out.println("===========================================================================");
		ContactEntity contact = bean.saveContact();
		
		System.out.println("===========================================================================");
		Iterable<ContactEntity> all = bean.saveAll();
		System.out.println(contact);
		all.forEach(contactList ->{
			System.out.println(contactList);
		});
		System.out.println("===========================================================================");
		
	}

}
