package com.qa.community.javabeginner.garage;

import garage.Car;
import garage.Garage;
import garage.Motorcycle;
import garage.Vehicles;

public class Runner { 
	
	
	public static void main(String[] args) {
	System.out.println("Vehicles that have been added: ");
	Garage.addVehicle();
	System.out.println(" ");
	Garage.removeVehicle();
	System.out.println(" ");
	Garage.fixVehicle();
	System.out.println(" ");
	Garage.emptyGarage();  
	}
}
