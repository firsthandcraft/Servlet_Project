package musicdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.DBConnect;
import model.Music;



public class musicDaoImpl implements musicDao{
	public Connection conn=null;
	public ResultSet rs= null;
	public PreparedStatement pstmt= null;
	public String jdbc_driver="oracle.jdbc.driver.OracleDriver";
	public String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
	public Music music= null;
	private DBConnect db;
	
	public musicDaoImpl() {
		db = DBConnect.getInstance();
	}
	public void con() {
		try {
			Class.forName(jdbc_driver);
			conn=DriverManager.getConnection(jdbc_url,"hr","hr");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void discon() {
		try {
			if(rs !=null) {
				rs.close();
			}
			//
		} catch(Exception e) {
			e.printStackTrace();
		}
	}


	@Override
	public ArrayList<Music> selectAllBySeller(String seller) {
		//
		// TODO Auto-generated method stub
		String sql="select * from servlet_login_01_album where seller=?";
		ArrayList<Music> lists= new ArrayList<Music>();
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, seller);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				lists.add(new Music(rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		return lists;
	}

	@Override
	public Music select(String Mtitle) {
		// TODO Auto-generated method stub
		String sql="select * from servlet_login_01_album where title=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, Mtitle);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				music = new Music(rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		return music;
	}
	
	@Override
	public ArrayList<Music> selectAll() {
		// TODO Auto-generated method stub
		String sql="select * from servlet_login_01_album";
		ArrayList<Music> list= new ArrayList<Music>();

		try {
			con();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				music =new Music(rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				list.add(music);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		return list;
	}
	@Override
	public void insert(Music m) {
		// TODO Auto-generated method stub
		String sql="insert into servlet_login_01_album values(?,sysdate,?,?,?,?)";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, m.getMtitle());
			//pstmt.setDate(2, m.getMdate());
			pstmt.setString(2, m.getMproducer());
			pstmt.setString(3, m.getMtext());
			pstmt.setString(4, m.getMimg());
			pstmt.setString(5, m.getSeller());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
	}
	@Override
	public void update(Music m) {
		// TODO Auto-generated method stub
		String sql="update servlet_login_01_album set producer=?,redate=sysdate ,text=?,img=? where title=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, m.getMtitle());
			//pstmt.setDate(2, m.getMdate());
			pstmt.setString(2, m.getMproducer());
			pstmt.setString(3, m.getMtext());
			pstmt.setString(4, m.getMimg());
			pstmt.setString(5, m.getSeller());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		
	}

	@Override
	public void delete(String title) {
		// TODO Auto-generated method stub
		String sql="delete servlet_login_01_album where title=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,title);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
	}

	

}
