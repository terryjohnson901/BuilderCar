package com.coding4All.builder;

public class Mechanic {
	
	private CarBuilder carBuilder;
	
	public Mechanic(CarBuilder carBuilder){
		
		this.carBuilder = carBuilder;
	}

	public Car getCar(){
		
		return this.carBuilder.getCar();
	}
	
	public void makeCar() {
		this.carBuilder.buildCarDoors();
		
		this.carBuilder.buildCarRoof();
		
		this.carBuilder.buildCarWheels();
		
		this.carBuilder.buildCarWindows();
	}
}
