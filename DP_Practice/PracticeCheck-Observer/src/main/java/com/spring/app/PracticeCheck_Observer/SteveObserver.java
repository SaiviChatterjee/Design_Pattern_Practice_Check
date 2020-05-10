package com.spring.app.PracticeCheck_Observer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SteveObserver implements INotificationObserver {

	private final String name = "Steve";
	static final Logger LOGGER = LoggerFactory.getLogger(SteveObserver.class);

	public void onServerDown() {
		LOGGER.debug("Hello " + name + " Notification received");
	}

	@Override
	public String toString() {
		return "INotificationObserver [name=" + name + "]";
	}

}
