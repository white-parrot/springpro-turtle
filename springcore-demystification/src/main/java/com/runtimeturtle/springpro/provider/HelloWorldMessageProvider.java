package com.runtimeturtle.springpro.provider;

import java.util.Scanner;

public class HelloWorldMessageProvider {

	private String message;
	
	public String getMessage() {
		try (Scanner sc = new Scanner(System.in)) {
			String message = sc.nextLine();
			if(message.length() > 0) {
				this.message = message;
			}else {
				this.message = "Hello World";
			}
		}
		return message;
	}
}
