<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>商品一覧</title>
</head>
<body>
		<%
	String userID = (String)session.getAttribute("ID");
	%>
	ID: <%=userID%>様<br>
	カート内の商品<br>
	<%
	String delete = (String)session.getAttribute("delete");//カートをクリアした状態
		if(delete != null){
			%>
			<font color="red"><%=delete%></font><br>
		<%
		}
		%>
	<%
	ArrayList<String> productList = (ArrayList<String>)session.getAttribute("formValue");//カート内に商品がない状態
		if(productList == null || productList.size() == 0){
			%>
			<font color="red">カート内に商品はありません。</font><br>
		<%
		}else{
		for(int i=0; i<productList.size(); i++){//カート内の商品を表示
			String product = productList.get(i);
		%>
		<%=product%><br>
		<a href="/mvc_app/ClearProductServlet">カートをクリア</a><br>
		<%}
		}%>
	<a href="/mvc_app/JSP/productMenu.jsp">メニューへ</a><br>
</body>
</html>