package com.idea.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.idea.pojo.Member;
import com.idea.pojo.User;
import com.idea.util.DBUtil;
import com.idea.util.SQLUtil;

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



	@Override
	public boolean queryUserName(String username){
		dbConn = new DBUtil();
		Connection conn = dbConn.getConnection();
		PreparedStatement pre = null;
		try {
			String sql = SQLUtil.USER_NAME;
			pre = conn.prepareStatement(sql);
			pre.setString(1,username);
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

    @Override
    public ArrayList<Member> queryMemberPage(int page) {
        // TODO Auto-generated method stub
        dbConn = new DBUtil();
        Connection conn = dbConn.getConnection();
        PreparedStatement pre = null;
        ArrayList<Member> members = new ArrayList<Member>();
        try {
            String sql = SQLUtil.MEMBER_PAGE;
            pre = conn.prepareStatement(sql);
            pre.setInt(1,(page-1)*3);
            pre.setInt(2,3);
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
	public int getMemberTotal() {
		dbConn = new DBUtil();
		Connection conn = dbConn.getConnection();
		PreparedStatement pre = null;
		try {
			String sql = SQLUtil.MEMBER_TOTAL;
			pre = conn.prepareStatement(sql);
			ResultSet rs = pre.executeQuery();
			if(rs.next()) {
				int flag = rs.getInt(1);
				flag = (int)Math.ceil((double)(flag)/3);
				return flag;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
