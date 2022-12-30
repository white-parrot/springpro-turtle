package com.runtimeturtle.springpro.provider.impl;

import java.util.Scanner;

import com.runtimeturtle.springpro.provider.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {

	private String message;

	public String getMessage() {
		try (Scanner sc = new Scanner(System.in)) {
			String message = sc.nextLine();
			if (message.length() > 0) {
				this.message = message;
			} else {
				this.message = "Hello World";
			}
		}
		return message;
	}
}
