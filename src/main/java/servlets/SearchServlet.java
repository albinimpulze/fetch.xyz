package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String keyword = req.getParameter("name");
		String site = req.getParameter("site");
		
		if(keyword==null || site==null)
		{
			resp.sendRedirect("index.html");
			
		}
		else
		{			
			resp.sendRedirect(site+keyword);
		}
	}

}
