<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
 <body>
    <h3>�κ������� ����, POST��û, XML����ó��</h3>
    <table border="1">
      <tr>
      <td colspan="2" align="center">
     <jsp:include page="header.jsp">
     	<jsp:param name="company" value="�ΰ����ɱ�� ��Ī����"/>
     	</jsp:include>
      </td></tr>
      
         <td>
        <jsp:include page ="menu.jsp"/>
         </td>
         <td width="400"><img src="dog.jpg"></td>
      </tr>
      
      <tr>
      <td colspan="2" align="center">
     	<jsp:include page ="footer.jsp">
     		<jsp:param name="address" value="���� ��ȭ��"/>
     		</jsp:include>
      </td></tr>
    </table>
  </body>
</html>