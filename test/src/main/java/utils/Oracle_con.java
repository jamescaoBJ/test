package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class Oracle_con {
	
	
	public static void main(String[] args) {
		try {
			//System.out.println(getConn());
			String ss="1.项目学习过程中，设置有任务点，请认真完成各项任务点； 2.为保证学习质量，请按照课程顺序学习，不可跳过、快进。";
			System.out.println(ss.indexOf("；"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getConn() throws Exception{
		
		 String URL="jdbc:mysql://localhost:3306/cpd_test2";
		 String USER="root";
		 String PASSWORD="12345678";
		 Class.forName("com.mysql.jdbc.Driver");
		 Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
		 return conn;
	}

}
