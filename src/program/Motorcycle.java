package program;

import java.util.Scanner;

public class Motorcycle extends Type {

	private Integer helmet, helmetPrice = 0;

	public Motorcycle(String type, String brand, String name, String license, Integer topSpeed, Integer gasCapacity, Integer wheel, String subtype, Integer helmet) {
		super(type, brand, name, license, topSpeed, gasCapacity, wheel, subtype);
		this.helmet = helmet;
	}
	
	public void standing() {
		try {
			Thread.sleep(1000);
			System.out.println(super.name + " is standing!");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void price() {
		Scanner scan = new Scanner(System.in);
		
		while (helmetPrice == 0) {
			System.out.print("Input helmet price: ");
			int motorcycleHelmetPrice = scan.nextInt();
			scan.nextLine();
			
			if(motorcycleHelmetPrice >= 0) {
				helmetPrice = motorcycleHelmetPrice;
				break;
			}
			
		}
		System.out.println("Price: " + helmetPrice);
	}

}
