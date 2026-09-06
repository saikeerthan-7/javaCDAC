package assignment4;

public class ElectricityBill {
	int consumerNo;
	String consumerName;
	float units;
	public ElectricityBill(int consumerNo, String consumerName, float units) {
		this.consumerNo = consumerNo;
		this.consumerName = consumerName;
		this.units = units;
	}
	
	public void display() {
		System.out.println("Consumer No   : " + consumerNo);
		System.out.println("Consumer Name : " + consumerName);
		System.out.println("No. of Units  : " + units);
		System.out.println("Total Bill    : " + calculateBill(units));
		
	}

	 float calculateBill(float units) {
		if(units >= 0 && units <= 100) {
			return 2 * units;
		}
		else if(units > 100 && units <= 200) {
			return 3 * units;
		}
		else if(units > 200 && units <= 300) {
			return 5 * units;
		}
		else {
			return 7 * units;
		}
	
	}
	
	
}
