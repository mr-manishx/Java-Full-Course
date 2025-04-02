package ai.indxo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MySQLConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// create the connection object
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_lr", "root", "iesbpl@2024");
			// create the statement object
			PreparedStatement prepareStatement = connection.prepareStatement("insert into employee values(?, ?, ?)");
			
			prepareStatement.setInt(1, 1);
			prepareStatement.setString(2, "Martin");
			prepareStatement.setInt(3, 34);
			
			// executeUpdate query
			int i = prepareStatement.executeUpdate();
			
			if(i > 0) {
				System.out.println("A new row was inserted successfully");
			}
			else {
				System.out.println("Failed data insertion");
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error: data insertion failed "+e.getMessage());
		}

	}

}
