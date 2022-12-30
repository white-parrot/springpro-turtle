package com.runtimeturtle.springpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.runtimeturtle.springpro.renderer.MessageRenderer;

public class HelloWordApp {

	public static void main(String[] args) {
		/*
		 * Configure the POM.xml for the spring-context dependency delete the project
		 * and import again as maven project
		 */
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
		MessageRenderer msgRenderer = ctx.getBean("renderer", MessageRenderer.class);
		msgRenderer.render();
	}
}
