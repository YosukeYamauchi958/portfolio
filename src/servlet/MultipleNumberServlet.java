package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MultipleNumberServlet")
public class MultipleNumberServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession(true);

		String num1 = request.getParameter("multiple");//乗算する値
		int int1 = Integer.parseInt(num1);		//int型へ変換する

		int result = 1;//最初は1に掛ける

		//入力が2回目以降であればresultを前回の結果で上書きする
		if(session.getAttribute("multiple") != null){
			result = (Integer)session.getAttribute("multiple");
			}
		result = result*int1;

		request.setAttribute("formValue", int1);//乗算する値
		session.setAttribute("multiple", result);//前の入力値との乗算結果
		RequestDispatcher rd = request.getRequestDispatcher("./JSP/numberResult.jsp");
		rd.forward(request, response);
	}
}