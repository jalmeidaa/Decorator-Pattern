package com.decorator.www;

public class EngineDecorator extends CarDecorator{

	public EngineDecorator(Car sportsCar) {
		super(sportsCar);
		
	}
	public String showCar(){
		return sportsCar.showCar()+ " " + addEngine();
	}
	private String addEngine() {
		
		return "\n & with 4 Cylinder Engine," ;
	}

}
