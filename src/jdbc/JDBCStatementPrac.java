package jdbc;
import java.sql.*;

public class JDBCStatementPrac {

	public static void main(String[] args) throws Exception{
		// 1. Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Get Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","Saikeerthan@123");
		// Create Statement
		Statement st = con.createStatement();
		// Create Query
		String q = "select * from student";
		// Execute Query
		ResultSet rs = st.executeQuery(q);
		//Iterate the Result Set
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int marks = rs.getInt(3);
			String course = rs.getString(4);
			System.out.println(id + "--->" + name + "--->" + marks + "-->" + course);
		}
		con.close();
		
		
		
	}

}
