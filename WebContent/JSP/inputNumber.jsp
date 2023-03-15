<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head><title>入力画面</title></head>
<body>
	<h2>乗算したい値を入力してください</h2>

	<%
	//int型の変数にnullは代入できないのでInteger型を使う

	Integer result1 = (Integer)request.getAttribute("formValue");
	Integer result2 = (Integer)session.getAttribute("multiple");
	%>

	<form action="/mvc_app/MultipleNumberServlet" method="post">
	乗算する値: <input type="text" name="multiple"><br>
	<input type="submit" value="乗算"><br>

	ここまでの計算結果: <%=result2 %>
	1つ前に乗算した値: <%=result1 %>

	</form>
  </body>
</html>