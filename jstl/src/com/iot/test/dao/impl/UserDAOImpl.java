package com.iot.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iot.test.common.DBCon;
import com.iot.test.common.DBUtil;
import com.iot.test.dao.UserDAO;
import com.iot.test.vo.UserInfo;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<UserInfo> selectUserList(UserInfo ui) {
		List<UserInfo> userList = new ArrayList<UserInfo>();
		String sql = "select * from user_info where 1=1";
		if (ui != null) {
			sql += " and ";
			sql += ui.getSearchType();
			sql += " like ? ";
		}
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBCon.getCon();
			ps = con.prepareStatement(sql);
			if (ui != null) {
				String searchStr = ui.getUiName();
				if(ui.getSearchType().equals("uiAge")) {
					searchStr = ""+ui.getUiAge();
				}else if(ui.getSearchType().equals("address")) {
					searchStr = ""+ui.getAddress();
				}
				ps.setString(1, "%" + searchStr + "%");
			}
			rs = ps.executeQuery();
			System.out.println();
			while (rs.next()) {
				UserInfo ui2 = new UserInfo();
				ui2.setUiNo(rs.getInt("uino"));
				ui2.setUiId(rs.getString("uiid"));
				ui2.setUiAge(rs.getInt("uiage"));				
				ui2.setUiName(rs.getString("uiname"));
				ui2.setUiPwd(rs.getString("uipwd"));
				ui2.setAddress(rs.getString("address"));			
				userList.add(ui2);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.close(rs);
			DBUtil.close(ps);
			DBUtil.close(con);
		}
		return userList;

	}

	@Override
	public UserInfo selectUser(UserInfo ui) {
		return null;
	}

	@Override
	public int insertUser(UserInfo ui) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBCon.getCon();
			String sql = "insert into user_info(uiname,uiage,uiid,uipwd,address)\r\n"
					+ "values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, ui.getUiName());
			ps.setInt(2, ui.getUiAge());
			ps.setString(3, ui.getUiId());
			ps.setString(4, ui.getUiPwd());	
			ps.setString(5, ui.getAddress());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con);
			DBUtil.close(ps);
			DBUtil.close(rs);
		}
		return 1;
	}

	@Override
	public int updateUser(UserInfo ui) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBCon.getCon();
			String sql = "update user_info set uiName=?,uiAge=?,address=? where uiNo=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, ui.getUiName());
			ps.setInt(2, ui.getUiAge());
			ps.setInt(3, ui.getUiNo());
			ps.setString(4, ui.getAddress());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con);
			DBUtil.close(ps);
		}
		return 1;
	}

	@Override
	public int deleteUser(UserInfo ui) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBCon.getCon();
			String sql = "delete from user_info where uiNo=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, ui.getUiNo());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(con);
			DBUtil.close(ps);
		}
		return 1;
	}

}
