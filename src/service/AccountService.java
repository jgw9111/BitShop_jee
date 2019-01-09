package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	public void openAccount(int money);
	public String makeAccountNum();
	public String maketoday();
	
	public ArrayList<AccountBean> findAll();
	public AccountBean findByAccount(String accountNum);
	public int count();
	public boolean existAccountNum(String accountNum);
	
	public void deposit(String accountNum,int money);
	public void withdraw(String accountNum,int money);
	
	public void deleteAccount(String accountNum);
}