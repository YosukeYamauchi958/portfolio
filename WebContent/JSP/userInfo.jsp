<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力画面</title>
</head>
<body>
	<h2>研修生情報</h2>
		<%
	String formValue1 = (String)session.getAttribute("formValue1");
	String formValue2 = (String)session.getAttribute("formValue2");
	%>

	<%
	if(formValue1 == null && formValue2 ==null){
	%>
	<font color="red">研修生情報が登録されていません</font><br>
	<%
	}else{
	%>
	名前: <%= formValue1 %><br>
	会社: <%= formValue2 %><br>
	<%}
	%>
	<a href="/mvc_app/JSP/userMenu.jsp">ユーザーメニューへ戻る</a>
  </body>
</html>