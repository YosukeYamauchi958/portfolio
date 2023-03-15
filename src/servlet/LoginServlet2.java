package servlet;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/LoginServlet2")
public class LoginServlet2 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("ID");
		String password = request.getParameter("password");

		if("user001".equals(id) || "practice".equals(password)) {
			HttpSession session = request.getSession(true);
			//セッションへ値をセット
			session.setAttribute("ID", id);
			session.setAttribute("password", password);

			RequestDispatcher rd = request.getRequestDispatcher("/JSP/productMenu.jsp");
			rd.forward(request, response);

		}else{
			request.setAttribute("error", "IDまたはパスワードが違います。");
			RequestDispatcher rd = request.getRequestDispatcher("/JSP/login2.jsp");
			rd.forward(request, response);
		}
	}
}