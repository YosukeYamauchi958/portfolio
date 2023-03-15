package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountDownServlet
 */
@WebServlet("/CountDownServlet")
public class CountDownServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>CountDownServlet</title></head>");
		out.println("<body>");
		for(int i =0; i < 11; i++) {
			int num = 10 - i;
			out.println(num);    //計算結果の表示
			out.println("<br>"); //改行タグ
		}
		out.println("</body>");
		out.println("</html>");
	}
}