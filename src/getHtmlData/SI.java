package getHtmlData;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import setGet.Login;
import sqlConn.Log;



public class SI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		int eid = Integer.parseInt(request.getParameter("eid"));
		String psw = request.getParameter("psw");
		
		Login lg=new Login();
		lg.setEid(eid);
		lg.setPsw(psw);
		int m = Log.d(lg);
		   
	     if(m>0) 
	     {
	    	 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Home.html");
	    	 requestDispatcher.forward(request, response);
	     }
	     else
	     {
	    	 out.print("something went wrong");
	    	 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.html");
	    	 requestDispatcher.include(request, response);
	     }
	     System.out.println("hello kiran");
	 }
}
	


