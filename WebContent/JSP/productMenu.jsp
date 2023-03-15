<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% //登録しましたと表示
	String str1 = (String)request.getAttribute("regist");
	if(str1 !=null){
	%>
	<font color="red"><%=str1%></font><br>
	<%
	}
	%>
	<%
	String userID = (String)session.getAttribute("ID");
	%>
	ID: <%=userID%>様<br>
	<br>
	<a href="/mvc_app/JSP/addProduct.jsp">商品登録</a><br>
	<a href="/mvc_app/JSP/listProduct.jsp">カート内確認</a><br>
	<a href="/mvc_app/LogoutServlet2">ログアウト</a>
</body>
</html>