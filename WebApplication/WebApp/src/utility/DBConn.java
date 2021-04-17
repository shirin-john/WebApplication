package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	static Connection conn;
	
	public static Connection getMySqlConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp", "root", "shirinjhn");	
		return conn;
	}

}
