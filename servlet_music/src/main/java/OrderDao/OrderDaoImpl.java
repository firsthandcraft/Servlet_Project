package OrderDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public Product p= null;
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
		
	}
	@Override
	public Order select(String o_num) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Order> selectAll(String o_mno, String o_state) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void delete(String o_num) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(String o_num) {
		// TODO Auto-generated method stub
		
	}
	
}
