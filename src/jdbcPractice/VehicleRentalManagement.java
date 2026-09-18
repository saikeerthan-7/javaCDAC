package jdbcPractice;

import java.sql.*;
import java.util.*;

public class VehicleRentalManagement {
	Connection con;
	Scanner s = new Scanner(System.in);

	public VehicleRentalManagement() throws SQLException {
		String url="jdbc:mysql://localhost:3306/pgcpac";
		String username="root";
		String password="cdacacts";
		con = DriverManager.getConnection(url,username,password);
	}
	
	public void addVehicle() {
		try {
			String q = "insert into vehicle values(?,?,?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(q);
			System.out.println("ENter Vehicle ID");
			int id = s.nextInt();
			s.nextLine();
			System.out.println("Enter Vehicle Number");
			String vNo = s.nextLine();
			System.out.println("Enter Vehicle Model : ");
			String vModel = s.nextLine();
			System.out.println("Enter Vehicle Type : ");
			String vType = s.nextLine();
			System.out.println("Enter Rental Rate ");
			double rentalRate = s.nextDouble();
			System.out.println("Available Days ");
			int availDays = s.nextInt();
			s.nextLine();
			System.out.println("ENter Status ");
			String status = s.nextLine();
			
			pst.setInt(1, id);
			pst.setString(2, vNo);
			pst.setString(3, vModel);
			pst.setString(4, vType);
			pst.setDouble(5, rentalRate);
			pst.setInt(6, availDays);
			pst.setString(7, status);
			pst.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateVehicle() {
		try {
			System.out.println("ENter Vehicle ID");
			int id = s.nextInt();
			
			String q = "update vehicle set vehicle_model = ?, rental_rate = ?, available_days = ?, status = ?";
			PreparedStatement pst = con.prepareStatement(q);
			
			System.out.println("Enter Vehicle Model : ");
			String vModel = s.nextLine();
			System.out.println("Enter Rental Rate ");
			double rentalRate = s.nextDouble();
			System.out.println("Available Days ");
			int availDays = s.nextInt();
			s.nextLine();
			System.out.println("ENter Status ");
			String status = s.nextLine();
			pst.setString(1, vModel);
			pst.setDouble(2, rentalRate);
			pst.setInt(3, availDays);
			pst.setString(4, status);
			pst.execute();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public void deleteVehicle() {
		try {
			System.out.println("Enter vehicle ID : ");
			int id = s.nextInt();
			String q = "delete from vehicle where vehicle_id = ?";
			PreparedStatement pst = con.prepareStatement(q);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
}
