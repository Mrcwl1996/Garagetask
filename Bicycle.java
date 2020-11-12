package garage;

public class Bicycle extends Vehicles {

	private String EnergySource; 
	private String material;
	
	public Bicycle(String name, int price, int cargoSpace, String energySource, String material) {
		super(name, price, cargoSpace);
		EnergySource = energySource;
		this.material = material;
	}
	public String getEnergySource() {
		return EnergySource;
	}
	public void setEnergySource(String energySource) {
		EnergySource = energySource;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	} 
	
	
}
