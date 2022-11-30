package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conn.DBConnect;
import model.Member;

public class DaoImpl implements Dao{//Dao�������̽��� ���
	//dbConnection�� �̿��� ��� 2����
	//01. conn -> DBConnection ������ �ҷ�����
	private DBConnect db;
	public DaoImpl() {
		db =DBConnect.getInstance();	
	}
	//02. ���⿡ ����
	public Connection conn=null;
	public ResultSet rs= null;
	public PreparedStatement pstmt= null;
	public String jdbc_driver="oracle.jdbc.driver.OracleDriver";
	public String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
	public void con() {
		try {
			Class.forName(jdbc_driver);
			// �����ͺ��̽� ���������� �̿��� Connection �ν��Ͻ� Ȯ��
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {//��� ������ �ְ� ����
			e.printStackTrace();//���� �߻� ��� ȣ�⽺�ÿ� �ִ� �޼����� ������ ���� �޼����� ȭ�鿡 ���
		}
	}
	public void discon() {
		try {
			if(rs != null){
				rs.close();
			}
			pstmt.close();
			conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//CRUD ����
	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		//dbConnection 1��° ������� ����(conn��)
		String sql="insert into servlet_login_01 values(?,?,?,?,?)";
		try {
			conn=db.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, m.getEmail());
			pstmt.setString(2, m.getPwd());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getBirth());
			pstmt.setString(5, m.getGender());
			pstmt.executeUpdate();
		} catch(SQLException e) {//sql�� ����
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		String sql="update servlet_login_01 set pwd=?,name=?,regdate=?,gender=? where email=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, m.getPwd());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getBirth());
			pstmt.setString(4, m.getGender());
			pstmt.setString(5, m.getEmail());
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		String sql="delete servlet_login_01 where email=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}
	@Override
	public Member select(String email) {
		// TODO Auto-generated method stub
		String sql="select * from servlet_login_01 where email=?";
		Member member = null;
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, email);
			rs= pstmt.executeQuery();
			if(rs.next()) {
				member = new Member(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return member;
	}

}
