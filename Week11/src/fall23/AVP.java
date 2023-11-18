package fall23;

abstract class employees{
	/*
	 * Student Name: Rachelle Muyargas
	 * Student ID: 4533324
	 * Professor: Sumithra Chandrasekar
	 * 
	 * Topic: Abstraction
	 * 
	 * */
	public abstract void salary_calculation(double pay);
	public abstract void tax(double tx);
	public abstract void calculation(double pay, double tx);
}

public class AVP extends employees {
	public void salary_calculation(double pay) {
		System.out.println("The salary of employee " +  "$" + pay);
	}
	
	public void tax(double tx) {
		System.out.println("Tax for earning above 449,231 up to $1,50,000 are taxed " + tx + "%");
	}
	
	public void calculation(double pay, double tx) {
		double calc = pay - (pay * tx);
		System.out.println("\nTotal salary is " + "$" + calc);
	}
	
	
	public static void main(String[] args) {
		AVP z = new AVP();
		z.salary_calculation(550_000);
		
		AVP t = new AVP();
		t.tax(0.116);
		
		AVP y = new AVP();
		y.calculation(550_000, 0.116);
	}
}
