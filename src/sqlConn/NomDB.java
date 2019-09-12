package sqlConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import setGet.Nomina;

public class NomDB 
{
	public static int d(Nomina r) 
    {
		
		Connection connection=null;
		PreparedStatement prepareStatement=null;
		int executeUpdate=0;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","admin");
			prepareStatement = connection.prepareStatement("insert into Nomination values(?,?,?,?)");
			prepareStatement.setString(1, r.getEid());
			prepareStatement.setString(2, r.getEnam());
			prepareStatement.setString(3, r.getPro());
			prepareStatement.setString(4,r.getMail());
			prepareStatement.setString(5, r.getDept());
		    executeUpdate = prepareStatement.executeUpdate();
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
			
			return executeUpdate;
			
    }

}
