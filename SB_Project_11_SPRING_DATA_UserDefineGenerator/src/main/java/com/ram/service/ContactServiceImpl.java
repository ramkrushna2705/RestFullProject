package com.ram.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.entity.ContactEntity;
import com.ram.repo.UserRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public ContactEntity saveContact() {
		ContactEntity entity = new ContactEntity();
		entity.setContactName("bial");
		entity.setContactAddress("bihar");
		ContactEntity save = userRepo.save(entity);
		return save;
	}

	@Override
	public Iterable<ContactEntity> saveAll() {
		List<ContactEntity> listContact = new ArrayList<>();
		listContact.add(new ContactEntity("laba", "hariyan"));
		listContact.add(new ContactEntity("prama", "mumbai"));
		listContact.add(new ContactEntity("kali", "pune"));
		listContact.add(new ContactEntity("pradip", "kolkota"));
		List<ContactEntity> all = userRepo.saveAll(listContact);
		return all;
	}

}
