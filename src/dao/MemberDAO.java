package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDAO {
		public void insertMember(MemberBean member);
		public ArrayList<MemberBean> selectMembers();
		public ArrayList<MemberBean> selectByName(String name);
		public MemberBean selectByID(String id);
		public void countMembers();
		public void withdraw(int money);
		public void deposit(int money);
		public void deleteMember();
}
