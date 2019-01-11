package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MemberBean member = null;
		MemberService memberService = MemberServiceImpl.getInstance();
		System.out.println("===member 서블릿으로 진입===");
		/**
		 * 디폴트 값
		 * cmd : move
		 * dir : *
		 * page : main
		 * dest : NONE
		 * */
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
		
		String dest = request.getParameter("dest");
		if(dest==null) {dest = "NONE";}
		HttpSession session = request.getSession();
		
		switch(cmd) {
		case "login" :
			System.out.println("action 이 로그인");
			String id = request.getParameter("uid");
			String pass = request.getParameter("upass");
			boolean loginOk = memberService.exsitMember(id, pass);
			if(loginOk) {
				dir = "";
				page = "index";
			}else {
			member = memberService.findMemberById(id);
			session = request.getSession();
			session.setAttribute("user", member);
			request.setAttribute("dest" ,"welcome");
			}
			break;
		case "move" : 
			System.out.println("action 이 무브");
			System.out.println("dest ::"+dest);
			System.out.println("dest(2) ::"+dest);
			request.setAttribute("dest", dest);
			break;
		case "join" : 
			System.out.println("cmd(3) ::"+cmd);
			System.out.println("dest(3) ::"+dest);
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setPass(request.getParameter("pass"));
			member.setName(request.getParameter("name"));
			member.setSsn(request.getParameter("ssn"));
			memberService.createMember(member);
			request.setAttribute("dest",dest);
			member = memberService.findMemberById(member.getId());
			System.out.println(">>>>조회 결과"+member.toString());
			request.setAttribute("member", member );
			break;
		case "logout" :
			dir = "";
			page = "index";
			dest = "";
			session.invalidate(); // 세션에서 값을 제거
			break;
		case "detail" :
			request.setAttribute("dest",dest);
			break;
		case "update" :
			request.setAttribute("dest",dest);
			break;
		}
		Command.move(request, response, dir, page);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
