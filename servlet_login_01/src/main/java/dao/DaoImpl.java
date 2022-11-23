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
		String sql="insert into values()";
		try {
			conn=db.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(0, sql);
		} catch(SQLException e) {//sql�� ����
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	@Override
	public void update(Member m) {
		// TODO Auto-generated method stub
		String sql="insert into values()";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(0, sql);
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	@Override
	public void delete(Member m) {
		// TODO Auto-generated method stub
		String sql="insert into values()";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(0, sql);
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
	}

	@Override
	public Member select(String email) {
		// TODO Auto-generated method stub
		String sql="insert into values()";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(0, sql);
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			discon();
		}
		return null;
	}

}
