package ai.indxo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetriveData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_lr", "root", "iesbpl@2024");
		
		PreparedStatement ps = connection.prepareStatement("select *from employee");
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			
		}
		
	}

}
