package program;

public class Car extends Type {
	
	private Integer entertainmentSystem;

	public Car(String type, String brand, String name, String license, Integer topSpeed, Integer gasCapacity, Integer wheel, String subtype, Integer entertainmentSystem) {
		super(type, brand, name, license, topSpeed, gasCapacity, wheel, subtype);
		this.entertainmentSystem = entertainmentSystem;
	}
	
	public void carEntertainmentSystem() {
		System.out.print("Turning on entertainment system");
		for (int i = 0; i < 4; i++) {
			try {
				Thread.sleep(1000);
				if(i < 3) {
					System.out.print(" .");
				} else {
					System.out.println();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void nitro() {
		try {
			Thread.sleep(1000);
			System.out.println("Boosting!");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
