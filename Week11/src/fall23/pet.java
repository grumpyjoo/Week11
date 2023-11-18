package fall23;

class cat {
	/*
	 * Student Name: Rachelle Muyargas
	 * Student ID: 4533324
	 * Professor: Sumithra Chandrasekar
	 * 
	 * Topic: Method Overriding
	 * 
	 * */
	
	public void milk(String color, int price) {
		System.out.println("Cat color is " + color);
		System.out.println("Cat price is " + price);
	}
}

public class pet extends cat{
	public void milk(String color, int price) {
		System.out.println("\nPet color is " + color);
		System.out.println("Pet price is " + price);
	}
	
	public static void main(String[] args) {
		cat c = new cat();
		c.milk("yellow", 25);
		
		pet p = new pet();
		p.milk("black", 30);
	}
}
 