package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;

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
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("INSERT INTO member( id,name,pass,ssn )\r\n" + 
					"VALUES( '%s' , '%s' , '%s' , '%s' ) ", 
					member.getId(),member.getName(),member.getPass(),member.getSsn());
			System.out.println("SQL ::: "+sql);
			//rs = stmt.executeQuery(sql);
			if(stmt.executeUpdate(sql)==1) {
				System.out.println("===회원가입성공===");
			}else {
				System.out.println("!!!회원가입실패!!!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberBean> selectByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean selectByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void countMembers() {
		// TODO Auto-generated method stub
		
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
