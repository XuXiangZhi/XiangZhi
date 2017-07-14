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
        }
	</style>
</head>
<body>
    <div>
    	健貨股份有限公司<br>
   		 註冊系統&nbsp<b>健身房</b><br>
		<table>
		<form method="post" action="">
			
			*帳號：<br>
			<input type="text" name="stu_acc"><br>
			<br>
			*密碼：<br>
			<input type="password" name="stu_psw"><br>
			<br>
			*確認密碼：<br>
			<input type="password" id="stu_ckpsw" name="stu_ckpsw"><br>
			<br>
			*名稱：<br>
			<input type="text" name="stu_name"><br>
			<br>
			*電子郵件：<br>
			<input type="text" name="stu_mail"><br>
			<br>
			*地址：<br>
			<input type="text" name="gym_add"><br>
			<br>
			*簡介：<br>
			<input type="textarea" name="stu_into"><br>
			<br>
			照片：<br>
			<input type="file" name="coa_pic"><br>
			<br>
			<input type="submit" value="送出"><input type="reset" value="重新輸入">
		
		</form>
		</table>
    </div>
	
</body>
</html>