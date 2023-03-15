<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head><title></title></head>
<body>
	<%
	String str1 = (String)request.getAttribute("regist");
	if(str1 !=null){
	%>
	<font color="red"><%=str1%></font><br>
	<%
	}
	%>
	<%
	String str2 = (String)request.getAttribute("delete");
	if(str2 !=null){
	%>
	<font color="red"><%=str2%></font><br>
	<%
	}
	%>
	<%
	String str3 = (String)request.getAttribute("notRegist");
	if(str3 !=null){
	%>
	<font color="red"><%=str3%></font><br>
	<%
	}
	%>
	<a href="/mvc_app/JSP/registUser.jsp">研修生情報登録</a><br>
	<a href="/mvc_app/JSP/userInfo.jsp">研修生情報閲覧</a><br>
	<a href="/mvc_app/DeleteUserServlet">研修生情報削除</a><br>
  </body>
</html>