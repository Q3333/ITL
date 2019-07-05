package lab.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lab.board.model.UserMgrDAO;
import lab.board.model.UserVO;



//@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.sendRedirect("./login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String uid = request.getParameter("userid");
		String upwd = request.getParameter("userpwd");
		String page = request.getParameter("page");
		 
		UserMgrDAO dao = new UserMgrDAO();
		ServletContext sc = request.getServletContext();
		RequestDispatcher rd = null;
		UserVO user = null;
		HttpSession session = null;
		user = dao.loginProc(uid, upwd);
		
		System.out.println(user);
		if(user!=null) {
			session = request.getSession();
			session.setAttribute("user", user);
			
			if(page!=null) {
				response.sendRedirect("./list.do?page="+page);
			}
			else {
				response.sendRedirect("./list.do");
			}
		}
		else {
			
			out.print("<script>");
			out.print("alert(\" ���̵� �������� �ʰų� �н����� ����\");");
			out.print("location.href=\"./login.do\"");
			out.print("</script>");
					
		
		}
			
	}

}
