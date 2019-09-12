package sqlConn;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.SQLException;

import setGet.Registeration;
public class Register 
{
public static int d(Registeration r) 
     {
		
		Connection connection=null;
		PreparedStatement prepareStatement=null;
		int executeUpdate=0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","admin");
			prepareStatement = connection.prepareStatement("insert into SignUp values(?,?,?,?,?,?,?,?,?,?)");
			prepareStatement.setString(1, r.getFname());
			prepareStatement.setString(2, r.getLname());
			prepareStatement.setInt(3,r.getEid());
			prepareStatement.setInt(4, r.getMno());
			prepareStatement.setString(5, r.getMail());
			prepareStatement.setString(6, r.getPassword());
			prepareStatement.setString(7, r.getGender());
			prepareStatement.setString(8, r.getDesg());
			prepareStatement.setString(8, r.getDe());
			prepareStatement.setString(9, r.getCity());
		    executeUpdate = prepareStatement.executeUpdate();
		   
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return executeUpdate;
		
	}
	
	
	
}
