package solarToyCar;

public class Driver {
	public static void main(String[] args) {
		SolarToyCar myCar = new SolarToyCar();
		System.out.println(myCar.getBatteryLevel());
		myCar.turn(Direction.RIGHT, 45);
		System.out.println(myCar.getBatteryLevel());
		myCar.forward(30.0);
		System.out.println(myCar.getBatteryLevel());
		myCar.turnWithSolarEnergy(20.0);
		System.out.println(myCar.getBatteryLevel());
		myCar.moveWithSolarEnergy(100.0);
		System.out.println(myCar.getBatteryLevel());
		myCar.chargeBattery();
	}
}
