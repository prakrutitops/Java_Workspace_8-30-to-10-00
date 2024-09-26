import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet
{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			HttpSession sess = req.getSession();
			if(sess.getAttribute("project")!=null)
			{
				List<ProductModel>list = Dao.viewdata();
				
				out.print("<table border='1' cellspacing='5px' cellpadding='5px'>");
				out.print("<tr><th>Id</th><th>Product Name</th><th>Product Price</th><th>Product Description</th><th>Edit</th><th>Delete</th></tr>");
				
				for(ProductModel pm :list)
				{
					out.print("<tr><td>"+pm.getId()+"</td><td>"+pm.getPname()+"</td><td>"+pm.getPprice()+"</td><td>"+pm.getPdes()+"</td><td><a href='EditServlet?id="+pm.getId()+"'>Edit</a></td><td><a href='DeleteServlet?id="+pm.getId()+"'>Delete</a></td></tr>");
				}
				
				out.print("</table>");
				out.print("<a href='dashboard.html'>Add data</a>");
			}
			else
			{
				out.print("<p>Please Login First</p>");
			}
			
			
	}
}
