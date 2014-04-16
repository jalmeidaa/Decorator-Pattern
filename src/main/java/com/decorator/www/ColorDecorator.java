package com.decorator.www;

public class ColorDecorator extends CarDecorator {

	public ColorDecorator(Car sportsCar) {
		super(sportsCar);
	}

	public String showCar() {
		return sportsCar.showCar() + " " + addColor();
	}

	private String addColor() {

		return "\n + With Red Color,";
	}

}
