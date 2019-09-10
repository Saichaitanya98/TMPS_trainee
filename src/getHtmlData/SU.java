package getHtmlData;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
	import javax.servlet.ServletException;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import setGet.Registeration;
	import sqlConn.Register;
  
	public class SU extends HttpServlet 
	{
		private static final long serialVersionUID = 1L;
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			PrintWriter out = response.getWriter();
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			int eid = Integer.parseInt(request.getParameter("eid"));
			int mno = Integer.parseInt(request.getParameter("mno"));	
			String mail = request.getParameter("mail");
			String psw = request.getParameter("password");
			String gender = request.getParameter("gender");
			String desg = request.getParameter("desg");
			String city = request.getParameter("city");
	   
	   Registeration r = new Registeration();
	   r.setFname(fname);
	   r.setLname(lname);
	   r.setEid(eid);
	   r.setMno(mno);
	   r.setMail(mail);
	   r.setPassword(psw);
	   r.setGen(gender);
	   r.setDesg(desg);
	   r.setCity(city);
	   
	   int m = Register.d(r);
	   
	     if(m>0) 
	     {
	    	 out.print("Successfully SingUp");
	    	 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/SigSu.html");
	    	 requestDispatcher.forward(request, response);
	     }
	     else
	     {
	    	 out.print("something went wrong");
	    	 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/SignUp.html");
	    	 requestDispatcher.include(request, response);
	     }
	 }

}
