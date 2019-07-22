<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JSP�� ���� ��ü��</title>
</head>
<body>
<h2>JSP�� ���� ��ü�� ����</h2>
[request]<br>
getMethod() : <%= request.getMethod() %><br>
getRequestURI() : <%= request.getRequestURI()%><br>
getHeader() : <%= request.getHeader("user-agent") %><br>
[application]<br>
getContextPath() : <%= application.getContextPath() %><br>
getServletContextName() : <%= application.getServletContextName() %><br>
getServerInfo() : <%= application.getServerInfo() %><br>
getMajorVersion() : <%= application.getMajorVersion() %><br>
getSessionTimeout() : <%= application.getSessionTimeout() %><br>
[session]<br>
getId() : <%= session.getId() %><br>
getCreationTime() : <%= session.getCreationTime() %><br>
[response]<br>
getStatus() : <%= response.getStatus() %><br>
getBufferSize() : <%= response.getBufferSize() %><br>
getContentType() : <%= response.getContentType() %><br>
<h4>Web Application(/edu) ������ ���� ����Ʈ</h4>
<%
java.util.Set<String> list = application.getResourcePaths("/");
if(list != null) {
	Object obj[] = list.toArray();
	for(int i=0; i< obj.length; i++){
		out.print(obj[i]+", ");
	}
}
%>
</body>
</html>