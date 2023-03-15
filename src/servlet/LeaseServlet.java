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
@WebServlet("/LeaseServlet")
public class LeaseServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String rent = request.getParameter("rent");
		String[] check = request.getParameterValues("check");

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>入力の結果表示画面</title></head>");
		out.println("<body>");
		out.println("賃料:<br>");
		if(check != null) {
				out.println(rent +"<br><br>"); //+"<br>"で改行
		}else{
			out.print("未選択<br><br>");
			}

		out.println("詳細条件:<br>");
		if(check != null) {
			for (int i = 0; i < check.length; i++){
				out.println(check[i] +"<br>"); //+"<br>"で改行
			}
		}else{
			out.print("なし");
			}
		out.println("</body>");
		out.println("</html>");
	}
}
