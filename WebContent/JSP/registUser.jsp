<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
</head>
<body>
	<h2>名前と会社を入力してください</h2>

	<form action="/mvc_app/RegistUserServlet" method="post">
	名前: <input type="text" name="name"><br>
	会社: <input type="text" name="company"><br>
	<input type="submit" value="登録"><br>

	</form>
  </body>
</html>