package AverageStockPrice;

public class Stock {

	private int shares;
	private double price;
	private double capital;

	public void buy(double p, int s){
		shares += s;
		price = p;
		capital += p * s;
	}

	public void sell(double p, int s){
		shares -= s;
		price = p;
		capital -= p * s;
	}

	public int getShares(){
		return shares;
	}

	public double getPrice(){
		return price;
	}

	public double getAveragePrice(){
		return capital / shares;
	}

}

