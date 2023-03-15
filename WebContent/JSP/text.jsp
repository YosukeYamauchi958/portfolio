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
	String str = request.getParameter("name");
	int result = str.length();
	%>
	<%= "「" + str + "」" %>
	<br>
	<%= "文字数は" + result + "です。" %>


	</body>
</html>