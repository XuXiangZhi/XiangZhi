<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Insert title here</title>
	<style>
        div{
            margin-left: auto;
            margin-right: auto;
            width: 500px;
            border: 2px;
            border-color: #cccccc dashed;
        }
	</style>
</head>
<body>
    <div>
    健貨股份有限公司<br>
    註冊系統<br>
	<table class="table_form">
	<form method="post" action="TestJDBCDAO">
	帳號：<br>
	<input type="text" name="coa_acc"><br>
	密碼：<br>
	<input type="password" name="coa_psw"><br>
	姓名：<br>
	<input type="text" name="coa_name"><br>
	性別：<br>
	<label><input type="radio" name="coa_sex" value="1">男</label>
		 <label><input type="radio" name="coa_sex" value="0">女</label><br>
	電子郵件：<br>
	<input type="text" name="coa_mail"><br>
	自我簡介：<br>
	<textarea cols="25" rows="5"></textarea><br>
	大頭照：<br>
	<input type="file" name="coa_pic"><br>
	<input type="submit" value="送出"><input type="reset" value="重新輸入">
	</form>
	</table>
    </div>
	
</body>
</html>