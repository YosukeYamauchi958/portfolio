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
@WebServlet("/ReminderServlet")
public class ReminderServlet<Int> extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");

		//int型へ変換する
		int int1 = Integer.parseInt(num1);
		int int2 = Integer.parseInt(num2);
		//計算の結果
		int int3 = int1 % int2;

		request.setAttribute("message1", int1);
		request.setAttribute("message2", int2);
		request.setAttribute("message3", int3);
		//Object valueが変数の場合は""は不要

		RequestDispatcher rd = request.getRequestDispatcher("./JSP/reminder.jsp");
		rd.forward(request, response);
	}
}