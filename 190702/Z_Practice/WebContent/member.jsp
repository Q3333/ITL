<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
  <style>
   h3 { width: 740px; 
       text-align : center; }
      #hid{
        color:red;
      }
  </style>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script>
  	$(document).ready(function(){
        $("#idCheck").click(function(){
          var uid = $("#userid").val();
        	 console.log(uid +"  @  ");

	   		 $.ajax({
	            url: "idCheck.jsp",
	            data: {userid: uid},
	           
 			success : function(data){
              var result = $(data).find("result").text();
              
              if (result.equals("invalid")){//����� �������н�
                   $("#hid").val(result);
                   $("#hid").html(result);
                   	alert("test2");
                }
                else{//����� ���������� - 
                   $("#hid").val(result);
                   $("#hid").html(result);
                 alert("test3");
                  }

            }
          });
alert("test1");
 
});
      });

  </script>
  <title>ȸ�� ����</title>
 </head>
 <body>
 <h3> ȸ������ ���� �Է�</h3>
 <form name="write_form_member" method="post" action="join">
   <table width="740" style="padding:5px 0 5px 0; ">
      <tr height="2" bgcolor="#FFC8C3"><td colspan="2"></td></tr>
      
       <tr>
         <th>���̵�</th>
         <td>
          <input type="text"  id = "hid" name = "userid"> <button id="idCheck">�ߺ�IDüũ</button><span id="result"></span>
         </td>
       </tr>
       
       <tr>
         <th> �̸�</th>
         <td><input type="text" name="username"></td>
      </tr>
      
       <tr>
         <th>��й�ȣ</th>
         <td><input type="password" name="userpwd"> ����/�������� 6�� �̻�</td>
       </tr>
       
           <tr>
          <th>�ڵ��� ��ȣ</th>
           <td><input type="text"name="phone">
           </td>
          </tr>
     
        <tr>
          <th>�̸���</th>
          <td>
            <input type='text' name="email">
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
           <th>�ּ�</th>
           <td>
             <input type="text" name="address"> 
           </td>
         </tr>
        
    
         <tr>
           <th>����</th>
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
  
 
       
 
           <tr height="2" bgcolor="#FFC8C3"><td colspan="2"></td></tr>
           <tr>
             <td colspan="2" align="center">
               <input type="submit" value="ȸ������">
               <input type="reset" value="���">
            </td>
           </tr>
           </table>
          </td>
          </tr>
          </form>
 </body>
</html>
 