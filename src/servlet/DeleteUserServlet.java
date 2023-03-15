package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		HttpSession session = request.getSession(false);
		if(session.getAttribute("formValue1")==null || session.getAttribute("formValue2")==null) {
			request.setAttribute("notRegist", "研修生情報が登録されていません");//userMenu.jspで受け取る
		}else if(session != null){
			session.invalidate();
			request.setAttribute("delete", "削除しました");//userMenu.jspで受け取る
		}

		RequestDispatcher rd = request.getRequestDispatcher("/JSP/userMenu.jsp");
		rd.forward(request, response);
	}
}