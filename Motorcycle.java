package garage;

public class Motorcycle extends Vehicles{
	
	private String engineSize;
	private String numOfWheels;
	
	
	public Motorcycle(String name, int price, int cargoSpace, String engineSize, String numOfWheels) {
		super(name, price, cargoSpace);
		this.engineSize = engineSize;
		this.numOfWheels = numOfWheels;
	}


	public String getEngineSize() {
		return engineSize;
	}


	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}


	public String getNumOfWheels() {
		return numOfWheels;
	}


	public void setNumOfWheels(String numOfWheels) {
		this.numOfWheels = numOfWheels;
	}
	
	
	
}
