package com.ram.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.entity.ContactDetailsEntity;
import com.ram.repo.UserRepository;

@Service
public class ContactDetailsServiceImpl implements ContactDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean isSaved(ContactDetailsEntity contact) {
		ContactDetailsEntity save = userRepository.save(contact);
		return save != null;
	}

	@Override
	public Iterable<ContactDetailsEntity> isAllSaved(Iterable<ContactDetailsEntity> entities) {
		return userRepository.saveAll(entities);
	}

	@Override
	public Optional<ContactDetailsEntity> findById(Integer id) {
		Optional<ContactDetailsEntity> contact = userRepository.findById(id);
		return contact;
	}

	@Override
	public boolean isDelete(ContactDetailsEntity deleteContact) {
		userRepository.delete(deleteContact);
		return true;
		
	}
	
	

}
