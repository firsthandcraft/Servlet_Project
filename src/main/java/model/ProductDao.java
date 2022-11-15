package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductDao {
	//jdbc 연결
	//드라이버정보
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:xe";
	//statement:SQL을 실행하는 기능
	public Connection conn=null;
	public PreparedStatement pstmt =null;
	public Statement stmt=null;
	ResultSet rs= null;//
	
	//
	public static ProductDao sd=new ProductDao();

	//메소드 만들기
	public static ProductDao getDao() {
		return sd;
	} 
	
	
	
	
	
	

}
