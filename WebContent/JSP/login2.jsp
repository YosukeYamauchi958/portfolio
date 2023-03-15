<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head><title>ログイン画面</title></head>
<body>
	<h2>IDとパスワードを入力してください</h2>
	<%	//IDまたはパスワードが違う場合のエラーメッセージを表示
		String error = (String)request.getAttribute("error");
		if(error !=null){
	%>
	<font color="red"><%=error%></font>
	<%
	 }
	%>
	<%	//ログインしていない場合のエラーメッセージを表示
		String error2 = (String)request.getAttribute("error2");
		if(error2 !=null){
	%>
	<font color="red"><%=error2%></font>
	<%
	 }
	%>
	<form action="/mvc_app/LoginServlet2" method="post">
		ID: <input type="text" name="ID"><br>
		パスワード: <input type="password" name="password"><br>
		<input type="submit" value="ログイン">
	</form>
  </body>
</html>