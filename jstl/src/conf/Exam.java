package conf;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Exam {
	
	public void init() {
		InputStream in = this.getClass().getResourceAsStream("/conf/dbconf.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
			Iterator<Object> it = prop.keySet().iterator();
			try {
				Class.forName(prop.getProperty("driver"));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String pwd = prop.getProperty("pwd");
			try {
				Connection con = DriverManager.getConnection(url,id,pwd);
				String sql = "select * from customer";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.println(rs.getString("customerName"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("연결성공");
			while(it.hasNext()) {
				String key = (String)it.next();
				System.out.println(key + "=" + prop.getProperty(key) );
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	/*static {
		System.out.println("내가 스테이틱영역 입니다. ");
	}*/
	public static void main(String[] agrs) {
		//System.out.println("프로그램시작점 메인영역");
		Exam e = new Exam();
		e.init();
		
	/*	Set<String> s = new HashSet<String>();
		s.add("abc");
		s.add("abc");
		System.out.println(s);*/
	}
}
