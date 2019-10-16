package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
	static Connection con;

	public static Connection connectDatabase() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "");
			return con;
		} catch (Exception e) {
			System.out.println("Exception in databnase"+e);
			e.printStackTrace();
		}
		return con;

	}
}
