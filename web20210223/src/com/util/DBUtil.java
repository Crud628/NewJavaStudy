package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBUtil {
	private static Connection connection;
	private static PreparedStatement pst;

	/**
	 * 得到连接接口
	 * 
	 * @return
	 */
	public Connection getConnection() {
		// 导入对应的jar包
		try {
			// 0.读取.properties文件
			Properties pps = new Properties();
			InputStream is = DBUtil.class.getClassLoader().getResourceAsStream("mysql.properties");
			pps.load(is);

			// 1.加载驱动
			Class.forName(pps.getProperty("driver"));

			// 2.建立连接
			connection = DriverManager.getConnection(pps.getProperty("url"), pps.getProperty("username"),
					pps.getProperty("pass"));
			// System.out.println(connection); //测试连接
			return connection;
		} catch (ClassNotFoundException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void close(Connection conn,Statement sta,PreparedStatement pst,ResultSet rs) {
		
			try {
				if(rs != null) {
					rs.close();
				}
				if(pst != null) {
					pst.close();
				}
				if(sta != null) {
					sta.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	public static void main(String[] args) {

		System.out.println(new DBUtil().getConnection());
		
	}

}
