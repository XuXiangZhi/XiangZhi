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
    ���f�ѥ��������q<br>
    ���U�t��<br>
	<table class="table_form">
	<form method="post" action="TestJDBCDAO">
	�b���G<br>
	<input type="text" name="coa_acc"><br>
	�K�X�G<br>
	<input type="password" name="coa_psw"><br>
	�m�W�G<br>
	<input type="text" name="coa_name"><br>
	�ʧO�G<br>
	<label><input type="radio" name="coa_sex" value="1">�k</label>
		 <label><input type="radio" name="coa_sex" value="0">�k</label><br>
	�q�l�l��G<br>
	<input type="text" name="coa_mail"><br>
	�ۧ�²���G<br>
	<textarea cols="25" rows="5"></textarea><br>
	�j�Y�ӡG<br>
	<input type="file" name="coa_pic"><br>
	<input type="submit" value="�e�X"><input type="reset" value="���s��J">
	</form>
	</table>
    </div>
	
</body>
</html>