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
<%
	UserVO user = new UserVO();
	user.setUserid(request.getParameter("userid"));
	user.setUserpwd(request.getParameter("userpwd"));
	user.setUsername(request.getParameter("username"));
	user.setEmail(request.getParameter("email"));
	user.setPhone(request.getParameter("phone"));
	user.setAddress(request.getParameter("address"));
	user.setJob(request.getParameter("job"));
	
	LoginDAO dao = new LoginDAO();
	if(dao.joinProc(user)>0){

%>
���̵� : <%=user.getUserid() %>
�̸� :	<%=user.getUsername() %>
��й�ȣ :<%=user.getUserpwd() %>
��ȭ��ȣ :<%=user.getPhone() %>
�̸��� :<%=user.getEmail() %>
�ּ� : <%=user.getAddress() %>
���� :<%=user.getJob() %>


<%
	}else{
%>
ȸ������ ó�� ���� <br>
<%
	}
%>
</body>
</html>