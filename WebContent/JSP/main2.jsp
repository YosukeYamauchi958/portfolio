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
	<%=userID%>さんのページ
	<br>
	<a href="/mvc_app/LogoutServlet">ログアウトする</a>
</body>
</html>
