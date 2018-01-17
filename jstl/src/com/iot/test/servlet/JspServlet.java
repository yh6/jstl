package com.iot.test.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iot.test.service.ClassService;
import com.iot.test.service.CustomerService;
import com.iot.test.service.MenuService;
import com.iot.test.service.UserService;
import com.iot.test.service.impl.ClassServiceImpl;
import com.iot.test.service.impl.CustomerServiceImpl;
import com.iot.test.service.impl.MenuServiceImpl;
import com.iot.test.service.impl.UserServiceImpl;
import com.iot.test.vo.Customer;


public class JspServlet extends HttpServlet {
	private MenuService ms = new MenuServiceImpl();

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doProcess(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doProcess(req, res);
	}

	private void doProcess(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");

		String uri = req.getRequestURI();
		String root = req.getContextPath();
		uri = uri.replace(root, ""); 
		ms.setMenuList(req);
		if(uri.indexOf("user/list")!=-1) {
			UserService us = new UserServiceImpl();
			us.getUserList(req);
		}else if (uri.indexOf("class/list")!=-1) {
			ClassService cs = new ClassServiceImpl();
			cs.getClassList(req);
		}else if(uri.indexOf("menu/list")!=-1) {
			MenuService ms = new MenuServiceImpl();
			ms.setMenuList(req);
		}else if(uri.indexOf("customer/list")!=-1) {
			CustomerService c= new CustomerServiceImpl();
			c.setCustomerList(req);
		}
		uri = "/WEB-INF" + uri + ".jsp";
		RequestDispatcher rd = req.getRequestDispatcher(uri); 
		rd.forward(req, res);
		// System.out.println("URI : " + uri);
		// System.out.println("root : " + root);
	}
}
