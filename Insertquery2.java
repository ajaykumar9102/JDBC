package in.util.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.util.jdbc.Conn2;

public class Insertquery2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement statement=null;
		try {connection=Conn2.connection();
		if(connection!=null) {
			String muquery="insert into student(id,name,age) values(?,?,?)";
			statement=connection.prepareStatement(muquery);
			if(statement!=null) {
				statement.setInt(1, 02);
				statement.setString(2, "vikash");
				statement.setInt(3, 34);
			}int num=statement.executeUpdate();
			if(num==1) {
				System.out.println("row inserted");
				
			}else {
				System.out.println("not inserted");
			}
			
		}
			
		}catch(Exception e) {
			
		}finally {
			try {
				Conn2.closeresource(connection, statement);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
