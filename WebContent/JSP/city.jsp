<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%@ page import="java.util.List, java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>日本の都市</title>
</head>
<body>
	<h2>日本の都市</h2>
	<%
	List<String> list = new ArrayList<String>();
	list.add("札幌");
	list.add("東京");
	list.add("名古屋");
	list.add("大阪");
	list.add("神戸");
	for(int i=0; i<list.size(); i++){
	%>
	<%= list.get(i) %><br>
	<%
	}
	%>
	</body>
</html>