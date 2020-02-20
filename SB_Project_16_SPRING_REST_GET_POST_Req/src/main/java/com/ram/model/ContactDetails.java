package com.ram.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class ContactDetails {

	private List<Contact> getAllContact;
}
