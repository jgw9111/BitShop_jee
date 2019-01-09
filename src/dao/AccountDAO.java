package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDAO {
	public void insertMakeAccount(AccountBean account);
	public ArrayList<AccountBean> selectAllAccounts();
	public AccountBean selcetAccountsByAccountNum(String accountNum);
	public int countAccounts();
	public void changedeposit(String accountNum,int money);
	public void changewithdraw(String accountNum,int money);
	public void removeAccount(String accountNum);
}