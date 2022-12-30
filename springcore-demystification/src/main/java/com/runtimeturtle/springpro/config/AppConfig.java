package com.runtimeturtle.springpro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.runtimeturtle.springpro.provider.MessageProvider;
import com.runtimeturtle.springpro.provider.impl.HelloWorldMessageProvider;
import com.runtimeturtle.springpro.renderer.MessageRenderer;
import com.runtimeturtle.springpro.renderer.impl.HelloWorldMessageRenderer;

@Configuration
public class AppConfig {

	@Bean
	/* renderer denotes the id in XML configuration */
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}

	@Bean
	/* renderer denotes the id in XML configuration */
	public MessageRenderer renderer() {
		MessageRenderer msgRenderer = new HelloWorldMessageRenderer();
		msgRenderer.setMessageProvider(provider());
		return msgRenderer;
	}

}
