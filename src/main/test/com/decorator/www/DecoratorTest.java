package com.decorator.www;

public class DecoratorTest {

	public static void main(String[] args) {
		Car car = new ExtraDecorator(new EngineDecorator(new ColorDecorator(
				new SimpleCar())));
		System.out.println(car.showCar());
	}

}
