package com.runtimeturtle.springpro;

import com.runtimeturtle.springpro.factory.MessageSupportFactory;
import com.runtimeturtle.springpro.provider.MessageProvider;
import com.runtimeturtle.springpro.renderer.MessageRenderer;

public class HelloWordApp {

	public static void main(String[] args) {

		MessageProvider msgProvider = MessageSupportFactory.getInstance().getMessageProvider();
		MessageRenderer msgRenderer = MessageSupportFactory.getInstance().getMessageRenderer();

		msgRenderer.setMessageProvider(msgProvider);

		msgRenderer.renderer();

	}
}
