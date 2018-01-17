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
				ui2.setUiRegdate(rs.getString("uiregdate"));
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateUser(UserInfo ui) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteUser(UserInfo ui) {
		// TODO Auto-generated method stub
		return 0;
	}

}
