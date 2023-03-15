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

	String num1 = request.getParameter("num");

	//JSPでは不要、Servletでは必要
	//response.setContentType("text/html;charset=UTF-8");
	//PrintWriter out = response.getWriter();

		out.println("<html>");
		out.println("<head><title>入力の結果表示画面</title></head>");
		out.println("<body>");
		if(num1.isEmpty()) {
			out.println("入力して下さい。<br>");
		}else {
			try {	//入力が整数か文字列かの判断をtry-catchで行う。
				//int型へ変換する
				int num2 = Integer.parseInt(num1);
				if(num2 > 12 || num2 <1){
					out.print(num2 + "月<br>範囲外です。<br>");
				}else if(num2 %2 !=0){
					out.print(num2 + "月<br>奇数月です。<br>");
				}else {
					out.print(num2 + "月<br>偶数月です。<br>");
					}
			}catch(NumberFormatException e) {
					//Exceptoinと記載だけでもcatchできる
				out.println("整数を入力して下さい。");
				}
		}
	%>
	</body>
</html>