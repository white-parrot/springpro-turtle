package com.runtimeturtle.springpro.renderer.impl;

import com.runtimeturtle.springpro.provider.MessageProvider;
import com.runtimeturtle.springpro.renderer.MessageRenderer;

public class HelloWorldMessageRenderer implements MessageRenderer {

	private MessageProvider msgProvider;

	@Override
	public void setMessageProvider(MessageProvider msgProvider) {
		this.msgProvider = msgProvider;
	}

	@Override
	public void render() {
		if (msgProvider == null) {
			throw new RuntimeException("Message Provider is Not Set");
		} else {
			System.out.println(msgProvider.getMessage());
		}
	}
}
