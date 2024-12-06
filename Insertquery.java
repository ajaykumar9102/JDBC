package in.util.query;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import in.util.jdbc.Conn1;

public class Insertquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		try {
			connection=Conn1.getjdbcconnection();
			if(connection!=null) {
				String muquery="insert into student(id,name,age) values(1,'ajay',23)";
				statement=connection.createStatement();
				int num=statement.executeUpdate(muquery);
				if(num==1) {
					System.out.println("row inserted");
					
				}else {
					System.out.println("not inserted");
				}
			}
		} catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				Conn1.closeresource(connection, statement);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}

}
