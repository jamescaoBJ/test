package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Oracle_con {
	
	
	public static void main(String[] args) {
		try {
			System.out.println(getConn());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConn() throws Exception{
		
		 String URL="jdbc:oracle:thin:@192.168.1.78:1521:orcl";
		 String USER="tbszyy";
		 String PASSWORD="tbszyy";
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
		 return conn;
	}

}
