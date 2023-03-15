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
@WebServlet("/AddToDoServlet")
public class AddToDoServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		HttpSession session = request.getSession(true);

		String str1 = request.getParameter("str1");

		String[] todoList = null;
		if(session.getAttribute("message") == null){
			todoList = new String[5];
			}else {todoList = (String[])session.getAttribute("message");
					}
			for(int i=0; i<todoList.length; i++) {
				if(todoList[i] == null) {
					todoList[i] = str1;
					break;
				}
			}
		session.setAttribute("message", todoList);

		RequestDispatcher rd = request.getRequestDispatcher("./JSP/todoList.jsp");
		rd.forward(request, response);
	}
}