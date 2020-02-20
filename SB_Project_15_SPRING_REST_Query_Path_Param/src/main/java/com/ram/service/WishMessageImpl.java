package com.ram.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service
public class WishMessageImpl implements WishMessage {

	@Override
	public String wishMessage(String name) {
		Calendar cal = Calendar.getInstance();
		int hours = cal.get(Calendar.HOUR_OF_DAY);
		if (hours < 12) {
			return "Good Morning :: " + name;
		} else if (hours < 16) {
			return "Good Afternoon :: " + name;
		} else if (hours < 20) {
			return "Good Evening :: " + name;
		} else {
			return "Good Night :: " + name;
		}
	}
}
