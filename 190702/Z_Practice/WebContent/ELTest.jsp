<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ELTest.jsp</title>
</head>
<body>
���ؽ�Ʈ �Ķ���� �� : <%=application.getInitParameter("db_driver") %><br>
���ؽ�Ʈ �Ķ���� �� : ${initParam.db_driver} <br>

</body>
</html>