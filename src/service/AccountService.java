package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	//c
	public void createMakeAccountNum();
	//r
	public ArrayList<AccountBean> findList();
	public void findByName(String name);
	public void countAccount();
	public boolean exsitAccount();
	//u
	public void withdraw(int money);
	public void deposit(int money);
	//d
	public void deleteAccount(String accountNum);
}
