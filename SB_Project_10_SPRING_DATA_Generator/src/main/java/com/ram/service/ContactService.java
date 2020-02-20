package com.ram.service;

import com.ram.entity.ContactEntity;

public interface ContactService {

	public ContactEntity saveContact();
	public Iterable<ContactEntity> saveAll();

}
