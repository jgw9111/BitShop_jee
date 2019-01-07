package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService {
	private ArrayList<AccountBean> list;
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}

	@Override
	public String openAccount(int money) {
		String openAccount = "";
		Random random = new Random();
		for(int i=0;i<8;i++) {
			if(i!=3) {
				openAccount += random.nextInt(10);
			}else if(i==0){
				openAccount += random.nextInt(9)+1;
			}else {
				openAccount += random.nextInt(10)+"-";
			}
		}
		AccountBean account = new AccountBean();
		account.setAccountNum(openAccount);
		account.setMoney(money);
		account.setToday(maketoday());
		list.add(account);
		return openAccount;
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
		return null;
	}

	@Override
	public AccountBean findByAccount(String accountNum) {
		AccountBean account = new AccountBean();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
			}
		}
		return account;
	}

	@Override
	public int count() {
		return list.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean ok = false;
		for(int i=0;i < list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				ok = true;
				break;
			}
		}
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