package com.spring.app.PracticeCheck_Observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JohnObserver implements INotificationObserver {

	private final String name = "John";
	static final Logger LOGGER = LoggerFactory.getLogger(JohnObserver.class);

	
	@Override
	public String toString() {
		return "INotificationObserver [name=" + name + "]";
	}


	public void onServerDown() {
		LOGGER.debug("Hello " + name + " Notification received");
	}

}