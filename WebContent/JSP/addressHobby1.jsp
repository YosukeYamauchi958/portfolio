<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>表示画面</title>
</head>
<body>
	<%
	String message1 = (String)session.getAttribute("message1");
	String message2 = (String)request.getAttribute("message2");
	%>
	ページ①<br>
	住まい=<%=message1%><br>
	趣味=<%=message2%><br>
	<a href="./JSP/addressHobby2.jsp">次の画面へ</a>
	</body>
</html>