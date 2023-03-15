package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DateServlet")
public class DateServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>DateServlet</title></head>");
		out.println("<body>");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 (E)"); //(E)は曜日
			Date date = new Date();
			String dateStr = sdf.format(date);
			System.out.println(dateStr);

		out.println("</body>");
		out.println("</html>");
	}
}