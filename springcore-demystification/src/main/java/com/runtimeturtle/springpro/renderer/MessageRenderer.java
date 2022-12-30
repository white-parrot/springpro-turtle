package com.runtimeturtle.springpro.renderer;

import com.runtimeturtle.springpro.provider.MessageProvider;

public interface MessageRenderer {

	public void setMessageProvider(MessageProvider msgProvider);

	public void render();

}
