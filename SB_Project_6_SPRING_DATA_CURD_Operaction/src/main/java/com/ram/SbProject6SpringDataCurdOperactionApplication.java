package com.ram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ram.entity.ContactDetailsEntity;
import com.ram.service.ContactDetailsService;

@SpringBootApplication
public class SbProject6SpringDataCurdOperactionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(SbProject6SpringDataCurdOperactionApplication.class, args);
		ContactDetailsService service = context.getBean(ContactDetailsService.class);
		System.out.println("================================================================");
		ContactDetailsEntity contact = new ContactDetailsEntity(500, "Bikarash", "Puri");
		boolean saved = service.isSaved(contact);
		System.out.println("Record is saved :: " + saved);
		System.out.println("================================================================");
		ContactDetailsEntity contactList1 = new ContactDetailsEntity(393, "Hariai", "bbsr");
		ContactDetailsEntity contactList2 = new ContactDetailsEntity(394, "Hariai", "bbsr");
		ContactDetailsEntity contactList3 = new ContactDetailsEntity(396, "Hariai", "bbsr");
		List<ContactDetailsEntity> list = new ArrayList<ContactDetailsEntity>();
		list.add(contactList1);
		list.add(contactList2);
		list.add(contactList3);
		Iterable<ContactDetailsEntity> allSaved = service.isAllSaved(list);
		Iterator<ContactDetailsEntity> itr = allSaved.iterator();
		while (itr.hasNext()) {
			ContactDetailsEntity entity = itr.next();
			System.out.println("Records are saved ::" + entity);
		}
		System.out.println("=================================================================");
		Optional<ContactDetailsEntity> contact1 = service.findById(202);
		System.out.println("Contact is :: " + contact1);
		System.out.println("=================================================================");
		ContactDetailsEntity contactList4 = new ContactDetailsEntity(396, "Hariai", "bbsr");
		boolean delete = service.isDelete(contactList4);
		System.out.println((delete==true ? "Record is deleted " : "Record is not deleted"));
		System.out.println("=================================================================");
	}
}
