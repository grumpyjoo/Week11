package fall23;

public class Vehicle {
	/*
	 * Student Name: Rachelle Muyargas
	 * Student ID: 4533324
	 * Professor: Sumithra Chandrasekar
	 * 
	 * Topic: Method Overloading
	 * 
	 * */
				
	  
	public void car(int price, String model){ //pass the parameter for the 1st function with 2 arguments
		System.out.println("Car Details");
		System.out.println("-----------");
		System.out.println("Price of the car " + price);
		System.out.println("Car's model number " + model);
	}
	
	//with same function name
	public void car() { //2nd function with no arguments
		System.out.println("Welcome to Toyota");
	}

	public static void main(String[] args) {
		Vehicle z = new Vehicle(); //to allocate memory
		z.car(); //it will access the 2nd function since it is empty and print Welcome to Toyota
		z.car(1500, "CX30");
	}
}


