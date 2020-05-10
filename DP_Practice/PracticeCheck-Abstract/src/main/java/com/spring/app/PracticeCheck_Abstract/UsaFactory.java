package com.spring.app.PracticeCheck_Abstract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsaFactory extends AbstractCarFactory {

	static final Logger LOGGER = LoggerFactory.getLogger(UsaFactory.class);

	public Car getCar(CarType model) {
		if (model == CarType.LUXURY) {
			return new LuxuryCar(Location.USA);
		} else if (model == CarType.MICRO) {
			return new MicroCar(Location.USA);
		}
		return new MiniCar(Location.USA);
	}
}