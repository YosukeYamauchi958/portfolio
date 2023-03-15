package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet2
 * @param <Int>
 */
@WebServlet("/ScoreServlet")
public class ScoreServlet<Int> extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String num = request.getParameter("num");
		//int型へ変換する
		int int1 = Integer.parseInt(num);

		if(int1 >= 60) {
			RequestDispatcher rd = request.getRequestDispatcher("./JSP/pass.jsp");
			rd.forward(request,  response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("./JSP/faile.jsp");
			rd.forward(request,  response);
		}
	}
}