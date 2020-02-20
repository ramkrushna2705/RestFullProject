package com.ram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.ram.entity.ContactEntity;
import com.ram.repo.UserRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public Iterable<ContactEntity> sortContactListByName() {
		ContactEntity entity = new ContactEntity();
		entity.setContactName("kanu");
		Example<ContactEntity> example = Example.of(entity);
		List<ContactEntity> findAll = userRepo.findAll(example);
		return findAll;
	}

}
