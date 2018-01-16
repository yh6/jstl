package com.iot.test.service;

import javax.servlet.http.HttpServletRequest;

public interface MenuService {
	public void setMenuList(HttpServletRequest req);
	public void setMenu(HttpServletRequest req);
	public void insertMenu(HttpServletRequest req);
	public void updateMenu(HttpServletRequest req);
	public void deleteMenu(HttpServletRequest req);

}
