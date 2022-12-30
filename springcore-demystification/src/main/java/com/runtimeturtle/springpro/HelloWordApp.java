package com.runtimeturtle.springpro;

import com.runtimeturtle.springpro.provider.MessageProvider;
import com.runtimeturtle.springpro.provider.impl.HelloWorldMessageProvider;
import com.runtimeturtle.springpro.renderer.MessageRenderer;
import com.runtimeturtle.springpro.renderer.impl.HelloWorldMessageRenderer;

public class HelloWordApp {

	public static void main(String[] args) {

		MessageProvider msgProvider = new HelloWorldMessageProvider();
		MessageRenderer msgRenderer = new HelloWorldMessageRenderer();
		msgRenderer.setMessageProvider(msgProvider);

		msgRenderer.renderer();

	}
}
