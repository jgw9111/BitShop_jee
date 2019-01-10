package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountBean account = null;
		
		System.out.println("=== account 서블릿으로 진입 ===");
		String dir = request.getParameter("dir");
		if(dir == null ) {
			String dirPath = request.getServletPath();
			dirPath = dirPath.replace(".do","");
			dir = dirPath.substring(1);
		}
		System.out.println("dir :: "+ dir);
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		System.out.println("page ::"+ page);
		String dest = request.getParameter("dest");
		if(dest==null) { dest = "NONE";}
		switch(cmd) {
			case"open-account": 
				System.out.println("=== 계좌 오픈 ===");
				String deposit = request.getParameter("money");
				AccountServiceImpl.getInstance().openAccount(account);
				//--String accNum = accountService.openAccount(Integer.parseInt(deposit));
				account.setAccountNum(AccountServiceImpl.getInstance().makeAccountNum());
				account.setMoney(Integer.parseInt(deposit));
				account.setToday(AccountServiceImpl.getInstance().maketoday());
				//AccountServiceImpl.getInstance().findByAccount(accountNum);
				request.setAttribute("acc",account);
				System.out.println("deposit ::"+ deposit);
				dest = request.getParameter("dest");
				request.setAttribute("dest", dest);
				Command.move(request, response,dir,page);	
			break;
			case"move": 
			System.out.println("action 이 무브");
			System.out.println("dest ::"+dest);
			System.out.println("dest(2) ::"+dest);
			request.setAttribute("dest", dest);
			Command.move(request, response, dir,page);
			break;
			case"account-detail": 
				//accountService
				break;
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
