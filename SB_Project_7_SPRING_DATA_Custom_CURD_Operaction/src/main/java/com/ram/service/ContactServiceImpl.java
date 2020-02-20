package com.ram.service;

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
	public List<ContactEntity> findByName(String name) {
		return userRepo.findContactByContactName(name);
	}

	
}
