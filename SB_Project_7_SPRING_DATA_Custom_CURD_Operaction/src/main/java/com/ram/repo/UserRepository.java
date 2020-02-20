package com.ram.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ram.entity.ContactEntity;

public interface UserRepository extends CrudRepository<ContactEntity, Integer> {
	
	public List<ContactEntity> findContactByContactName(String name);
	
}
