package getHtmlData;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import setGet.Nomina;
import sqlConn.NomDB;


public class NomDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	PrintWriter out = response.getWriter();
    	String EI = request.getParameter("eid");
		String EN = request.getParameter("enam");
		String PJ = request.getParameter("pro");
		String EM = request.getParameter("mail");
		String DM = request.getParameter("dept");
		
		Nomina b=new Nomina();
		b.setEid(EI);
		b.setEnam(EN);
		b.setPro(PJ);
		b.setMail(EM);
		b.setDept(DM);
		
		int m = NomDB.d(b);
		  if(m>0) 
	     {
	    	 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/Home.html");
	    	 requestDispatcher.forward(request, response);
	     }
	     else
	     {
	    	 out.print("something went wrong");
	    	 RequestDispatcher requestDispatcher = request.getRequestDispatcher("/NomDetail.html");
	    	 requestDispatcher.include(request, response);
	     }
	}

}
