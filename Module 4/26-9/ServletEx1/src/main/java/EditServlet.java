import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet
{	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		
		ProductModel pm = Dao.editdata(id2);
		
		out.print("<form action='EditServlet2' method='post'>");
		out.print("<p>");
		out.print("<input type='hidden' name='id' value='"+pm.getId()+"'>");
		out.print("</p>");
		out.print("<p>");
		out.print("<input type='text' name='pname' value='"+pm.getPname()+"'>");
		out.print("</p>");
		out.print("<p>");
		out.print("<input type='text' name='pprice' value='"+pm.getPprice()+"'>");
		out.print("</p>");
		out.print("<p>");
		out.print("<input type='text' name='pdes' value='"+pm.getPdes()+"'>");
		out.print("</p>");
		out.print("<p>");
		out.print("<input type='submit' value='update'>");
		out.print("</p>");
		out.print("</form>");
		
		
		
	
		
	}
}
