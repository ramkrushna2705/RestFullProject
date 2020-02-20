package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestingWishMessage {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=null;
		ctx=SpringApplication.run(TestingWishMessage.class, args);
		WishMessage message=ctx.getBean(WishMessage.class);
		System.out.println(message.generateMessage("Ram Krushna Nayak"));
	}
}
