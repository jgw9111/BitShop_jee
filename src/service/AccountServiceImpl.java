package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import dao.AccountDAOImpl;
import domain.AccountBean;

public class AccountServiceImpl implements AccountService {
	private static AccountServiceImpl instance = new AccountServiceImpl();
	private AccountServiceImpl() {
		dao = AccountDAOImpl.getInstance();
	}
	public static AccountServiceImpl getInstance() {return instance;}
	public static AccountDAOImpl dao;
	
	/*private ArrayList<AccountBean> list;
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}*/

	@Override
	public void openAccount(AccountBean account) {
		dao.insertMakeAccount(account);
	}

	@Override
	public String makeAccountNum() {
		String makeAccountNum = "";
		Random random = new Random();
		for(int i=0;i<8;i++) {
			if(i!=3) {
				makeAccountNum += random.nextInt(10);
			}else if(i==0){
				makeAccountNum += random.nextInt(9)+1;
			}else {
				makeAccountNum += random.nextInt(10)+"-";
			}
		}
		
		return makeAccountNum;
	}

	@Override
	public String maketoday() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd kk:mm:ss");
		return sdf.format(date);
	}

	@Override
	public ArrayList<AccountBean> findAll() {
		ArrayList<AccountBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public AccountBean findAccountById(String accountNum) {
		AccountBean account = new AccountBean();
		/*for(int i=0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
			}
		}*/
		return account;
	}

	@Override
	public int count() {
		int count = 0;
		return count;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean ok = false;
		/*for(int i=0;i < list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				ok = true;
				break;
			}
		}*/
		return ok;
	}

	@Override
	public void deposit(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(String accountNum) {
		// TODO Auto-generated method stub
		
	}

}