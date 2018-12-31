package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {	
	//c
		public void join();
		//r
		public ArrayList<MemberBean> findList();
		//public ArrayList<MemberBean> find
		public void findByName(String name);
		public void countMember();
		public boolean exsitMember();
		//u
		public void withdraw(int money);
		public void deposit(int money);
		//d
		public void deleteMember(String MemberNum);
}
