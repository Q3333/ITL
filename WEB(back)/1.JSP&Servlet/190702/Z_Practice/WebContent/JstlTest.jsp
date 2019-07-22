<%@page import="java.util.ArrayList"%>
<%@page import="lab.web.model.Product"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% 
request.setCharacterEncoding("utf-8");
Product p1 = new Product("����",10000,"����");
Product p2 = new Product("�ռ�ǳ��",5000,"����");
Product p3 = new Product("�����",1500,"����");
ArrayList<Product> alist = new ArrayList();
alist.add(p1);
alist.add(p2);
alist.add(p3);
request.setAttribute("products", alist);

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>JstlTest.jsp</title>
</head>
<body>
<c:set var="username" value="koera" scope="request" />
<c:if test="${username ne null}">
	<c:out value="${username}"/><br>
</c:if>

<c:remove var="username"/>
<c:out value="${username}"/> <!--  null�̶� ��� ���� -->

<c:if test="${username eq null}">
	<c:out value="username ������ �����Ǿ����ϴ�."/>
</c:if>


<c:set var="jumsu" value="${param.jumsu}" scope="request" />
	<c:out value="${jumsu+=\"����\"}"/>
<c:choose>
	<c:when test="${jumsu>=90 }">
		<c:out value="A" />
	</c:when>

	<c:when test="${jumsu>=80}">
		<c:out value="B" />
	</c:when>

	<c:when test="${jumsu>=70}">
		<c:out value="C" />
	</c:when>
	
	<c:when test="${jumsu>=60}">
		<c:out value="D" />
	</c:when>
	
	<c:otherwise>
	<c:out value="F" />
</c:otherwise>
	
</c:choose>
<br>

#forEach �±׸� ����� Ȧ�� ���<br>
<c:forEach var="count" begin="1" end="10" step="2">
	${count} <br>
</c:forEach>

# ��ǰ ���� ����Ʈ <br>
<table>
<tr><th>��ǰ��</th><th>����</th><th>�з�</th></tr>
<c:forEach var ="product" items="${products}">
<tr><th>${product.name}</th><th>${product.price}</th><th>${product.category}</th></tr>
</c:forEach>
</table>





</body>
</html>