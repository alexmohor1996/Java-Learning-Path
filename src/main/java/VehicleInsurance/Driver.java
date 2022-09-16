package VehicleInsurance;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		System.out.println("Enter your vehicle type: ");
		System.out.println("Car, Truck, Bus, Motorcycle");
		Scanner scan = new Scanner(System.in);
		String type = scan.nextLine();
		int premium = 0;
		switch(type){
			case "car":
				premium = 200;
				break;
			case "truck":
				premium = 300;
				break;
			case "bus":
				premium = 400;
				break;
			case "motorcycle":
				System.out.println("Enter your motorcycle type: ");
				System.out.println("1 (low power), 2 (medium), 3 (high)");
				String motorCycleType = scan.nextLine();
				int motorCycleInt = Integer.parseInt(motorCycleType);
				switch (motorCycleInt) {
					case 1 -> premium = 300;
					case 2 -> premium = 400;
					case 3 -> premium = 500;
					default -> System.out.println("Unknown vehicle type");
				}
				break;
			default:
				System.out.println("Unknown vehicle type");
		}
		scan.close();
		System.out.println("The premium is $" + premium);
	}

}
