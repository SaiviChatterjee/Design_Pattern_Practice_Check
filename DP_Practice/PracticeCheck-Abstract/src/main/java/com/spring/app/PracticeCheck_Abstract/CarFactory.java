package com.spring.app.PracticeCheck_Abstract;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarFactory {

	static final Logger LOGGER = LoggerFactory.getLogger(CarFactory.class);
	
	public static Car buildCar(CarType model, Location location) {
		if(location==Location.USA) {
			return new UsaFactory().getCar(model); 
		} else if(location==Location.INDIA){
			return new IndiaFactory().getCar(model);
		}
		return new DefaultFactory().getCar(model);
	}
}