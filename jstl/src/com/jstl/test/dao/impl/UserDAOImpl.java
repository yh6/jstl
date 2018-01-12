package com.jstl.test.dao.impl;

import java.sql.Connection;
import java.util.ArrayList;

import com.jstl.test.dao.UserDAO;
import com.jstl.test.vo.UserClass;

public class UserDAOImpl implements UserDAO{

	@Override
	public ArrayList<UserClass> selectUserList() {
		ArrayList<UserClass> uc = new ArrayList<UserClass>();
		Connection con = null;
		Resultset rs = null;
		PreparedStatement ps = null;
		
		
	
		return null;
	}

	@Override
	public UserClass selectUser(int uiNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserClass selectUser(String uiId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
