package sqlConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import setGet.Login;


public class Log 
{
	public static int d(Login r)
    {
	Connection connection=null;
	PreparedStatement prepareStatement=null;
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","admin");
		prepareStatement = connection.prepareStatement("select eid,password from SignUp where eid=? and password=?");
		prepareStatement.setInt(1,r.getEid());
		prepareStatement.setString(2, r.getPsw());
		ResultSet rs = prepareStatement.executeQuery();
	    if(rs.next())
	    {
	      System.out.println("tfbybh");;
	    }
	    System.out.println("hello dothoo");
	    
}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
	return 1;
	

}
}