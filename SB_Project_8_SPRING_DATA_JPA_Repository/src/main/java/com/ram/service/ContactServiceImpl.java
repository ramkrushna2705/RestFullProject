package com.ram.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.ram.entity.ContactEntity;
import com.ram.repo.UserRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public Iterable<ContactEntity> findAll() {
		PageRequest page = PageRequest.of(1, 3);
		Page<ContactEntity> allContact = userRepo.findAll(page);
		return allContact;
	}

	public Iterable<ContactEntity> findAndSort() {
		List<ContactEntity> all = userRepo.findAll(Sort.by("contactName"));
		return all;
	}

}
