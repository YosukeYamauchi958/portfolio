package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Calculator.Calculator; //必要:別パッケージのCalculatorクラスをインポート

@WebServlet("/ShoppingServlet")
public class ShoppingServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String num3 = request.getParameter("num3");
		//int型へ変換
		int dob1 = Integer.parseInt(num1);
		int dob2 = Integer.parseInt(num2);
		int dob3 = Integer.parseInt(num3);
		//合計の計算
		int cal1 = dob1*100 + dob2*150 + dob3*30;

		//Calculatorクラスのインスタンスを生成して戻り値を受け取る
		Calculator cal = new Calculator();
		int result = cal.calc(cal1);

		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>入力の結果表示画面</title></head>");
		out.println("<body>");
		out.println("お買い上げありがとうございました。<br>");

		out.print("小計:"+ cal1 +"円<br>");
		out.print("合計:"+ result +"円<br>");
		out.print("(内消費税:"+ (result - cal1) +"円)<br>");

		out.println("</body>");
		out.println("</html>");
	}
		public static int calc(int cal1) {
			int sum = cal1*108/100;
			return sum;
	}
}
