package com.iot.test.service;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public interface ClassService {
	
	public void getClassList(HttpServletRequest req);
	public void getClass(HttpServletRequest req);
	public void insertClass(HttpServletRequset req);
	public void updateClass(HttpServletRequset req);
	public void deleteClass(HttpServletRequset req);

}
