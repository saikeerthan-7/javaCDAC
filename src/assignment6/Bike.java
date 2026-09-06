package assignment6;

public class Bike extends Vehicle{
	int helmetCount;

	public Bike(String vehicleNo, String brand, int days, int helmetCount) {
		super(vehicleNo, brand, days);
		this.helmetCount = helmetCount;
	}
	
	public void rentPerDay() {
		 if(helmetCount == 1) {
			 System.out.println("Total Rent : " + (days * 700 + 50));
		 }
		 if(helmetCount == 2) {
			 System.out.println("Total Rent : " + (days * 800 + 100));
		 }
	}
	public void displayRentDetails() {
		System.out.println("Vehicle Number : " + vehicleNo);
		System.out.println("Brand : " + brand);
		System.out.println("Number Of Helmets : " + helmetCount);
		rentPerDay();
	}
	public static void main(String[] args) {
		Bike b1 = new Bike("AP40 SK 1414", "Royal Enfield", 5, 2);
		b1.displayRentDetails();
	}

}
