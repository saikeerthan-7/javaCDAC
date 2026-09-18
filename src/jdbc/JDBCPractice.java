package jdbc;
import java.sql.*;
public class JDBCPractice {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/companydb","root", "cdacacts");
		
		Statement st = con.createStatement();
		String str = "select * from employee";
		ResultSet rs = st.executeQuery(str);
		while(rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String dep = rs.getString(3);
			int sal = rs.getInt(4);
			System.out.println(id + name + dep + sal);

	}

}
}