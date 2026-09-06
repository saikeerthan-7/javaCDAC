package assignment6;

public class TravelBookingDemo {
	public static void main(String[] args) {
		TravelBooking b = new BusBooking(101, "Keerthan", "Bengaluru", "Rayachoti", 210,"Sleeper", 14);
		System.out.println(b.calculateFare());
		
		TravelBooking b1 = new TrainBooking(101, "Keerthan", "Bengaluru", "Rayachoti", 210, 2345, "2A");
		System.out.println(b1.calculateFare());
	};
}
