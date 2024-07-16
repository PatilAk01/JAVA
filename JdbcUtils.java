package Day1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	public static Connection buildConnection() throws Exception{
		String connectionURL = "jdbc:mysql://localhost:3306/webcdac?useSSL=false";
		String userId = "root";
		String password = "Patil@01";
		Connection dbConnection=DriverManager.getConnection(connectionURL, userId, password);
		return dbConnection;
	}

}
	
