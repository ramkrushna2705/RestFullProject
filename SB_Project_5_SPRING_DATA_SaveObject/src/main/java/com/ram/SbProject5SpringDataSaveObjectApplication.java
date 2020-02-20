package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ram.entity.ContactEntity;
import com.ram.service.ContactService;

@SpringBootApplication
public class SbProject5SpringDataSaveObjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SbProject5SpringDataSaveObjectApplication.class, args);
		ContactService bean = context.getBean(ContactService.class);
		ContactEntity contact=new ContactEntity();
		contact.setContactId(202);
		contact.setContactName("Haria");
		contact.setContactAddress("Bhubeneswara");
		boolean saved = bean.isSaved(contact);
		System.out.println("Record Stored :: "+saved);
	}

}
