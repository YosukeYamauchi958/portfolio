package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/RegistProductServlet")
public class RegistProductServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(true);

		String product = request.getParameter("product");

		//String型リストに格納していく
//		ArrayList<String>list = null;
//		if(session.getAttribute("formValue") == null){
//			list = new ArrayList<String>();
//			}else {list = (ArrayList<String>) session.getAttribute("formValue");
//			}

		//上と違うやり方
		ArrayList<String>list = new ArrayList<String>();
		if(session.getAttribute("formValue") != null) {
			list = (ArrayList<String>) session.getAttribute("formValue");
		}
		list.add(product);
		session.setAttribute("formValue", list);

		request.setAttribute("regist", "登録しました");//productMenu.jspで受け取る

		RequestDispatcher rd = request.getRequestDispatcher("/JSP/productMenu.jsp");
		rd.forward(request, response);
	}
}