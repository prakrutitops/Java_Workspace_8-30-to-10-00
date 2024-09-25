import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String pname = req.getParameter("pname");
		String pprice = req.getParameter("pprice");
		String pdes = req.getParameter("pdes");
	
		ProductModel pm = new ProductModel();
		pm.setPname(pname);
		pm.setPprice(pprice);
		pm.setPdes(pdes);
		
		int status = Dao.addproduct(pm);
	
		if(status>0)
		{
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			out.print("Product Added Fail");
		}
		
	}
}
