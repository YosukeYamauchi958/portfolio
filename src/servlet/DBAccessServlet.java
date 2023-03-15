package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TraineeDao;
import entity.Trainee;

@WebServlet("/DBAccessServlet")
public class DBAccessServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		//JSPでは不要、Servletでは必要
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		//DAO呼び出し
		TraineeDao dao = new TraineeDao();
		//パラメーターをint型に変換してcoIdへ代入
		int coId = Integer.parseInt(request.getParameter("会社名"));
		List<Trainee>list = dao.searchByCoId(coId);
		if(!list.isEmpty()) {
			out.println("検索結果");
			out.println("<br>");
			for(int i =0; i<list.size(); i++) {
				Trainee trainee = list.get(i);

			out.println("<html>");
			out.println("<head><title>検索結果の表示画面</title></head>");
			out.println("<body>");
			out.println(trainee.getId() +"  "+ trainee.getName() +"  "+ trainee.getAge());
			out.println("<br>");
			out.println("</body>");
			out.println("</html>");
			}
		}else {
			out.println("<html>");
			out.println("<head><title>検索結果の表示画面</title></head>");
			out.println("<body>");
			out.println("研修生は見つかりませんでした。");
			out.println("</body>");
			out.println("</html>");
		}
	}
}
