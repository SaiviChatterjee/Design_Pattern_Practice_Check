package com.spring.app.PracticeCheck_Abstract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IndiaFactory extends AbstractCarFactory {

	static final Logger LOGGER = LoggerFactory.getLogger(IndiaFactory.class);

	public Car getCar(CarType model) {
		if (model == CarType.LUXURY) {
			return new LuxuryCar(Location.INDIA);
		} else if (model == CarType.MICRO) {
			return new MicroCar(Location.INDIA);
		}
		return new MiniCar(Location.INDIA);
	}
}
