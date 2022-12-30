package com.runtimeturtle.springpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.runtimeturtle.springpro.config.AppConfig;
import com.runtimeturtle.springpro.renderer.MessageRenderer;

public class HelloWordApp {

	public static void main(String[] args) {
		/*
		 * Configure the POM.xml for the spring-context dependency delete the project
		 * and import again as maven project
		 */
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		/* renderer is defined as method name in Class Configuraiton */
		MessageRenderer msgRenderer = ctx.getBean("renderer", MessageRenderer.class);
		msgRenderer.render();
	}
}
