package com.spring.app.PracticeCheck_Abstract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LuxuryCar extends Car {

	static final Logger LOGGER = LoggerFactory.getLogger(LuxuryCar.class);

	public LuxuryCar(Location location) {
		super(CarType.LUXURY, location);
		construct();
	}

	@Override
	void construct() {
		LOGGER.debug("Connecting to Luxury Car....");
	}
}