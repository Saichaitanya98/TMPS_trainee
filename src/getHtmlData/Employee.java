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

public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		int EID = Integer.parseInt(request.getParameter("eid"));
		String PSW = request.getParameter("psw");
		
		Login lg=new Login();
		lg.setEid(EID);
		lg.setPsw(PSW);
		int m = Log.d(lg);
		  if(m>0) 
	     {
	    	 RequestDispatcher requestDispatcher = request.getRequestDispatcher(".html");
	    	 requestDispatcher.forward(request, response);
	     }
	     else
	     {
	    	 out.print("something went wrong");
	    	 RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
	    	 requestDispatcher.include(request, response);
	     }
	 }	
	}

