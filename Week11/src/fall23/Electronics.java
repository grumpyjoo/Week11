package fall23;

class Mobile { 
	/*
	 * Student Name: Rachelle Muyargas
	 * Student ID: 4533324
	 * Professor: Sumithra Chandrasekar
	 * 
	 * Topic: Method Overriding
	 * 
	 * */
	
	public void processor(String memory) { 
		System.out.println("Mobile Processor Details " + memory);
	}
}


public class Electronics extends Mobile{ //create object for Electronics
	public void processor(String memory) {
		System.out.println("Laptop Processor Details " + memory);
	}
	
	public static void main(String[] args) {
		Mobile z = new Mobile();
		z.processor("32gb");
				
		Electronics y = new Electronics();
		y.processor("64gb");
		
	}
}