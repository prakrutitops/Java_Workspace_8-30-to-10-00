import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet2")
public class EditServlet2 extends HttpServlet
{	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		String n = req.getParameter("pname");
		String p = req.getParameter("pprice");
		String d = req.getParameter("pdes");
		
		ProductModel pm = new ProductModel();
		pm.setId(id2);
		pm.setPname(n);
		pm.setPprice(p);
		pm.setPdes(d);
		
		int status = Dao.updatedata(pm);
		
		if(status>0)
		{
			resp.sendRedirect("ViewServlet");
		}
		else
		{
			out.print("fail");
		}
		
		
		
		
		
		
	}
}
