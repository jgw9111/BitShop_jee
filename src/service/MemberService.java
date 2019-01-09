package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {	
		public void join(MemberBean member);
		public ArrayList<MemberBean> findMembers();
		public ArrayList<MemberBean> findByName(String name);
		public MemberBean findByID(String id);
		public int countMembers();
		public boolean exsitMember();
		public void withdraw(int money);
		public void deposit(int money);
		public void deleteMember();
}
