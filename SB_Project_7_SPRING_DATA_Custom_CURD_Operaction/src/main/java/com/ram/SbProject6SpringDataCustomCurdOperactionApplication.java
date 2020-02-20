package com.ram;

import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ram.entity.ContactEntity;
import com.ram.service.ContactService;

@SpringBootApplication
public class SbProject6SpringDataCustomCurdOperactionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SbProject6SpringDataCustomCurdOperactionApplication.class, args);
		ContactService service = context.getBean(ContactService.class);
		List<ContactEntity> findByName = service.findByName("bbsr");
		Iterator<ContactEntity> itr = findByName.iterator();
		System.out.println("============================================================================");
		while (itr.hasNext()) {
			ContactEntity contact = itr.next();
			System.out.println("Search Contact is :: " + contact);
			System.out.println("============================================================================");
		}
	}

}
