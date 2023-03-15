<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head><title>結果画面</title></head>
	<body>
	<%
	int result1 = (Integer)request.getAttribute("formValue");
	int result2 = (Integer)session.getAttribute("multiple");
	%>
	乗算した値=<%=result1%><br>
	結果=<%=result2%><br>

	<a href="./JSP/inputNumber.jsp">更に登録</a><br>
	<a href="/mvc_app/ResetNumberServlet">リセット</a><br>

	</body>
</html>