package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("===member 서블릿으로 진입===");
		String cmd = request.getParameter("cmd");
		String dir = request.getParameter("dir");
	
		if(dir==null) {
			String dirPath = request.getServletPath();
			dirPath = dirPath.replace(".do", "");
			dir = dirPath.substring(1);
		} 
		System.out.println("4  :: "+dir);
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		switch((cmd == null) ? "move": cmd) {
		case"login":
			System.out.println("action 이 로그인");
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			if(id.equals("test") && pass.equals("te")) {
				Command.move(request, response,dir+"/"+page);
			}else {
				Command.move(request, response, "index");
			}
			break;
		case"move": 
			System.out.println("action 이 무브");
			Command.move(request, response, dir+"/"+page);
			break;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
