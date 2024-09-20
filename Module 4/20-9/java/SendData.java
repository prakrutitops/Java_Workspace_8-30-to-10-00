import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet File-Controller
@WebServlet("/send")
public class SendData extends HttpServlet
{
	//doget
	//dopost
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//out.print("Hello");
		
		String n = req.getParameter("name");
		String e = req.getParameter("email");
		String s = req.getParameter("subject");
		String m = req.getParameter("message");
		
		out.print("Your Name is "+n);
		out.print("<br>");
		out.print("Your Email is "+e);
		out.print("<br>");
		out.print("Your Subject is "+s);
		out.print("<br>");
		out.print("Your Message is "+m);
		
		
		
		
	}
	
}
