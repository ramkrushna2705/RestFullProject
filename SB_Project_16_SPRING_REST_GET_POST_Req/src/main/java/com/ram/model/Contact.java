package com.ram.model;


import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@XmlRootElement
public class Contact {

	private Integer contactId;
	private String contactName;
	private Long contactNumber;

}
