package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
@WebServlet("/home.do")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("===홈컨트롤러===");
			String dir = request.getParameter("dir");
			System.out.println("dir::"+dir);
			if(dir == null ) {
				String dirPath = request.getServletPath();
				dirPath = dirPath.replace(".do","");
				dir = dirPath.substring(1);
			}System.out.println("2 dir::"+dir);
			String cmd = request.getParameter("cmd");
			cmd = (cmd == null) ? "move" : cmd;
			String page = request.getParameter("page");
			if(page==null) {page="main";}
		
			System.out.println("cmd::"+cmd);
			System.out.println("page::"+page);
			switch( cmd ) {
			case"move": 
				System.out.println("HOME 컨트롤러");
				Command.move(request, response, dir,page);
				break;
			}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
