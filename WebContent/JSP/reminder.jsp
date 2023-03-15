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
	int message1 = (Integer)request.getAttribute("message1");
	int message2 = (Integer)request.getAttribute("message2");
	int message3 = (Integer)request.getAttribute("message3");
	%>
	計算の結果<br>
	<%= message1 + " % " + message2 + " = " + message3 %>
	</body>
</html>