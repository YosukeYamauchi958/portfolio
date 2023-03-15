package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RegistUserServlet")
public class RegistUserServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(true);

		String str1 = request.getParameter("name");
		String str2 = request.getParameter("company");

		session.setAttribute("formValue1", str1);
		session.setAttribute("formValue2", str2);

		request.setAttribute("regist", "登録しました");//userMenu.jspで受け取る

		RequestDispatcher rd = request.getRequestDispatcher("/JSP/userMenu.jsp");
		rd.forward(request, response);
	}
}