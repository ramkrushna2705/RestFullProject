package com.ram.service;


import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PersonDetails {

	private Integer personId;
	private String personName;
	private String personAddress;
	private double personSalary;
	
}
