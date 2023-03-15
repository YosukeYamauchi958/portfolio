package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet2
 * @param <Int>
 */
@WebServlet("/ResetToDoServlet")
public class ResetToDoServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);

		if(session !=null) {
			session.invalidate();
		}

		RequestDispatcher rd = request.getRequestDispatcher("./JSP/todoList.jsp");
		rd.forward(request, response);
	}
}