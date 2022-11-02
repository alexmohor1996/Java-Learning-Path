package branchSalesPerformance;

import java.io.File;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter file name, including extension: ");
		String filename = scan.nextLine();
		scan.close();

		File myFile = new File(filename);
		scan = new Scanner(myFile);
		double yearlySum = 0;
		double[] quarterlySum = new double[4];
		int count = 0;
		while(scan.hasNextDouble()){
			double sales = scan.nextDouble();

		}
	}
}

