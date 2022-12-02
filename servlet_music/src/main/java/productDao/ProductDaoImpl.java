package productDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conn.DBConnect;
import model.Product;



public class ProductDaoImpl implements ProductDao{
	public Connection conn=null;
	public ResultSet rs= null;
	public PreparedStatement pstmt= null;
	public String jdbc_driver="oracle.jdbc.driver.OracleDriver";
	public String jdbc_url="jdbc:oracle:thin:@localhost:1521:xe";
	public Product p= null;
	private DBConnect db;
	
	public ProductDaoImpl() {
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
	public ArrayList<Product> selectAllByP_email(String p_email) {
		//
		// TODO Auto-generated method stub
		String sql="select * from servlet_music_product where p_email=?";
		ArrayList<Product> lists= new ArrayList<Product>();
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, p_email);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				lists.add(new Product(rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		return lists;
	}

	@Override
	public Product select(String p_title) {
		// TODO Auto-generated method stub
		String sql="select * from servlet_music_product where p_title=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, p_title);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				p = new Product(rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		return p;
	}
	
	@Override
	public ArrayList<Product> selectAll() {
		// TODO Auto-generated method stub
		String sql="select * from servlet_music_product";
		ArrayList<Product> list= new ArrayList<Product>();

		try {
			con();
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				p =new Product(rs.getString(1),rs.getDate(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
				list.add(p);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		return list;
	}
	@Override
	public void insert(Product p) {
		// TODO Auto-generated method stub
		String sql="insert into servlet_music_product values(?,sysdate,?,?,?,?,?)";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, p.getP_title());
			pstmt.setString(2, p.getP_producer());
			pstmt.setString(3, p.getP_text());
			pstmt.setString(4, p.getP_img());
			pstmt.setString(5, p.getP_email());
			pstmt.setString(6, p.getP_seller());
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
	}
	@Override
	public void update(Product p) {
		// TODO Auto-generated method stub
		String sql="update servlet_music_product set p_date=sysdate, p_producer=?,p_text=?,p_img=? where p_title=?";
		String sqlImgNull="update servlet_music_product set p_date=sysdate, p_producer=?,p_text=? where p_title=?";
		try {
			con();
			if(p.getP_img()!=null) {
			pstmt=conn.prepareStatement(sql);
			}else {
				pstmt=conn.prepareStatement(sqlImgNull);
			}
			pstmt.setString(1, p.getP_producer());
			pstmt.setString(2, p.getP_text());
			if(p.getP_img()!=null) {
				pstmt.setString(3, p.getP_img());
				pstmt.setString(4, p.getP_title());
			}else {
				pstmt.setString(3, p.getP_title());
			}

			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
		
	}

	@Override
	public void delete(String p_title) {
		// TODO Auto-generated method stub
		String sql="delete servlet_music_product where p_title=?";
		try {
			con();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,p_title);
			pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			discon();
		}
	}

	

}
