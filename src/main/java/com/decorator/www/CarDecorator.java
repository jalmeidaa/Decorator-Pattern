package com.decorator.www;

public class CarDecorator implements Car {

	protected Car sportsCar;

	public CarDecorator(Car sportsCar) {
		this.sportsCar = sportsCar;
	}

	@Override
	public String showCar() {

		return sportsCar.showCar();
	}

}
