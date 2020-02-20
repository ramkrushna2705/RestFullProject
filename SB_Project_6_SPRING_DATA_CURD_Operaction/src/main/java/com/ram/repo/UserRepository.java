package com.ram.repo;

import org.springframework.data.repository.CrudRepository;

import com.ram.entity.ContactDetailsEntity;

public interface UserRepository extends CrudRepository<ContactDetailsEntity, Integer> {

	
}
