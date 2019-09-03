package com.coding4All.builder;

public class OldCarBuilder implements CarBuilder{
	
	private Car car;
	
	public OldCarBuilder() {
		this.car = new Car();
	}

	@Override
	public void buildCarWheels() {
		car.setCarWheels("4");
		
	}

	@Override
	public void buildCarWindows() {
		car.setCarWindows("6");
		
	}

	@Override
	public void buildCarRoof() {
		car.setCarRoof("1");
		
	}

	@Override
	public void buildCarDoors() {
		car.setCarDoors("4");
		
	}
	public Car getCar(){
		return this.car;
	}
	

}
