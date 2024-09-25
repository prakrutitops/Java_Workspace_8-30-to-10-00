

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/send2")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String e = req.getParameter("email");
		String p = req.getParameter("password");
		
		Model m = new Model();
		m.setEmail(e);
		m.setPassword(p);
		
		Model m2 = Dao.logindata(m);
		
		if(m2!=null)
		{
			resp.sendRedirect("dashboard.html");	
			//out.print("Login Success");
		}
		else
		{
			resp.sendRedirect("");
			//out.print("Login Fail");
		}
		
		
		
		
		
	}
}
