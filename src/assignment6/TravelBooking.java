package assignment6;

public class TravelBooking {
	int bookingId;
	String passengerName;
	String source;
	String destination;
	float distance;
	
	
	public TravelBooking(int bookingId, String passengerName, String source, String destination, float distance) {
		this.bookingId = bookingId;
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
		this.distance = distance;
	}


	double calculateFare() {
		return distance * 35;
	}
	
	
	

}
