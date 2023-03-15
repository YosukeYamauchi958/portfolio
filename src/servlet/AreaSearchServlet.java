package servlet;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CountryDao;
import entity.Country;

@WebServlet("/AreaSearchServlet")
public class AreaSearchServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{

		String areaStr = request.getParameter("area");
		int area = Integer.parseInt(areaStr);

		CountryDao dao = new CountryDao();
		List<Country> list = dao.searchByArea(area);

		request.setAttribute("country", list);
		request.setAttribute("area", area);

		RequestDispatcher rd = request.getRequestDispatcher("./JSP/areaSearchResult.jsp");
		rd.forward(request, response);
	}
}