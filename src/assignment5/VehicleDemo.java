package assignment5;

public class VehicleDemo {
	public static void main(String[] args) {
		Car c1=new Car(7185,"Nitin",75000,4,"Fetrol");
		c1.display();
		
		Car c2=new Car(7195,"Shakalaka Sai",85000,2,"Pitrol");
		c2.display();
		
		
		Bike b1=new Bike(8169,"Swaroop",60000,125,true);
		b1.display();
	}
}
