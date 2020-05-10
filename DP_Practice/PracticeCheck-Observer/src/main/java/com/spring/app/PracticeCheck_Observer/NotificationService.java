package com.spring.app.PracticeCheck_Observer;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> observers;
	static final Logger LOGGER = LoggerFactory.getLogger(NotificationService.class);

	public NotificationService() {
		observers = new ArrayList<INotificationObserver>();
	}
	
	public void addSubscriber(INotificationObserver observer) {
		observers.add(observer);
		LOGGER.debug("List of Subscriber after Addition");
		LOGGER.debug("Subscriber List{} ", observers);
	}

	public void removeSubscriber(INotificationObserver observer) {
		observers.remove(observer);
		LOGGER.debug("List of Subscriber after Removal");
		LOGGER.debug("Subscriber List{} ", observers);
	}

	public void notifySubscriber() {
		for (INotificationObserver observer : observers)
			observer.onServerDown();
	}
}