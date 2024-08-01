package demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class createtable {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Sardarbalu@123");
		Statement st=con.createStatement();
		st.execute("create table employee(id int,name varchar(50),role varchar(40),yoe int, salary double)");
		System.out.println("database created successfully");

	}
		
}
