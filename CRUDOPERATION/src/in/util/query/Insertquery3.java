package in.util.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.util.jdbc.Conn3;

public class Insertquery3 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
 Connection connection=null;
 PreparedStatement statement=null;
 ResultSet resultset=null;
 try {connection=Conn3.connection();
 if(connection!=null) {
	String myquery="select * from student where id=?";
	statement=connection.prepareStatement(myquery);
	if(statement!=null) {
		statement.setInt(1, 2);
		resultset=statement.executeQuery();
		if(resultset!=null) {
			if(resultset.next()) {
			System.out.println(resultset.getInt(1)+"\n"+resultset.getString(2)+"\n"+resultset.getInt(3));
		}}
	}
	
	
 }
	 
 }catch(Exception e) {
	 e.printStackTrace();
 }finally {
	 try {
		Conn3.closeresource(connection, resultset, statement);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
	}

}
