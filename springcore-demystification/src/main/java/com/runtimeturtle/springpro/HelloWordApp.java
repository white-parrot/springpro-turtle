package com.runtimeturtle.springpro;

import com.runtimeturtle.springpro.provider.HelloWorldMessageProvider;
import com.runtimeturtle.springpro.renderer.HelloWorldMessageRenderer;

public class HelloWordApp {

	public static void main(String[] args) {

		HelloWorldMessageProvider msgProvider = new HelloWorldMessageProvider();
		HelloWorldMessageRenderer msgRenderer = new HelloWorldMessageRenderer();
		msgRenderer.setMessageProvider(msgProvider);
		
		msgRenderer.renderer();
		
	}
}
