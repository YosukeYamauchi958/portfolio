package servlet;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import entity.Member;

@WebServlet("/IdSearchServlet")
public class IdSearchServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException{
		String idStr = request.getParameter("id");
		int id = Integer.parseInt(idStr);
		MemberDao dao = new MemberDao();
		Member member = dao.searchById(id);
		request.setAttribute("member", member);
		request.setAttribute("id", id);
		RequestDispatcher rd = request.getRequestDispatcher("./JSP/idSearchResult.jsp");
		rd.forward(request, response);
	}
}