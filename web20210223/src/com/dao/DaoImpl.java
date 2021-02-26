package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.pojo.Member;
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
	
	@Override
	public Member queryOne(int id) {
		// TODO Auto-generated method stub
		dbConn = new DBUtil();
		Connection conn = dbConn.getConnection();
		PreparedStatement pre = null;
		try {
			String sql = SQLUtil.select_one_member;
			pre = conn.prepareStatement(sql);
			pre.setInt(1, id);
			ResultSet rs = pre.executeQuery();
			Member m = new Member();
			if(rs.next()) {
				m.setId(id);
				m.setName(rs.getString("name"));
				m.setSex(rs.getString("sex"));
				m.setAge(rs.getInt("age"));
				m.setSalary(rs.getInt("salary"));
				m.setDepartment(rs.getString("department"));
				return m;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	@Override
	public ArrayList<Member> queryAll() {
		// TODO Auto-generated method stub
		dbConn = new DBUtil();
		Connection conn = dbConn.getConnection();
		PreparedStatement pre = null;
		ArrayList<Member> members = new ArrayList<Member>();
		try {
			String sql = SQLUtil.select_all_members;
			pre = conn.prepareStatement(sql);

			ResultSet rs = pre.executeQuery();
			while(rs.next()) {
				Member m = new Member();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setSex(rs.getString("sex"));
				m.setAge(rs.getInt("age"));
				m.setSalary(rs.getInt("salary"));
				m.setDepartment(rs.getString("department"));
				members.add(m);
			}
			
			return members;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public boolean queryUser(User user){
		dbConn = new DBUtil();
		Connection conn = dbConn.getConnection();
		PreparedStatement pre = null;
		ArrayList<Member> members = new ArrayList<Member>();
		try {
			String sql = SQLUtil.USER_LOGIN;
			pre = conn.prepareStatement(sql);
			pre.setString(1,user.getUsername());
			pre.setString(2,user.getUserpass());
			ResultSet rs = pre.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		return false;
	}

}
