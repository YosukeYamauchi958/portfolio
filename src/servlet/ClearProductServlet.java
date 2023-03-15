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

@WebServlet("/ClearProductServlet")
public class ClearProductServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		HttpSession session = request.getSession(false);

//		if(session.getAttribute("formValue")==null) {
//			request.setAttribute("notRegist", "カート内に商品はありません");//productList.jspで受け取る
//		}else if(session != null){
//			session.invalidate();
			session.setAttribute("formValue", new ArrayList<String>());
			request.setAttribute("delete", "カート内に商品はありません");//productList.jspで受け取る
//		}

		RequestDispatcher rd = request.getRequestDispatcher("/JSP/listProduct.jsp");
		rd.forward(request, response);
	}
}