<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力結果表示画面</title>
</head>
<body>
	あなたが入力した文章は以下です。<br>
	<%
	request.setCharacterEncoding("UTF-8");

	String rent = request.getParameter("rent");
	String[] check = request.getParameterValues("check");

	//JSPでは不要、Servletでは必要
	//response.setContentType("text/html;charset=UTF-8");
	//PrintWriter out = response.getWriter();

	out.println("<html>");
	out.println("<head><title>入力の結果表示画面</title></head>");
	out.println("<body>");
	out.println("賃料:<br>");
	if(check != null) {
			out.println(rent +"<br><br>"); //+"<br>"で改行
	}else{
		out.print("未選択<br><br>");
		}

	out.println("詳細条件:<br>");
	if(check != null) {
		for (int i = 0; i < check.length; i++){
			out.println(check[i] +"<br>"); //+"<br>"で改行
		}
	}else{
		out.print("なし");
		}
	%>
	</body>
</html>