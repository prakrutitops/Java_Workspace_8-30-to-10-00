import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/send")
public class SaveServlet extends HttpServlet
{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String uname = req.getParameter("username"); 
		String em = req.getParameter("email");
		String ps = req.getParameter("password");
		
		Model m = new Model();
		m.setUsername(uname);
		m.setEmail(em);
		m.setPassword(ps);
		
		int status = Dao.savedata(m);
		
		if(status>0)
		{
			//out.print("success");
			resp.sendRedirect("login.html");
		}
		else
		{
			out.print("fail");
		}
		
		//Dao -database connectivity
		
		
	}
	
}
