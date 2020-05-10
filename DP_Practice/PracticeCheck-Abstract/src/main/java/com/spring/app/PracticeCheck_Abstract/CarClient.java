package com.spring.app.PracticeCheck_Abstract;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarClient {

	static {
		System.setProperty("org.slf4j.simpleLogger.defaultLogLevel", "debug");
	}

	static final Logger LOGGER = LoggerFactory.getLogger(CarClient.class);

	public static void main(String[] args) {
		LOGGER.debug("Micro-USA {}", CarFactory.buildCar(CarType.MICRO, Location.USA));
		LOGGER.debug("Mini-India {} ", CarFactory.buildCar(CarType.MINI, Location.INDIA));
		LOGGER.debug("Luxury-Default {} ", CarFactory.buildCar(CarType.LUXURY, Location.DEFAULT));
	}

}

	