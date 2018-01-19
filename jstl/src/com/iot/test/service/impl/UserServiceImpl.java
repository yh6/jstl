package com.iot.test.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.iot.test.dao.UserDAO;
import com.iot.test.dao.impl.UserDAOImpl;
import com.iot.test.service.UserService;
import com.iot.test.vo.UserInfo;

public class UserServiceImpl implements UserService {
	UserDAO udao = new UserDAOImpl();

	@Override
	public void getUserList(HttpServletRequest req) {
		UserInfo ui = null;
		String searchType = req.getParameter("searchType");
		String searchStr = req.getParameter("searchStr");
		if (searchType != null) {
			ui = new UserInfo();
			ui.setSearchType(searchStr);
			if (searchType.equals("uiName")) {
				ui.setUiName(searchStr);
			} else if (searchType.equals("uiAge")) {
				ui.setUiAge(Integer.parseInt(searchStr));
			} else if (searchType.equals("adderss")) {
				ui.setAddress(searchStr);
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
		UserInfo ui = new UserInfo();
		String uiName = req.getParameter("uiName");
		int uiAge = Integer.parseInt(req.getParameter("uiAge"));
		String uiId = req.getParameter("uiId");
		String uiPwd = req.getParameter("uiPwd");	
		String address = req.getParameter("address");
		ui.setUiName(uiName);
		ui.setUiAge(uiAge);
		ui.setUiId(uiId);
		ui.setUiPwd(uiPwd);
		ui.setAddress(address);		
		udao.insertUser(ui);
		
	//	req.setAttribute("", gs.toJson(rm));
		
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
