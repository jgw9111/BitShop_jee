package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;
import factory.DatabaseFactory;
import pool.Constant;

public class MemberDAOImpl implements MemberDAO {
	private static MemberDAOImpl instance = new MemberDAOImpl();
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;

	@Override
	public void insertMember(MemberBean member) {
		try {
			DatabaseFactory.createDatabase("oracle").
			getConnection().createStatement().
			executeUpdate(String.format("INSERT INTO member( id,name,pass,ssn )\r\n" + 
					"VALUES( '%s' , '%s' , '%s' , '%s' ) ", 
					member.getId(),member.getName(),member.getPass(),member.getSsn()));
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public ArrayList<MemberBean> selectMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		try {
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(name);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member = new MemberBean();
		try {
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeQuery(id);
			while(rs.next()) { // 검색된 결과가 존재하면 TRUE 리턴
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return member;
	}

	@Override
	public int countMembers() {
		int count = 0;
		try {
			DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeUpdate(String.format("",""));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public void changeMember(MemberBean member) {
		try {
			DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeUpdate(String.format("",""));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeMember(String id) {
		try {
			DatabaseFactory.createDatabase("oracle").getConnection().createStatement().executeUpdate(String.format("",""));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
