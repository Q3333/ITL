package lab.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab.board.model.BbsDAO;
import lab.board.model.BbsVO;
import lab.board.model.CommentVO;



public class BdsCommentRemoveAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		BbsDAO dao = new BbsDAO();
		CommentVO form = null;
		String page = null;
		page = request.getParameter("page");
		int bid = Integer.parseInt(request.getParameter("read_num"));		
		int cmid = Integer.parseInt(request.getParameter("num"));
		
		String password = request.getParameter("password");
		
		if(password.equals(dao.getCommentPassword(cmid))) {
//			if(dao.deleteCmt(cmid)>0) {
			if(true) {
				dao.deleteCmt(cmid);
				response.sendRedirect("./view.do?bid="+bid+"&page="+page);
			}
		}else {
			out.print("<script>");
			out.print("alert(\"�н����� ����\");");
			out.print("location.href= \"./view.do?bid="+bid+"&page="+page+"\";");
			out.print("</script>");
		}
				
	}

}
