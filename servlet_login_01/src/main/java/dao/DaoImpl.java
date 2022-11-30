package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conn.DBConnect;
import model.Member;

public class DaoImpl implements Dao{//Dao인터페이스를 상속
	//dbConnection을 이용한 방법 2가지
	//01. conn -> DBConnection 파일을 불러오기
	private DBConnect db;
	public DaoImpl() {
		db =DBConnect.getInstance();	
	}
	//02. 여기에 쓰기
	public Connection conn=null;
	public ResultSet rs= null;
	public PreparedStatement pstmt= null;
	public String jdbc_driver="oracle.jdbc.driver.OracleDriver";
	public String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
	public void con() {
		try {
			Class.forName(jdbc_driver);
			// 데이터베이스 연결정보를 이용해 Connection 인스턴스 확보
			conn = DriverManager.getConnection(jdbc_url, "hr", "hr");
		} catch (Exception e) {//모든 예외의 최고 조상
			e.printStackTrace();//예외 발생 당시 호출스택에 있는 메서드의 정보와 예외 메세지를 화면에 출력
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
	
	//CRUD 시작
	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		//dbConnection 1번째 방법으로 실행(conn만)
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
		} catch(SQLException e) {//sql의 예외
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
