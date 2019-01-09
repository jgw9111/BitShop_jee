package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {
		dao = MemberDAOImpl.getInstance();
	}
	public static MemberServiceImpl getInstance() {return instance;}

	public MemberDAOImpl dao;
	
	@Override
	public void createMember(MemberBean member) {
		dao.insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		list = dao.selectAllMembers();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		list = dao.selectMembersByName(name);
		return list;
	}

	@Override
	public MemberBean findMemberById(String id) {
		MemberBean member = new MemberBean();
		member = dao.selectMemberById(id);
		return member;
	}

	@Override
	public int countMembers() {
		int count = 0;
		count = dao.countMembers();
		return count;
		
	}

	@Override
	public boolean exsitMember(String id,String pass) {
		boolean exsit = false;
		
		return exsit;
	}

	@Override
	public void changeMember(MemberBean member){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeMember(String id) {
		// TODO Auto-generated method stub
		
	}

}
