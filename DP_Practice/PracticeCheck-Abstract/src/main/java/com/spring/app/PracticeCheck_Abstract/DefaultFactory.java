package com.spring.app.PracticeCheck_Abstract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultFactory extends AbstractCarFactory{
	
	static final Logger LOGGER = LoggerFactory.getLogger(DefaultFactory.class);

	public Car getCar(CarType model) {
		if (model == CarType.LUXURY) {
			return new LuxuryCar(Location.DEFAULT);
		} else if (model == CarType.MICRO) {
			return new MicroCar(Location.DEFAULT);
		}
		return new MiniCar(Location.DEFAULT);
	}
}