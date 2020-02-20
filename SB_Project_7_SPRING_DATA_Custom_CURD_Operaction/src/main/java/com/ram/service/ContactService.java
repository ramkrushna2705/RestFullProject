package com.ram.service;

import java.util.List;

import com.ram.entity.ContactEntity;

public interface ContactService {

	public List<ContactEntity> findByName(String name);
}
