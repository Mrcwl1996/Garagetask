package garage;

import java.util.ArrayList;
import garage.Vehicles;
import garage.Car;

public class Garage {
	//int price, int cargoSpace, String model, String fuelType
	static ArrayList <Vehicles> GarageList = new ArrayList();
	
	public static void addVehicle() {
		Car myCar = new Car("Car", 30000, 30, "BMW 4 Series", "Petrol");
		GarageList.add(myCar); 
		System.out.println("BMW 4 Series has been added");
		Car myCar2 = new Car("Car", 50000, 30, "BMW M4", "Supreme Petrol");
		GarageList.add(myCar2);
		System.out.println("BMW M4 has been added");
		Bicycle myBicycle = new Bicycle("Bicycle", 2000, 0, "ElectricBike", "Carbon Fibre");
		GarageList.add(myBicycle); 
		System.out.println("This bike has been added");
		Motorcycle myMotorcycle = new Motorcycle("Motorcycle", 2000, 5, "1000cc", "two");
		GarageList.add(myMotorcycle);
				System.out.println("Motorcycle has been added");
	}
	
	public static void removeVehicle() {
		for(int i = 0; i<GarageList.size(); i++) {
			if (GarageList.get(i) instanceof Car) {
				Car name = (Car) GarageList.get(i);
				if (name.getModel() == "BMW M4") {
					GarageList.remove(i);
					System.out.println("BMW M4 Removed");
				}
				else if (name.getModel() == "BMW 4 Series") {
					GarageList.remove(i);
					System.out.println("BMW 4 Series Removed");
				}		
			}
		}
	}
	
	public static void fixVehicle() {
		/*  100 to fix bike 
			500 to fix motorcycle 
			1000 to fix Car
		*/
		int total = 0;
		
		System.out.println("It will cost: \r\n" 
					+ "100 to fix bike \r\n"
					+ "500 to fix motorcycle \r\n"
					+ "1000 to fix Car");
		
		for(int i = 0; i<GarageList.size(); i++) {
			if (GarageList.get(i) instanceof Car) {
				total = total + 1000;
			
			}
			
			else if (GarageList.get(i) instanceof Bicycle) {
				total = total + 100;
				
			}
			
			else if (GarageList.get(i) instanceof Motorcycle) {
				total = total + 500;
				
			}
		}
		System.out.println("Total price for this repair is: " + total);
	}
	
	public static void emptyGarage() {
		System.out.println("The Vehicles that are in the garage are: ");
		for (Vehicles vehicle : GarageList) {
			System.out.println(vehicle.getName());
		}
		GarageList.removeAll(GarageList);
		System.out.println("Removing all vehicles....");
		System.out.println("...");
		System.out.println("There are no vehicles left in the garage.");
		
	}
}
