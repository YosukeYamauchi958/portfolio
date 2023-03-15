<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>計算表示画面</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	String name1 = request.getParameter("num1");
	String name2 = request.getParameter("num2");

	//int型へ変換
	int int1 = Integer.parseInt(name1);
	int int2 = Integer.parseInt(name2);
	int sum = int1 + int2;
	%>

	計算の結果<br>
	<%= int1 + "+" + int2 + "=" + sum %>

	</body>
</html>