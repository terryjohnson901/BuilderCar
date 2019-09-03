package com.coding4All.builder;

public class Car implements CarPlan{
	
	private String carWheels;
	private String carDoors;
	private String carRoof;
	private String carWindows;

	@Override
	public void setCarWheels(String wheels) {
		carWheels = wheels;
		
	}
	
	public String getCarWheels() {return carWheels;}

	@Override
	public void setCarDoors(String doors) {
		carDoors = doors;
		
	}

	public String getCarDoors() {return carDoors;}
	
	@Override
	public void setCarRoof(String roof) {
		carRoof = roof;
		
	}
	
	public String getCarRoof() {return carRoof;}

	@Override
	public void setCarWindows(String windows) {
		carWindows = windows;
		}

	public String getCarWindows() {return carWindows;}
}
