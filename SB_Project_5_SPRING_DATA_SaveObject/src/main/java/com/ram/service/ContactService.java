package com.ram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.entity.ContactEntity;
import com.ram.repo.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;

	public boolean isSaved(ContactEntity contact) {
		 ContactEntity entity = contactRepository.save(contact);
		return entity != null;
	}
}
