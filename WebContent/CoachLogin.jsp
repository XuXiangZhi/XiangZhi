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
	<form method="post" action="/0706Test/JDBCDAO_login">
	帳號：<input type="text" name="coa_acc"><br>
	密碼：<input type="password" name="coa_psw"><br>
	<input type="submit" value="登入"><input type="reset" value="重新輸入">
	</form>
	
	<form method="post" action="CoachRegistered.jsp">
	<input type="submit" value="註冊">
	</form>
	
</body>
</html>