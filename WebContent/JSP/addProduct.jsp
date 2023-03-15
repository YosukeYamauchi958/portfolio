<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
</head>
<body>
	<%
	String userID = (String)session.getAttribute("ID");
	%>
	ID: <%=userID%>様<br>
	カート入れるに商品を入力してください。<br>

	<form action="/mvc_app/RegistProductServlet" method="post">
	商品名: <input type="text" name="product"><br>
	<input type="submit" value="カートに追加">
	</form>
</body>
</html>