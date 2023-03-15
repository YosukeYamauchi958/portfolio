<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="entity.Country" %>
<%@page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索結果表示</title>
</head>
<body>
	<%
		List<Country> list = (List<Country>)request.getAttribute("country");
	%>
	<h2>検索結果 (全ての国を表示)</h2>
	<%
		if(list==null || list.size() == 0){
	%>
	該当するデータはありませんでした。
	<%
		}else{
	%>
	<table border="4">
	<tr>
		<th>ID</th>
		<th>国名</th>
		<th>首都</th>
		<th>人口</th>
		<th>面積(km2)</th>
		<th>人口密度(人/km2)</th>
	</tr>
	<%
	if(!list.isEmpty()) {
		for(int i =0; i<list.size(); i++) {
		Country country = list.get(i);
		%>
	<tr>
		<td><%= country.getId() %></td>
		<td><%= country.getCountry() %></td>
		<td><%= country.getCapital() %></td>
		<td><%= country.getPopulation() %></td>
		<td><%= country.getArea() %></td>
		<td><%= country.getDensity() %></td>
	</tr>
	<%
		}
	}
	%>
	</table>
	<%

		}
	%>
	<br>
	<a href="./JSP/countryDBMain.jsp">検索画面へ</a>
</body>
</html>