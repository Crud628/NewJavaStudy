package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.pojo.User;
import com.util.DBUtil;
import com.util.SQLUtil;

public class DaoImpl implements DaoInterface{
	
	private DBUtil dbConn;
	
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		dbConn = new DBUtil();
		Connection conn = dbConn.getConnection();
		PreparedStatement pre = null;
		try {
//			String sql = "insert into userList (user_name,user_pass) values(?,?)";
			String sql = SQLUtil.add_one_user;
			pre = conn.prepareStatement(sql);
			pre.setString(1, user.getUsername());
			pre.setString(2, user.getUserpass());
			int rs = pre.executeUpdate();
			if(rs == 1) {
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

}
