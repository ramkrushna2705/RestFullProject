package com.ram.demo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationApp implements ApplicationRunner {


	public ApplicationApp() {
		System.out.println("ApplicationApp.ApplicationApp()");
	}
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ApplicationApp.run()");
		System.out.println(args);
	}

}
