package OrderDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.DBConnect;
import model.Order;
import model.Product;

public class OrderDaoImpl implements OrderDao{
	public Connection conn=null;
	public ResultSet rs= null;
	public PreparedStatement pstmt= null;
	public String jdbc_driver="oracle.jdbc.driver.OracleDriver";
	public String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
	public Order o= null;
	private DBConnect db;
	public OrderDaoImpl() {
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
	public void insert(Order o) {
		// TODO Auto-generated method stub
		String sql=" insert into SERVLET_MUSIC_PRODUCT_ORDER values((select 'O' || to_char(sysdate,'yyyymmdd') || LPAD(nvl(max(substr(o_num,11))+1,1),4,'0') from \r\n"
				+ " SERVLET_MUSIC_PRODUCT_ORDER where substr(o_num,2,8) = to_char(sysdate,'yyyymmdd')),?,?,sysdate,?)";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, o.getO_pnum());
			pstmt.setString(2, o.getO_mno());
			pstmt.setString(3, o.getO_state());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
	}
	@Override
	public Order select(String o_num) {
		// TODO Auto-generated method stub
		String sql="select * from SERVLET_MUSIC_PRODUCT_ORDER where o_num=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, o_num);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				o = new Order(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		return o;
	}
	@Override
	public ArrayList<Order> selectAll(String o_mno, String o_state) {
		// TODO Auto-generated method stub
		String sql="select * from SERVLET_MUSIC_PRODUCT_ORDER";
		ArrayList<Order> list= new ArrayList<Order>();

		try {
			con();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				o =new Order(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5));
				list.add(o);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		return list;
	}
	@Override
	public void delete(String o_num) {
		// TODO Auto-generated method stub
		String sql="delete SERVLET_MUSIC_PRODUCT_ORDER where o_num=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,o_num);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
	}
	@Override
	public void update(String o_num) {
		// TODO Auto-generated method stub
		String sql="update SERVLET_MUSIC_PRODUCT_ORDER set o_date=sysdate,o_state=? where o_num=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,o.getO_state());
			pstmt.setString(2,o.getO_num());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
	}
	
}
