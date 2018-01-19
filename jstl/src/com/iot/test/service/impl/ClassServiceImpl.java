package com.iot.test.service.impl;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.iot.test.dao.ClassDAO;
import com.iot.test.dao.impl.ClassDAOImpl;
import com.iot.test.service.ClassService;
import com.iot.test.vo.ClassInfo;

public class ClassServiceImpl implements ClassService{
	
	ClassDAO cdao = new ClassDAOImpl();
	Gson gs = new Gson();
	@Override
	public void getClassList(HttpServletRequest req) {
		ClassInfo ci = null;
		String json = req.getParameter("param"); //검색기능할때 클라이언트가 입력한값을 param으로 받는다
		if(json!=null) {
			ci = gs.fromJson(json,ClassInfo.class);	
			
		}req.setAttribute("classList",cdao.selectClassList(ci));
		//System.out.println(ci);
	}

	@Override
	public void getClass(HttpServletRequest req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertClass(HttpServletRequest req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateClass(HttpServletRequest req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteClass(HttpServletRequest req) {
		// TODO Auto-generated method stub
		
	}


	}

