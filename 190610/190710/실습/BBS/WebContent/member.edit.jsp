<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>

<html><head><title>ȸ�� ���� ���� </title>

<link href="mystyle.css" rel="stylesheet" type="text/css">
<style>
table {
  width: 60%;
  margin: auto;
  padding : 10px;     
} 
</style>
</head>

<body>


<h3 id="header">ȸ�� ���� �Է�</h3>
<div id='menu'>

<div id="menucontainer">
	<div id="shatop"></div>
	<h3 class="center">�� ��</h3>
	<a href=logout.jsp>�α׾ƿ�</a>
	<div class="blank">&nbsp;</div>
	<a href=viewuser.jsp>��������</a>
	<div class="blank">&nbsp;</div>
	<a href=notice.jsp>��������</a>
	<div class="blank">&nbsp;</div>
	<a href=user_list.jsp>ȸ�����</a>
	<div class="blank">&nbsp;</div>
	<a href=cabinet.jsp>��������</a>
	<div class="blank">&nbsp;</div>	
	<a href=Mail>���ڸ���</a>
	<div class="blank">&nbsp;</div>
	<a href=bbs.do>�� �� ��</a>
	<div class="blank">&nbsp;</div>
	<div class="blank">&nbsp;</div>		
	<h3 class="center">�湮��</h3>
	<div class="blank">&nbsp;</div>
	<div class="blank">&nbsp;</div>		
	
	</div>
</div>


</div>

<div id="main">
<h3 style="text-align : center;"> ȸ�� ���� �Է�</h3>
<form method='post' action='./join.do'  >
 <table >
      <tr height="2" bgcolor="#FFC8C3"><td colspan="2"></td></tr>
      <tr>
         <th style="width:100;text-align:left;"> ���̵� </th>
         <td><input type="text" name="userid" value ="${user.userid}"></td>
      </tr>
      <tr>
         <th style="width:100;text-align:left;">�� ��</th>
         <td><input type="text" name="username" value ="${user.username}">  </td>
       </tr>        
       <tr>
         <th style="width:100;text-align:left;">��й�ȣ</th>
         <td><input type="password" name="userpwd" value ="${user.userpwd}"> ����/�������� 6�� �̻�</td>
       </tr>   
      
        <tr>
        </td>
           <th style="width:100;text-align:left;">����ó</th>
           <td><input type='text' name='phone' value ="${user.phone}"></td>
        </tr>
        <tr>
          <th style="width:100;text-align:left;">�̸���</th>
          <td>
            <input type='text' name="email">@
            <input type='text' name="email_dns">
              <select name="emailaddr">
                 <option value="">�����Է�</option>
                 <option value="daum.net">daum.net</option>
                 <option value="empal.com">empal.com</option>
                 <option value="gmail.com">gmail.com</option>
                 <option value="hanmail.net">hanmail.net</option>
                 <option value="msn.com">msn.com</option>
                 <option value="naver.com">naver.com</option>
                 <option value="nate.com">nate.com</option>
              </select>
            </td>
         </tr>
         
         <tr>
           <th style="width:100;text-align:left;">����</th>
           <td>
           <select name='job' size='1'>
                 <option value=''>�����ϼ���</option>
                 <option value='39'>�л�</option>
                 <option value='40'>��ǻ��/���ͳ�</option>
                 <option value='41'>���</option>
                 <option value='42'>������</option>
                 <option value='43'>����</option>
                 <option value='44'>���񽺾�</option>
                 <option value='45'>����</option>
                 <option value='46'>����/����/�����</option>
                 <option value='47'>�����</option>
                 <option value='48'>����</option>
                 <option value='49'>�Ƿ�</option>
           </select>
          </td>
        </tr>
       <tr>
         <th style="width:100;text-align:left;">�ּ� </th>
           <td class="s">
               <input type="text" name="address" value="${user.address}"  >  
            </td>
         </tr>
         
 
           <tr height="2" bgcolor="#FFC8C3"><td colspan="2"></td></tr>
           <tr>
             <td colspan="2" align="center">
               <input type="submit" value="ȸ����������">
               <input type="reset" value="���">
            </td>
           </tr>
           </table>
</form>
</div>


</body>
</html>
