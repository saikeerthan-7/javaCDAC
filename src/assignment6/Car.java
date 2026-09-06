package assignment6;


public class Car extends Vehicle{
	int noOfSeats;

	public Car(String vehicleNo, String brand, int days, int noOfSeats) {
		super(vehicleNo, brand, days);
		this.noOfSeats = noOfSeats;
	}
	
	@Override
	public void rentPerDay() {
		 if(noOfSeats == 2) {
			 System.out.println("Total Rent : " + (days * 1000 + 150));
		 }
		 if(noOfSeats == 4) {
			 System.out.println("Total Rent : " + (days * 1500 + 300));
		 }
	}
	public void displayRentDetails() {
		System.out.println("Vehicle Number : " + vehicleNo);
		System.out.println("Brand : " + brand);
		System.out.println("Number Of Seats : " + noOfSeats);
		rentPerDay();
	}
	public static void main(String[] args) {
		Car c1 = new Car("AP40 SK 1417", "BMW", 7, 2);
		c1.displayRentDetails();
		
	}
}
