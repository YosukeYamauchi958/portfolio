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
@WebServlet("/TextServlet")
public class TextServlet<Int> extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String name = request.getParameter("name");

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter(); out.println("<html>");

		out.println("<head><title>入力の結果表示画面</title></head>");
		out.println("<body>");
		out.println("あなたが入力した文章は以下です。<br>");
		for (int i = 0; i < name.length(); i++){
		out.println(name.charAt(i)+"<br>"); //+"<br>"で改行
		}
		out.println("</body>");
		out.println("</html>");

	}
}
