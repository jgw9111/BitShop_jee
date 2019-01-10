package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;
import factory.DatabaseFactory;

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
			int rs = DatabaseFactory.createDatabase("oracle").
			getConnection().createStatement().
			executeUpdate(String.format("INSERT INTO member( id,name,pass,ssn )\r\n" + 
					"VALUES( '%s' , '%s' , '%s' , '%s' ) ", 
					member.getId(),member.getName(),member.getPass(),member.getSsn()));
			if(rs ==1 ) {
				System.out.println("==회원가입 성공==");
			}else {
				System.out.println("==회원가입 실패==");
			}
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
				list.add(null);
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
		MemberBean member = null; // 값이 없을 수도 있으니, while문 안에서 
		try {
			rs = DatabaseFactory.createDatabase("oracle").getConnection().createStatement()
					.executeQuery(String.format("SELECT * FROM member WHERE id LIKE '%s'",id));
			while(rs.next()) { // 검색된 결과가 존재하면 TRUE 리턴
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setSsn(rs.getString("ssn"));
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
