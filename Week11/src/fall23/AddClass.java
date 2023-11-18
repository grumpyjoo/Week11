package fall23;

public class AddClass {
	/*
	 * Student Name: Rachelle Muyargas
	 * Student ID: 4533324
	 * Professor: Sumithra Chandrasekar
	 * 
	 * Topic: Method Overloading
	 * 
	 * */
	
	public void add(int a, int b) {
		int sum1 = a + b;
		System.out.println("C: a + b = "+ sum1);
		
	}
	
	public void add(int a, int b, int c) {
		int sum2 = a + b + c;
		System.out.println("D: a + b + c = " + sum2);
		
	}
	
	public void add() {
		System.out.println("Addition");
		System.out.println("--------");
	}
	
	public static void main(String[] args) {
		AddClass x = new AddClass();
		x.add();
		x.add(5, 6);
		x.add(1, 2, 3);
	}

}
