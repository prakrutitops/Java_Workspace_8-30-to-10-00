import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

public class MyFilter implements Filter
{

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException 
	{
		arg1.setContentType("text/html");
		PrintWriter out = arg1.getWriter();
		
		
		String name = arg0.getParameter("name");
		String email = arg0.getParameter("email");
		String mob = arg0.getParameter("mobile");
		String pass = arg0.getParameter("pass");
		
		
		if(name=="" && email=="" && mob=="" && pass=="")
		{
			out.print("All fields are mandatory");
		}
		else if(pass.equals("1234"))
		{
			arg2.doFilter(arg0, arg1);
		}
		else
		{
			out.print("Error");
		}
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
		
	}

}
