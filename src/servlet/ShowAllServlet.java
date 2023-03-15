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

@WebServlet("/ShowAllServlet")
public class ShowAllServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{

		CountryDao dao = new CountryDao();
		List<Country> list = dao.showAll();

		request.setAttribute("country", list);

		RequestDispatcher rd = request.getRequestDispatcher("./JSP/ShowAllResult.jsp");
		rd.forward(request, response);
	}
}