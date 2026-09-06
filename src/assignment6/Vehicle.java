package assignment6;

public class Vehicle {
	String vehicleNo;
	String brand;
	int days;
	
	Vehicle(String vehicleNo, String brand, int days) {
		this.vehicleNo = vehicleNo;
		this.brand = brand;
		this.days = days;
	}
	
	public void rentPerDay() {
		System.out.println(days * 500);
	}
	
}
