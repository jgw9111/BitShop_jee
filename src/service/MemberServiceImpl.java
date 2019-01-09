package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {return instance;}

	@Override
	public void join(MemberBean member) {
		MemberDAOImpl.getInstance().insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> findMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findByID(String id) {
		MemberBean member = new MemberBean();
		return member;
	}

	@Override
	public int countMembers() {
		int count = 0;
		return count;
		
	}

	@Override
	public boolean exsitMember() {
			boolean exsit = false;
		return exsit;
	}

	@Override
	public void withdraw(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deposit(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember() {
		// TODO Auto-generated method stub
		
	}

}
