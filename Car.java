package garage;

public class Car extends Vehicles {
	
	private String model;
	private String fuelType;
	
	
	public Car(String name, int price, int cargoSpace, String model, String fuelType) {
		super(name, price, cargoSpace);
		this.model = model;
		this.fuelType = fuelType;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	
	
}
