package com.iot.test.service.impl;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.iot.test.dao.UserDAO;
import com.iot.test.dao.impl.UserDAOImpl;
import com.iot.test.service.UserService;
import com.iot.test.vo.UserInfo;

public class UserServiceImpl implements UserService {
	UserDAO udao = new UserDAOImpl();
	Gson gs = new Gson();
	@Override
	public void getUserList(HttpServletRequest req) {
		UserInfo ui = null;
		String searchType = req.getParameter("searchType");
		if(searchType !=null) {
			ui = new UserInfo();
			ui.setSearchType(searchType);
			if(searchType.equals("uiName")) {
				ui.setUiName(searchType);
			}else if(searchType.equals("uiAge")) {
				ui.setUiAge(Integer.parseInt(searchType));
			}else if(searchType.equals("adderss")) {
				ui.setAddress(searchType);
			}
			
		}
		req.setAttribute("userList", udao.selectUserList(ui));
	}

	@Override
	public void getUser(HttpServletRequest req) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insertUser(HttpServletRequest req) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(HttpServletRequest req) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(HttpServletRequest req) {
		// TODO Auto-generated method stub

	}

}
