package com.iot.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iot.test.common.DBUtil;
import com.iot.test.dao.CustomerDAO;
import com.iot.test.test.DBConTest;
import com.iot.test.vo.Customer;
import com.iot.test.vo.Menu;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public List<Customer> selectCustomerList(String orderStr, int check) {
		List<Customer> customerList = new ArrayList<Customer>();	
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;		
	
		try {
			String sql = "select * from customer";
			con = DBConTest.getCon();
			if(orderStr!=null ) {
				if(check ==0) {
					sql +=" order by " + orderStr;
				}else {
					sql +=" order by " + orderStr + " desc";
				}
			} 
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Customer c = new Customer();	
				c.setCustomerID(rs.getInt("customerid"));
				c.setCustomerName(rs.getString("customername"));
				c.setCity(rs.getString("city"));
				c.setCountry(rs.getString("country"));
				customerList.add(c);
				//System.out.println(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs);
			DBUtil.close(ps);
			DBUtil.close(con);
		}
		return customerList;
	}
}	

