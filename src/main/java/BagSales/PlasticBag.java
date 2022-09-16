package BagSales;

public class PlasticBag extends Bag{
	private double tax;
	public void setTax(double tax){
		this.tax = tax;
	}
	public double getTax(){
		return tax;
	}
	public double getPrice(){
		double area = getLength() * getWidth();
		if (area > 250) { price = 0.3; }
		else {price = 0.2;}
		return price + tax;
	}

}

