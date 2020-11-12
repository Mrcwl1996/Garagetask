package garage;

import garage.Vehicles;

public class Vehicles {

	protected String name;
	protected int price;
	protected int cargoSpace;
	
	
	public Vehicles(String name, int price, int cargoSpace) {
		super();
		this.name = name;
		this.price = price;
		this.cargoSpace = cargoSpace;
	}
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCargoSpace() {
		return cargoSpace;
	}
	public void setCargoSpace(int cargoSpace) {
		this.cargoSpace = cargoSpace;
	}
	
	
}
