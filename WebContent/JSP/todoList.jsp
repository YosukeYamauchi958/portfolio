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
	String[] todoList = (String[])session.getAttribute("message");
		if(todoList == null){
			out.print("登録されている予定はありません。<br>");
		}else{
		for(int i=0; i<todoList.length; i++){
	%>
		<p>
		<%= todoList[i]%>
		</p>
	<%}
		}%>
	<a href="./inputToDo.html">更に登録</a><br>
	<a href="ResetToDoServlet">リセット</a><br>
	</body>
</html>