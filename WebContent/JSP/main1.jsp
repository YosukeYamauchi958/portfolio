<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head><title>ログイン画面</title>
</head>
<body>
	<%
	String userID = (String)session.getAttribute("ID");
	%>
	ようこそ<%=userID%>さん
	<br>
	<a href="./main2.jsp">次の画面へ</a>
</body>
</html>
