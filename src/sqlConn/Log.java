package sqlConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import setGet.Login;


public class Log 
{
	public static int d(Login r) 
    {
	Connection connection=null;
	PreparedStatement prepareStatement=null;
	
	
	try {
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
		prepareStatement = connection.prepareStatement("select eid,psw from User where eid=? and psw=?");
		prepareStatement.setInt(1,r.getEid());
		prepareStatement.setString(2, r.getPsw());
		ResultSet rs = prepareStatement.executeQuery();
	    if(rs.next())
	    {
	      System.out.println("tfbybh");;
	    }
	    System.out.println("hello dothoo");
	    
}
	catch (SQLException e) 
	{
      System.err.println();
	}
	return 1;
	

}
}