package com.iot.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.iot.test.common.DBCon;
import com.iot.test.common.DBUtil;
import com.iot.test.dao.ClassDAO;
import com.iot.test.vo.ClassInfo;

public class ClassDAOImpl implements ClassDAO {

	@Override
	public List<ClassInfo> selectClassList(ClassInfo ci) {
		List<ClassInfo> classList = new ArrayList<ClassInfo>();
		String sql = "select * from class_info where 1=1";
		if(ci!=null) {
			sql +=" and ciname like ?";
		}
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBCon.getCon();
			ps = con.prepareStatement(sql);
			if(ci!=null) {
				ps.setString(1, "%" + ci.getCiName() + "%");
			}
			rs = ps.executeQuery();
			System.out.println();
			while (rs.next()) {
				ClassInfo ci2 = new ClassInfo();
				ci2.setCiNo(rs.getInt("cino"));
				ci2.setCiName(rs.getString("ciname"));
				ci2.setCiDesc(rs.getString("cidesc"));
				classList.add(ci2);
				//System.out.println(ci2);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(rs);
			DBUtil.close(con);
			DBUtil.close(ps);
		}
		return classList;
		
	}

	@Override
	public ClassInfo selectClass(ClassInfo ci) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int inserClass(ClassInfo ci) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateClass(ClassInfo ci) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteClass(ClassInfo ci) {
		// TODO Auto-generated method stub
		return 0;
	}

}
