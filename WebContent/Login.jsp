<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
</head>
<body>
	健貨股份有限公司 登入系統
	<form method="post" action="www.yahoo.com.tw">
	帳號：<input type="text" id="acc" name="acc"><br>
	密碼：<input type="password" id="psw" name="psw"><br>
	<input type="submit" value="登入" onclick="return check();"><input type="reset" value="重新輸入">
	</form>
	
	<form method="post" action="SelectIdentity.jsp">
	<input type="submit" value="註冊">
	</form>
	
	<form method="get" action="Index.jsp">
		<input type="submit" value="取消登入">
	</form>
	
</body>
</html>