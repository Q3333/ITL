<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��û ��Ŀ� ���� ó��</title>
<style>
input{
maring:3px;
}
</style>
</head>
<body>
	<% if (request.getMethod().equals("GET")) {  %>
	<h2>���ϴ� �÷��� ��¥�� �����ϼ���</h2>
	<form method = "post" action="ex05_17.jsp">
	�÷� : <input type="color" name = "fcolor"> <br>
	��¥ : <input type="date" name = "fdate"> <br>
	<input type="submit" value = "����"> <br>
	</form>
	
	<% } else { %>
	<script>
	document.body.style.backgroundColor = '<%=request.getParameter("fcolor")%>';
	</script>
	<h2>���� ��¥�� <%= request.getParameter("fdate") %> �̳׿�... </h2>
	<% }  %>
</body>
</html>