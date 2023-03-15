<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.text.ParseException" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.TimeZone" %>
<%@ page import="java.time.Duration" %>
<%@ page import="java.time.ZoneId" %>
<%@ page import="java.time.ZonedDateTime" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>世界の時刻</title>
</head>
<body>
	<h2>世界の時刻</h2>
	<table border = "1">
		<tr>
			<th>都市</th><th>日時</th><th>東京との時差</th>
		</tr>
		<tr>
			<th>東京</th>
			<th>
			<%
			Date date1 = new Date();
			TimeZone tokyo = TimeZone.getTimeZone("Asia/Tokyo");
			SimpleDateFormat fmt = new SimpleDateFormat("MM/dd HH:mm");
			fmt.setTimeZone(tokyo);
			out.println(fmt.format(date1));
			%>
			</th>
			<th>0時間</th>
		</tr>
		<tr>
			<th>カイロ</th>
			<th>
			<%
			Date date2 = new Date();
			TimeZone cairo = TimeZone.getTimeZone("Africa/Cairo");
			fmt.setTimeZone(cairo);
			out.println(fmt.format(date2));
			%>
			</th>
			<th>
			<%
	        ZonedDateTime tokyo2 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
	        ZonedDateTime cairo2 = ZonedDateTime.now(ZoneId.of("Africa/Cairo"));
			Duration d = Duration.between(tokyo2.toLocalDateTime(), cairo2.toLocalDateTime());
			out.println(d.toHours() + "時間");
			%>
			</th>
		</tr>
		<tr>
			<th>ロサンゼルス</th>
			<th>
			<%
			Date date3 = new Date();
			TimeZone la = TimeZone.getTimeZone("America/Los_Angeles");
			fmt.setTimeZone(la);
			out.println(fmt.format(date3));
			%>
			</th>
			<th>
			<%
	        ZonedDateTime tokyo3 = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
	        ZonedDateTime la2 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
			Duration d2 = Duration.between(tokyo3.toLocalDateTime(), la2.toLocalDateTime());
			out.println(d2.toHours() + "時間");
			%>
			</th>
		</tr>
	</table>
	</body>
</html>