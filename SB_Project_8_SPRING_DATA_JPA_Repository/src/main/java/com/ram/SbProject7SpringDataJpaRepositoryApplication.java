package com.ram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ram.entity.ContactEntity;
import com.ram.service.ContactService;

@SpringBootApplication
public class SbProject7SpringDataJpaRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SbProject7SpringDataJpaRepositoryApplication.class, args);
		ContactService contactService = context.getBean(ContactService.class);
		Iterable<ContactEntity> findAll = contactService.findAll();
		System.out.println("===============================================================================");
		System.out.println("*******************************PAGINATATION***********************************");
		System.out.println("================================================================================");
		findAll.forEach(all -> {
			System.out.println("All :: " + all);
		});
		System.out.println("================================================================================");
		Iterable<ContactEntity> findAndSort = contactService.findAndSort();
		System.out.println("===============================================================================");
		System.out.println("******************************SHORING******************************************");
		System.out.println("================================================================================");
		findAndSort.forEach(con -> {
			System.out.println("Sort :: " + con);
		});
		System.out.println("================================================================================");
	}

}
