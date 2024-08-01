package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Batchprocessps {
	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university","root","Sardarbalu@123");
		PreparedStatement ps=con.prepareStatement("insert into employee(id,name,role,yoe,salary) values(?,?,?,?,?)");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("Enter id ");
			int id=sc.nextInt();
			System.out.println("Enter name ");
			String name=sc.next();
			System.out.println("Enter role ");
			String role=sc.next();
			System.out.println("Enter yoe ");
			int yoe=sc.nextInt();
			System.out.println("Enter salary ");
			Double salary=sc.nextDouble();
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, role);
			ps.setInt(4, yoe);
			ps.setDouble(5, salary);
			ps.addBatch();	
		}
		ps.executeBatch();
		con.close();
	}

}

