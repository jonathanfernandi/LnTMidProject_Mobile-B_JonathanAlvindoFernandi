package program;

public abstract class Type {
	
	protected String type, brand, name, license, subtype;
	protected Integer topSpeed, gasCapacity, wheel;

	public Type(String type, String brand, String name, String license, Integer topSpeed, Integer gasCapacity, Integer wheel, String subtype) {
		this.type = type;
		this.brand = brand;
		this.name = name;
		this.license = license;
		this.topSpeed = topSpeed;
		this.gasCapacity = gasCapacity;
		this.wheel = wheel;
		this.subtype = subtype;
	}

}
