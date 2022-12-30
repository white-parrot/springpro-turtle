package com.runtimeturtle.springpro.renderer;

import com.runtimeturtle.springpro.provider.HelloWorldMessageProvider;

public class HelloWorldMessageRenderer {

	private HelloWorldMessageProvider msgProvider;
	
	public void setMessageProvider(HelloWorldMessageProvider msgProvider) {
		this.msgProvider = msgProvider;
	}
	
	public void renderer() {
		if(msgProvider == null) {
			throw new RuntimeException("Message Provider is Not Set");
		}else {
			System.out.println(msgProvider.getMessage());
		}
	}
}
