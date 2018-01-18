package com.iot.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.iot.test.dao.CustomerDAO;
import com.iot.test.dao.impl.CustomerDAOImpl;
import com.iot.test.service.CustomerService;
import com.iot.test.vo.Customer;

public class CustomerServiceImpl implements CustomerService {
	private CustomerDAO cdao = new CustomerDAOImpl();
	@Override
	public void setCustomerList(HttpServletRequest req) {	
		//System.out.println(req.getParameter("order"));
		String check  = req.getParameter("check");
	   if(check==null || check.equals("1")) {
		   req.setAttribute("check","0");
	   }else {
		   req.setAttribute("check","1");
	   }		
		req.setAttribute("customerList", cdao.selectCustomerList(req.getParameter("order"),check));
		
		
		
	}
	
	

}
