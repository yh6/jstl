package com.iot.test.dao;

import java.util.List;

import com.iot.test.vo.Menu;
import com.iot.test.vo.UserInfo;

public interface MenuDAO {
	
	 public List<Menu> selectMenuList();
	 public Menu selectMenu();
	 public int insertMenu();
	 public int updateMenu();
	 public int deleteMenu();
			
}
