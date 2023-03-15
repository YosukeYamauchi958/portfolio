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
@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String str1 = request.getParameter("str1");//住まい
		String str2 = request.getParameter("str2");//趣味

		HttpSession session = request.getSession(true);
		session.setAttribute("message1", str1);
		request.setAttribute("message2", str2);
		//Object valueが変数の場合は""は不要

		RequestDispatcher rd = request.getRequestDispatcher("./JSP/addressHobby1.jsp");
		rd.forward(request, response);
	}
}