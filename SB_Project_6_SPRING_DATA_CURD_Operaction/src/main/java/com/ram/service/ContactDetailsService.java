package com.ram.service;

import java.util.Optional;

import com.ram.entity.ContactDetailsEntity;

public interface ContactDetailsService {

	public boolean isSaved(ContactDetailsEntity contact);

	public Iterable<ContactDetailsEntity> isAllSaved(Iterable<ContactDetailsEntity> entities);

	public Optional<ContactDetailsEntity> findById(Integer id);
	
	public boolean isDelete(ContactDetailsEntity deleteContact);
	
	
}
