package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet2
 * @param <Int>
 */
@WebServlet("/MultipleServlet")
public class MultipleServlet<Int> extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");

		//int型へ変換する
		int int1 = Integer.parseInt(num1);
		int int2 = Integer.parseInt(num2);

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter(); out.println("<html>");

		out.println("<head><title>掛け算の結果表示画面</title></head>");
		out.println("<body>");
		out.println("掛け算の結果");

		out.println(int1 + "×" + int2 + "=" + int1*int2);

		out.println("</body>");
		out.println("</html>");
	}
}