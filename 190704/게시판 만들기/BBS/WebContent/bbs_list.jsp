<%@page import="java.util.Vector"%> 
<%@ page contentType="text/html;charset=utf-8" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%!
	//int numPerPage = BbsListAction.numPerPage;
	//int numPerBlock = BbsListAction.numPerBlock;
	int numPerPage = 10;
	int numPerBlock = 10;
	 
%>
<html><head><title>게시판</title>
<script>
 
</script>
</head>
<link href="mystyle.css" rel="stylesheet" type="text/css">
<body><h3 id="header">게시판</h3>

<div id='menu'>
<%@ include file="mymenu.jsp" %>
</div>

<div id="main">
<table width=100%>
	<tr><th>번호</th><th>제목</th><th>작성자</th>
		<th>작성일</th><th>조회수</th></tr>
<c:forEach var="row" items="${headers}">
	<tr><td colspan=5 height=1 background=ScaryCautiousDouglasfirbarkbeetle-size_restricted.gif></td></tr>
	<tr><td>${row.bid} </td><td>		 
		<a href="./view.do?bid=${row.bid}&page=${pageNo}">${row.subject}</a>
		</td>
		<td>${row.writer}</td>
		<td>${row.idate}</td>
		<td style='text-align:right'>${row.rcount}</td>
		<!-- 답글 -->
 
</c:forEach>
<tr><td colspan=5 height=1 background=ScaryCautiousDouglasfirbarkbeetle-size_restricted.gif></td></tr>
</table>
<div style='text-align:right'><br><br>
	<a href=./write.do>글작성</a>
</div>
<!-- 페이지 번호 -->
	<div style="text-align:center">	
<%	

	Integer p = (Integer) request.getAttribute("pageNo");
	System.out.println( request.getAttribute("pageNo"));
	
	int mypage = p.intValue();
    int currentBlock = (int)Math.ceil(mypage / (double)numPerBlock);
	Integer tp = (Integer) request.getAttribute("totalPage");
	double totalPage = tp.intValue();
	int totalBlock = (int)Math.ceil(totalPage / numPerBlock);
	if(totalBlock > currentBlock) { 
		int togo = (currentBlock + 1) * numPerBlock;
		if(togo > totalPage)
			togo = (int) totalPage; %>
		<a href=./list.do?page=<%=togo%>> << </a>
<%	}
	for(int i = numPerBlock; i > 0; i--) {
		int pn = numPerBlock * (currentBlock-1) + i;
		if(pn > totalPage)
			continue;
		if(pn == mypage) { %>
		<a href=./list.do?page=<%=pn%>>
		<span style="text-decoration:underline"><%=pn%></span></a>&nbsp;
<%		} else { %>
		<a href=./list.do?page=<%=pn%>><%=pn%></a>&nbsp		
<%		}
	}
	if(currentBlock > 1) { %>
		<a href=./list.do?page=<%= (currentBlock-1)*numPerBlock %>> >> </a>
<%	} %> </div> 
</div>

</body>
</html>