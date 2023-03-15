<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索画面</title>
</head>
<body>
	<h2>国データベース検索システム</h2>
	◆人口で検索
	<form action="/mvc_app/PopulationSearchServlet" method="post">
		<input type ="text" name="population">
		人以上で
		<input type ="submit" value="検索"><br><br>
	</form>

	◆面積で検索
	<form action="/mvc_app/AreaSearchServlet" method="post">
		<input type ="text" name="area">
		平方km以上で
		<input type ="submit" value="検索"><br><br>
	</form>

	<!-- 全ての国のデータを表示 -->
	<form action="/mvc_app/ShowAllServlet" method="post">
		<input type ="submit" value="全ての国を表示"><br>
	</form>

</body>
</html>