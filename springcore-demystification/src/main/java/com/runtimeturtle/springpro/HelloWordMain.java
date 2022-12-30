package com.runtimeturtle.springpro;

import java.util.Scanner;

public class HelloWordMain {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			String message = sc.nextLine();
			if(message.length() > 0) {
				System.out.println(message);
			}else {
				System.out.println("Hello World");		
			}
		}
	}
}
