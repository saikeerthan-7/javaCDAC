package assignment2;

public class ElectricityBillCal {
	
	public static double calculateBill(int units) {
		double bill = 0;
		if(units >= 0 && units <= 100) {
			bill = 2 * units;
		}
		else if(units > 100 && units <= 200) {
			bill = 3 * units;
		}
		else if(units > 200 && units <= 300) {
			bill = 5 * units;
		}
		else if(units > 300) {
			bill = 7 * units;
		}
		return bill;
	}

	public static void main(String[] args) {
		double bill = calculateBill(250);
		System.out.println("Electricity Bill : "+bill);
	}

}
