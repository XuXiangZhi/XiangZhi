<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>
<body>
請選擇您的身分
<br>
	<form method="get" action="Students__Registered.jsp.jsp">
		<input type="submit" name="mem_rank" value="健身者">
	</form><br>
	<form method="get" action="Coaches_Registered.jsp">
		<input type="submit" name="mem_rank" value="教練">
	</form><br>
	<form method="get" action="Gyms__Registered.jsp.jsp">
		<input type="submit" name="mem_rank" value="健身房">
	</form><br>
	<form method="get" action="Index.jsp">
		<input type="submit" value="返回">
	</form>
</body>
</html>