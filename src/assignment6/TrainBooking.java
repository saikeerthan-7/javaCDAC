package assignment6;

public class TrainBooking extends TravelBooking{
	int trainNumber;
	String coachType;
	public TrainBooking(int bookingId, String passengerName, String source, String destination, float distance,int trainNumber, String coachType) {
		super(bookingId, passengerName, source, destination, distance);
		this.trainNumber = trainNumber;
		this.coachType = coachType;
	}
	double calculateFare(float distance, int seat, String coachType) {
		if(coachType.equalsIgnoreCase("3A")) {
			return distance*10;
		}
		else if(coachType.equalsIgnoreCase("2A")) {
				return distance*7;
			}
		else if(coachType.equalsIgnoreCase("Sleeper")) {
			return distance * 3;
		}
		return distance * 2;
		
	}

	
}
