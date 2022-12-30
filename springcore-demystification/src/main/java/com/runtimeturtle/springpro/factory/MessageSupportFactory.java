package com.runtimeturtle.springpro.factory;

import java.util.Properties;

import com.runtimeturtle.springpro.provider.MessageProvider;
import com.runtimeturtle.springpro.renderer.MessageRenderer;

/**
 * This Class Will Read Type of Renderer and Provider From the Property File and
 * will provide the Instances of These to Main Class.
 * 
 * This will allow us to use configure and use different type of Renderer and
 * Provider with the Same Application
 * 
 * @author pandeys3
 *
 */
public class MessageSupportFactory {

	private Properties props;
	private MessageProvider msgProvider;
	private MessageRenderer msgRenderer;
	private static MessageSupportFactory instance;

	/**
	 * Read the Property File and Create Instance of Renderer and Provider
	 */
	@SuppressWarnings("deprecation")
	private MessageSupportFactory() {

		props = new Properties();
		try {
			props.load(this.getClass().getResourceAsStream("/application.properties"));

			String providerClass = props.getProperty("provider.class");
			String rendererClass = props.getProperty("renderer.class");

			msgProvider = (MessageProvider) Class.forName(providerClass).newInstance();
			msgRenderer = (MessageRenderer) Class.forName(rendererClass).newInstance();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the Instance of Factory Class At Class Load Time
	 */
	static {
		instance = new MessageSupportFactory();
	}

	/**
	 * Return the Instance of Factory Class
	 *
	 * @return instance of MessageSupportFactory
	 */
	public static MessageSupportFactory getInstance() {
		return instance;
	}

	/**
	 * Returns the message Provider Instance
	 *
	 * @return instance of MessageProvider
	 */
	public MessageProvider getMessageProvider() {
		return this.msgProvider;
	}

	/**
	 * Returns the message Renderer Instance
	 * 
	 * @return instance of Message Renderer
	 */
	public MessageRenderer getMessageRenderer() {
		return this.msgRenderer;
	}

}
