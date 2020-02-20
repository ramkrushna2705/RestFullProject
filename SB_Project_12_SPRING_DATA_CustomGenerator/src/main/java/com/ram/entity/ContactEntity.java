package com.ram.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CONTACT_INFO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactEntity {

	@Id
	@Column(name = "CONTACTID")
	@GenericGenerator(name = "C_ID_SEQ", strategy = "com.ram.generator.MyCustomGenerator")
	@GeneratedValue(generator = "C_ID_SEQ")
	private String contactId;
	@Column(name = "CONTACTNAME")
	private String contactName;
	@Column(name = "CONTACTADDRESS")
	private String contactAddress;

	public ContactEntity(String contactName, String contactAddress) {
		this.contactName = contactName;
		this.contactAddress = contactAddress;
	}

}
