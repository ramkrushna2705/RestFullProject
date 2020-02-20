package com.ram.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ram.service.PersonDetails;
import com.ram.service.WishMessage;

@RestController
@RequestMapping("/message")
public class WelcomeRestController {

	@Autowired
	private WishMessage service;

	@GetMapping("/welcome")
	public String welcomeMessage(@RequestParam("name") String name) {
		String message = "Welcome to RESTFUL Application ..!! " + name;
		return message;
	}

	@GetMapping("/wish/name/{name}/age/{age}")
	public String wishMessage(@PathVariable("name") String name, @PathVariable("age") Integer age) {
		String wishMessage = service.wishMessage(name);
		wishMessage += " Your age is :: " + age;
		return wishMessage;
	}

	@GetMapping(value = "/personDetails/{personId}", produces = { "application/xml", "application/json" })
	public PersonDetails getPesonDetailsById(@PathVariable("personId") Integer personId) {
		PersonDetails details = new PersonDetails();
		details.setPersonId(personId);
		details.setPersonName("RamKrushna Nayak");
		details.setPersonAddress("Berhampur");
		details.setPersonSalary(40000);
		return details;
	}

}
