package bagSales;

public class Driver {
	public static void main(String[] args) {
		PaperBag paperBag = new PaperBag();
		paperBag.setLength(10.0);
		paperBag.setWidth(23.0);
		System.out.println(paperBag.getPrice());

		PlasticBag plasticBag = new PlasticBag();
		plasticBag.setLength(15.0);
		plasticBag.setWidth(40.0);
		plasticBag.setTax(0.25);
		System.out.println(plasticBag.getPrice());
	}
}

