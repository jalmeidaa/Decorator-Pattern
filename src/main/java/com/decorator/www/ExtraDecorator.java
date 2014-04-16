package com.decorator.www;

public class ExtraDecorator extends CarDecorator {

	public ExtraDecorator(Car sportsCar) {
		super(sportsCar);
	}

	public String showCar() {
		return sportsCar.showCar() + " " + addFeatures();
	}

	private String addFeatures() {

		return "\n & With flat Tyres and Nitro Boost.";
	}
}
