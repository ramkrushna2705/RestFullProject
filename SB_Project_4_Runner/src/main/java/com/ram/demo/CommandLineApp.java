package com.ram.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CommandLineApp implements CommandLineRunner {

	public CommandLineApp() {
		System.out.println("CommandLineApp.CommandLineApp()");
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommandLineApp.run()");
		System.out.println(Arrays.toString(args));
	}

}
