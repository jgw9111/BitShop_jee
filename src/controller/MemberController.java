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
		String dir = request.getParameter("dir");
		if(dir == null ) {
			String dirPath = request.getServletPath();
			dirPath = dirPath.replace(".do","");
			dir = dirPath.substring(1);
		}
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		System.out.println("cmd::"+cmd);
		System.out.println("page::"+page);
		System.out.println("dir::"+dir);
		switch(cmd) {
		case"login":
			System.out.println("action 이 로그인");
			String id = request.getParameter("uid");
			String pass = request.getParameter("upass");
			if(!(id.equals("test") && pass.equals("te"))) {
				dir = "";
				page = "index";
			}
			request.setAttribute("name", "test");
			request.setAttribute("compo" ,"login-success");
			Command.move(request, response,dir,page);
			break;
		case"move": 
			System.out.println("action 이 무브");
			Command.move(request, response, dir,page);
			break;
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
