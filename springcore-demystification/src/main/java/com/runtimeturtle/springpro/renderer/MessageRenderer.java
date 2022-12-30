package com.runtimeturtle.springpro.renderer;

import com.runtimeturtle.springpro.provider.MessageProvider;

public interface MessageRenderer {

	/* this setter name is used XML configuration like p:messageProvider*/
	public void setMessageProvider(MessageProvider msgProvider);

	public void render();

}
