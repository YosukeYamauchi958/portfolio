<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head><title>ログイン画面</title></head>
<body>
	<h2>IDとパスワードを入力してください</h2>
	<%
		String error = (String)request.getAttribute("error");
		if(error !=null){
	%>
	<font color="red"><%=error%></font>
	<%
	 }
	%>
	<form action="/mvc_app/LoginServlet" method="post">
		ID: <input type="text" name="ID"><br>
		パスワード: <input type="password" name="password"><br>
		<input type="submit" value="ログイン">
	</form>
  </body>
</html>