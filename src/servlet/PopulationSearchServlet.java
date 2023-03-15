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

@WebServlet("/PopulationSearchServlet")
public class PopulationSearchServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException{

		String populationStr = request.getParameter("population");
		int population = Integer.parseInt(populationStr);

		CountryDao dao = new CountryDao();
		List<Country> list = dao.searchByPopulation(population);


		request.setAttribute("country", list);
		request.setAttribute("population", population);

		RequestDispatcher rd = request.getRequestDispatcher("./JSP/populationSearchResult.jsp");
		rd.forward(request, response);
	}
}