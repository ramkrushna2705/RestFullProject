package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ram.entity.ContactEntity;
import com.ram.service.ContactService;

@SpringBootApplication
public class SbProject9SpringDataJpaRepoQueryByExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SbProject9SpringDataJpaRepoQueryByExampleApplication.class, args);
		ContactService contactService = context.getBean(ContactService.class);
		Iterable<ContactEntity> findAll = contactService.sortContactListByName();
		System.out.println("===============================================================================");
		System.out.println("****************************SORT_BY_VARIABLE_NAME******************************");
		System.out.println("================================================================================");
		findAll.forEach(all -> {
			System.out.println("All :: " + all);
		});
		System.out.println("================================================================================");
	}

}
