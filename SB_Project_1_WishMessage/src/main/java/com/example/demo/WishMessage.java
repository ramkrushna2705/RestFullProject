package com.example.demo;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class WishMessage {

	public WishMessage() {
		System.out.println("WishMessage :: 0-param constructor");
	}
	public String generateMessage(String name) {
		int hour;
		Calendar cal=Calendar.getInstance();
		Date date=cal.getTime();
		hour=date.getHours();
		if(hour<12) {
			return "Good Morning Mr. "+name;
		}else if(hour<16) {
			return "Good Afternoon Mr. "+name;
		}else if(hour<20) {
			return "Good Evening Mr. "+name;
		}else {
			return "Good Night Mr. "+name;
		}
	}
}
