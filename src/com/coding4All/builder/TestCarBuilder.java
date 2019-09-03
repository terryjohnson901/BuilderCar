package com.coding4All.builder;

public class TestCarBuilder {

	public static void main(String[] args) {
		CarBuilder oldModelCar = new OldCarBuilder();
		
		Mechanic mechanic = new Mechanic(oldModelCar);
		
		mechanic.makeCar();
		
		Car firstModel = mechanic.getCar();
		
		System.out.println("Car Built");
		
		System.out.println("Car wheels amount: " +firstModel.getCarWheels());
		
		System.out.println("Car doors amount: " +firstModel.getCarDoors());
		
		System.out.println("Car roof amount: " +firstModel.getCarRoof());
		
		System.out.println("Car windows amount: " +firstModel.getCarWindows());
	}

}
