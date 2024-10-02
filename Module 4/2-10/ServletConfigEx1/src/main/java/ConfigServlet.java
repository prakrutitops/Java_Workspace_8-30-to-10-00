import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ConfigServlet")
public class ConfigServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		ServletConfig config = getServletConfig();
		//System.out.println(context.getContext(getServletInfo()));
		System.out.println(config.getInitParameter("mob"));
		
	}
}
