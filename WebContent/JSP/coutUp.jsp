<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カウントアップ表示画面</title>
</head>
<body>
	<%
	for(int i =0; i < 11; i++) {
			int num = 0 + i;
			out.println(num);    //計算結果の表示
			out.println("<br>"); //改行タグ
		}
	%>
</body>
</html>