package com.ram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CONTACT_INFO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDetailsEntity {

	@Id
	@Column(name = "CONTACTID")
	private Integer contactId;
	@Column(name = "CONTACTNAME")
	private String contactName;
	@Column(name = "CONTACTADDRESS")
	private String contactAddress;

}
