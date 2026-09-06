package assignment4;

public class ElectricityBillDemo {

	public static void main(String[] args) {
		ElectricityBill e1 = new ElectricityBill(123021, "Keerthan", 250);
		ElectricityBill e2 = new ElectricityBill(123022, "Nitin", 350);
		ElectricityBill e3 = new ElectricityBill(123023, "Sai", 120);
		ElectricityBill e4 = new ElectricityBill(123024, "AA", 99);
		ElectricityBill e5 = new ElectricityBill(123025, "NTR", 230);
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();

	}

}
