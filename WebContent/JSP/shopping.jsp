<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力結果表示画面</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");

		//パラメーターの呼び出し
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
		//パッケージ名.クラスファイル名で呼び出す
		Calculator.Calculator cal = new Calculator.Calculator();
		int result = cal.calc(cal1);

		//JSPでは不要、Servletでは必要
		//response.setContentType("text/html;charset=UTF-8");
		//PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>入力の結果表示画面</title></head>");
		out.println("<body>");
		out.println("お買い上げありがとうございました。<br>");

		out.print("小計:"+ cal1 +"円<br>");
		out.print("合計:"+ result +"円<br>");
		out.print("(内消費税:"+ (result - cal1) +"円)<br>");

		out.println("</body>");
		out.println("</html>");
	%>
	</body>
</html>