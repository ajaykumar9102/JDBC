package in.util.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Conn1 {
	public static Connection getjdbcconnection() throws IOException, SQLException {
		FileInputStream fis=new FileInputStream("Application.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String user=p.getProperty("user");
		String password=p.getProperty("password");
		Connection connection=DriverManager.getConnection(url, user, password);
		return connection;
	}
	public static void closeresource(Connection connection,Statement statement) throws SQLException {
		if(connection!=null) {
			connection.close();
			if(statement!=null) {
				statement.close();
			}
		}
		
	}

}
