package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductDao {
	//jdbc ����
	//����̹�����
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	//statement:SQL�� �����ϴ� ���
	public Connection conn=null;
	public PreparedStatement pstmt =null;
	public Statement stmt=null;
	ResultSet rs= null;//
	
	//
	public static ProductDao sd=new ProductDao();

	//�޼ҵ� �����
	public static ProductDao getDao() {
		return sd;
	} 
	
	
	
	
	
	

}
