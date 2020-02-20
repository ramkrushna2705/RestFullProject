package com.ram.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.ram.entity.ContactEntity;

public interface UserRepository extends JpaRepository<ContactEntity, Integer>, QueryByExampleExecutor<ContactEntity> {

}
