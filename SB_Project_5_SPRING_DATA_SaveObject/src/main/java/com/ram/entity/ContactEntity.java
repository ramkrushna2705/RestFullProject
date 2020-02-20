package com.ram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "CONTACT_INFO")
public class ContactEntity {
	@Id
	@Column(name = "CONTACTID")
	private Integer contactId;
	@Column(name = "CONTACTNAME")
	private String contactName;
	@Column(name = "CONTACTADDRESS")
	private String contactAddress;

}
