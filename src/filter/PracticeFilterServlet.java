package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PracticeFilterServlet")
public class PracticeFilterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

			//HTMLで出力
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<head><title>Hello World</title></head>");
			out.println("<body>");
			out.println("Hello World!!");
			out.println("</body>");
			out.println("</html>");

		}
}