package com.ram.service;

import com.ram.entity.ContactEntity;

public interface ContactService {

	public Iterable<ContactEntity> findAll();
	public Iterable<ContactEntity> findAndSort();
}
