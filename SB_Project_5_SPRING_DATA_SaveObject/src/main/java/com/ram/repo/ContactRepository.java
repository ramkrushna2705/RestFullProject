package com.ram.repo;

import org.springframework.data.repository.CrudRepository;

import com.ram.entity.ContactEntity;

public interface ContactRepository extends CrudRepository<ContactEntity, Integer>{
	
}
