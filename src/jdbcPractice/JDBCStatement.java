package jdbcPractice;
import java.sql.*;

public class JDBCStatement {

	public static void main(String[] args) throws Exception{
		// Load Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Get Connection
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb", "root", "cdacacts");
		Statement st = con.createStatement();
		String q = "select * from employee";
		ResultSet rs = st.executeQuery(q);
		
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String dep = rs.getString(3);
			int sal = rs.getInt(4);
			String city = rs.getString(5);
			System.out.println(id + name + dep + sal + city);
		}
		con.close();
		
	}

}
