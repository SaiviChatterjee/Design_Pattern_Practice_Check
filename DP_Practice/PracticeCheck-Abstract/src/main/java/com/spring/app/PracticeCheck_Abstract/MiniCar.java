package com.spring.app.PracticeCheck_Abstract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MiniCar extends Car {

	static final Logger LOGGER = LoggerFactory.getLogger(MiniCar.class);
	
	public MiniCar(Location location) {
		super(CarType.MICRO, location);
		construct();
	}

	@Override
	void construct() {
		LOGGER.debug("Connecting to Mini Car....");
	}

}