package program;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void clearScreen() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> typeList = new ArrayList<>();
		ArrayList<String> nameList = new ArrayList<>();
		
		ArrayList<String> brandList = new ArrayList<>();
		ArrayList<String> licenseList = new ArrayList<>();
		ArrayList<Integer> topSpeedList = new ArrayList<>();
		ArrayList<Integer> gasCapacityList = new ArrayList<>();
		ArrayList<Integer> wheelList = new ArrayList<>();
		ArrayList<String> subtypeList = new ArrayList<>();
		
		ArrayList<Integer> carEntertainmentSystemList = new ArrayList<>();
		
		ArrayList<Integer> motorcycleHelmetList = new ArrayList<>();
		
		int menu = 0;
		while ((menu < 1) || (menu > 3)) {
			clearScreen();
			
			System.out.println("Main Menu");
			System.out.println("1. Input Menu");
			System.out.println("2. View Menu");
			System.out.println("3. Exit Program");
			System.out.print("Choose menu [1 | 2 | 3]: ");
			menu = scan.nextInt();
			scan.nextLine();
			
			switch (menu) {
				case 1: {
					clearScreen();
					
					String type = null;
					int validateType = 1;
					while(validateType == 1) {
						System.out.print("Input type [Car | Motorcycle]: ");
						String vehicleType = scan.nextLine();
						
						if (vehicleType.equals("Car") || vehicleType.equals("Motorcycle")) {
							type = vehicleType;
							break;
						}
					}
					
					String brand = null;
					int validateBrand = 1;
					while(validateBrand == 1) {
						System.out.print("Input brand [>= 5]: ");
						String vehicleBrand = scan.nextLine();
						
						if (vehicleBrand.length() >= 5) {
							brand = vehicleBrand;
							break;
						}
					}
					
					String name = null;
					int validateName = 1;
					while(validateName == 1) {
						System.out.print("Input name[>= 5]: ");
						String vehicleName = scan.nextLine();
						
						if (vehicleName.length() >= 5) {
							name = vehicleName;
							break;
						}
					}
					
					String license = null;
					int validateLicense = 1;
					while(validateLicense == 1) {
						System.out.print("Input license: ");
						String vehicleLicense = scan.nextLine();
						
						if ((vehicleLicense.matches("[A-Z] \\d [A-Z]") || vehicleLicense.matches("[A-Z] \\d [A-Z][A-Z]") || vehicleLicense.matches("[A-Z] \\d [A-Z][A-Z][A-Z]")) || (vehicleLicense.matches("[A-Z] \\d\\d [A-Z]") || vehicleLicense.matches("[A-Z] \\d\\d [A-Z][A-Z]") || vehicleLicense.matches("[A-Z] \\d\\d [A-Z][A-Z][A-Z]")) || (vehicleLicense.matches("[A-Z] \\d\\d\\d [A-Z]") || vehicleLicense.matches("[A-Z] \\d\\d\\d [A-Z][A-Z]") || vehicleLicense.matches("[A-Z] \\d\\d\\d [A-Z][A-Z][A-Z]")) || (vehicleLicense.matches("[A-Z] \\d\\d\\d\\d [A-Z]") || vehicleLicense.matches("[A-Z] \\d\\d\\d\\d [A-Z][A-Z]") || vehicleLicense.matches("[A-Z] \\d\\d\\d\\d [A-Z][A-Z][A-Z]"))) {
							license = vehicleLicense;
							break;
						}
					}
					
					Integer topSpeed = 100;
					while(topSpeed == 100) {
						System.out.print("Input top speed [100 <= topSpeed <= 250]: ");
						int vehicleTopSpeed = scan.nextInt();
						scan.nextLine();
						
						if ((vehicleTopSpeed >= 100) && (vehicleTopSpeed <= 250)) {
							topSpeed = vehicleTopSpeed;
							break;
						}
					}
					
					Integer gasCapacity = 30;
					while(gasCapacity == 30) {
						System.out.print("Input gas capacity [30 <= gasCap <= 60]: ");
						int vehicleGasCapacity = scan.nextInt();
						scan.nextLine();
						
						if ((vehicleGasCapacity >= 30) && (vehicleGasCapacity <= 60)) {
							gasCapacity = vehicleGasCapacity;
							break;
						}
					}
					
					Integer wheel = 0, entertainmentSystem = 1, helmet = 1;
					String subtype = null;
					switch (type) {
						case "Car": {
							wheel = 4;
							while(wheel == 4) {
								System.out.print("Input wheel [4 <= wheel <= 6]: ");
								int vehicleWheel = scan.nextInt();
								scan.nextLine();
								
								if ((vehicleWheel >= 4) && (vehicleWheel <= 6)) {
									wheel = vehicleWheel;
									break;
								}
							}
							
							int validateCarType = 1;
							while(validateCarType == 1) {
								System.out.print("Input type [SUV | Supercar | Minivan]: ");
								String carSubtype = scan.nextLine();
								
								if (carSubtype.equals("SUV") || carSubtype.equals("Supercar") || carSubtype.equals("Minivan")) {
									subtype = carSubtype;
									break;
								}
							}
							
							while(entertainmentSystem == 1) {
								System.out.print("Input entertainment system amount [>= 1]: ");
								int carEntertainmentSystem = scan.nextInt();
								scan.nextLine();
								
								if (carEntertainmentSystem >= 1) {
									entertainmentSystem = carEntertainmentSystem;
									break;
								}
							}
							
							break;
						}
							
						case "Motorcycle": {
							wheel = 2;
							while(wheel == 2) {
								System.out.print("Input wheel [2 <= wheel <= 3]: ");
								int vehicleWheel = scan.nextInt();
								scan.nextLine();
								
								if ((vehicleWheel >= 2) && (vehicleWheel <= 3)) {
									wheel = vehicleWheel;
									break;
								}
							}
							
							int validateMotorcycleType = 1;
							while(validateMotorcycleType == 1) {
								System.out.print("Input type [Automatic | Manual]: ");
								String motorcycleSubtype = scan.nextLine();
								
								if (motorcycleSubtype.equals("Automatic") || motorcycleSubtype.equals("Manual")) {
									subtype = motorcycleSubtype;
									break;
								}
							}
							
							while(helmet == 1) {
								System.out.print("Input helmet amount [>= 1]: ");
								int motorcycleHelmet = scan.nextInt();
								scan.nextLine();
								
								if (motorcycleHelmet >= 1) {
									helmet = motorcycleHelmet;
									break;
								}
							}
							
							break;
						}
							
					}
					
					typeList.add(type);
					nameList.add(name);
					
					brandList.add(brand);
					licenseList.add(license);
					topSpeedList.add(topSpeed);
					gasCapacityList.add(gasCapacity);
					wheelList.add(wheel);
					subtypeList.add(subtype);
					
					carEntertainmentSystemList.add(entertainmentSystem);
					
					motorcycleHelmetList.add(helmet);
					
					System.out.print("ENTER to return ");
					scan.nextLine();
					
					menu = 0;
					break;
				}
				
				case 2: {
					if(typeList.size() == 0) {
						clearScreen();
						
						System.out.println("No vehicle data is available!");
						
						System.out.print("\nENTER to return");
						scan.nextLine();
					} else {
						int vehicleNumber = 1;
						while (vehicleNumber == 1) {
							clearScreen();
							
							System.out.println("|-----|---------------|---------------|");
							System.out.println("|No   |Type           |Name           |");
							System.out.println("|-----|---------------|---------------|");
							for (int i = 0; i < typeList.size(); i++) {
								System.out.printf("|%-5d|%-15s|%-15s|\n", (i + 1), typeList.get(i), nameList.get(i));
							}
							System.out.println("|-----|---------------|---------------|");
							System.out.println("|-----|---------------|---------------|");
							System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: ");
							vehicleNumber = scan.nextInt();
							scan.nextLine();
							
							if (vehicleNumber == 0) {
								break;
							} else if ((vehicleNumber >= 1) && (vehicleNumber <= typeList.size())) {
								clearScreen();
								
								if(typeList.get(vehicleNumber - 1).equals("Car")) {
									System.out.println("Brand: " + brandList.get(vehicleNumber - 1));
									System.out.println("Name: " + nameList.get(vehicleNumber - 1));
									System.out.println("License Plate: " + licenseList.get(vehicleNumber - 1));
									System.out.println("Type : " + subtypeList.get(vehicleNumber - 1));
									System.out.println("Gas Capacity : " + gasCapacityList.get(vehicleNumber - 1));
									System.out.println("Top Speed: " + topSpeedList.get(vehicleNumber - 1));
									System.out.println("Wheel(s): " + wheelList.get(vehicleNumber - 1));
									System.out.println("Entertainment System: " + carEntertainmentSystemList.get(vehicleNumber - 1));
									
									Car car = new Car(typeList.get(vehicleNumber - 1), brandList.get(vehicleNumber - 1), nameList.get(vehicleNumber - 1), licenseList.get(vehicleNumber - 1), topSpeedList.get(vehicleNumber - 1), gasCapacityList.get(vehicleNumber - 1), wheelList.get(vehicleNumber - 1), subtypeList.get(vehicleNumber - 1), carEntertainmentSystemList.get(vehicleNumber - 1));
									car.carEntertainmentSystem();
									if (subtypeList.get(vehicleNumber - 1).equals("Supercar")) {
										car.nitro();
									}
								} else {
									System.out.println("Brand: " + brandList.get(vehicleNumber - 1));
									System.out.println("Name: " + nameList.get(vehicleNumber - 1));
									System.out.println("License Plate: " + licenseList.get(vehicleNumber - 1));
									System.out.println("Type : " + subtypeList.get(vehicleNumber - 1));
									System.out.println("Gas Capacity : " + gasCapacityList.get(vehicleNumber - 1));
									System.out.println("Top Speed: " + topSpeedList.get(vehicleNumber - 1));
									System.out.println("Wheel(s): " + wheelList.get(vehicleNumber - 1));
									System.out.println("Helmet: " + motorcycleHelmetList.get(vehicleNumber - 1));
									
									Motorcycle motorcycle = new Motorcycle(typeList.get(vehicleNumber - 1), brandList.get(vehicleNumber - 1), nameList.get(vehicleNumber - 1), licenseList.get(vehicleNumber - 1), topSpeedList.get(vehicleNumber - 1), gasCapacityList.get(vehicleNumber - 1), wheelList.get(vehicleNumber - 1), subtypeList.get(vehicleNumber - 1), motorcycleHelmetList.get(vehicleNumber - 1));
									motorcycle.standing();
									motorcycle.price();
								}
								
								System.out.print("ENTER to return ");
								scan.nextLine();
							} else {
								clearScreen();
								
								System.out.println("Vehicle " + vehicleNumber + " is not available!");
								System.out.print("ENTER to return ");
								scan.nextLine();
							}
							
						}
					}
					
					menu = 0;
					break;
				}
				
				case 3: {
					clearScreen();
					System.out.print("ENTER to exit program ");
					if (scan.hasNextLine()) {
						clearScreen();
						
						System.out.print("Exiting program");
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
					} else {
						menu = 0;
					}
					
					break;
				}
			}
			
		}

	}

}
