package GiftboxWeightChecker;

import java.util.*;
public class GiftBox {
	private List<Biscuits> biscuitsSet;
	private List<Chocolate> chocolateSet;
	private double weight;
	public GiftBox(double[] biscuitsWeights, double[] chocolatesWeights, String[] chocolatesFlavor){
		biscuitsSet = new ArrayList<>();
		chocolateSet = new ArrayList<>();
		for (int i=0; i<biscuitsWeights.length; i++){
			Biscuits pack = new Biscuits(biscuitsWeights[i]);
			biscuitsSet.add(pack);
			weight += pack.getWeight();
		}
		for (int i=0; i<chocolatesWeights.length; i++){
			Chocolate pack = new Chocolate(chocolatesWeights[i], chocolatesFlavor[i]);
			chocolateSet.add(pack);
			weight += pack.getWeight();
		}
	}

	public int getNumBiscuits(){
		return biscuitsSet.size();
	}

	public int getNumChocolates(){
		return chocolateSet.size();
	}
	public double getWeight(){
		return weight;
	}
	public void showBiscuitsWeight(){
		for (Biscuits biscuit : biscuitsSet){
			System.out.println(biscuit.getWeight() + " ");
		}
	}
	public void showChocolatesWeight(){
		for (Chocolate chocolate : chocolateSet){
			System.out.println(chocolate.getWeight() + " ");
		}
	}

	public void showChocolateFlavors(){
		for (Chocolate chocolate : chocolateSet){
			System.out.println(chocolate.getFlavor() + " ");
		}
	}
}