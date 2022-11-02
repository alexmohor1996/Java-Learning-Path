package timeAdder;

public class Driver {
	public static void main(String[] args) {
		double charge = TicketSystem.getCharge(Location.SUNNYCITY, false, 2);
		System.out.println(charge);

		charge = TicketSystem.getCharge(Location.GLORIOUSLAKE, true, 5);
		System.out.println(charge);

	}
}

