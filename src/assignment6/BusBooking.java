package assignment6;

public class BusBooking extends TravelBooking{
	
	String busType;
	int seatNo;

	BusBooking(int bookingId, String passengerName, String source, String destination, float distance, String busType, int seatNo) {
		super(bookingId, passengerName, source, destination, distance);
		this.busType = busType;
		this.seatNo = seatNo;
	}



	//	@Override
	double calculateFare() {
		if(busType.equalsIgnoreCase("Sleeper")) {
				return distance*3;
		}
		return distance*2;

	}
}		
	

