<%@page import="lab.web.model.LoginDAO"%>
<%@page import="lab.web.model.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
  <%request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id = "user" class ="lab.web.model.UserVO">
<jsp:setProperty name ="user" property="*" />
</jsp:useBean>

<jsp:useBean id = "dao" class ="lab.web.model.LoginDAO"/>
<%
	if(dao.joinProc(user)>0){

%>
���̵� : <jsp:getProperty name ="user" property="userid" /> <br>
�̸� :	<jsp:getProperty name ="user" property="username" /> <br>
��й�ȣ :<jsp:getProperty name ="user" property="userpwd" /> <br>
��ȭ��ȣ :<jsp:getProperty name ="user" property="phone" /> <br>
�̸��� :<jsp:getProperty name ="user" property="email" /> <br>
�ּ� : <jsp:getProperty name ="user" property="address" /> <br>
���� :<jsp:getProperty name ="user" property="job" /> <br>


<%
	}else{
%>
ȸ������ ó�� ���� <br>
<%
	}
%>
</body>
</html>