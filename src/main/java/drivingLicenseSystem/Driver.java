package drivingLicenseSystem;

public class Driver {
	public static void main(String[] args) {
		GenericDriver tom = new GenericDriver("Tom", true);
		tom.deduct(3);
		tom.setMedicalReport();
		CommercialDriver lily = new CommercialDriver("Lily", false, "inflammable", "Truck");
		lily.deduct(5);
		lily.setMedicalReport();

		GenericDriver[] driverArray = new GenericDriver[2];
		driverArray[0] = tom;
		driverArray[1] = lily;
		for (int i=0; i<driverArray.length; i++){
			if (driverArray[i].getIsProvisional()){
				System.out.println(driverArray[i].getName() + "'s license is provisional");
			}else{
				System.out.println(driverArray[i].getName() + "'s license is not provisional");
			}
			System.out.println(driverArray[i].getName() + " has " + driverArray[i].getPoints() + " points");
			System.out.println(driverArray[i].getMedicalReport());
		}

	}
}

