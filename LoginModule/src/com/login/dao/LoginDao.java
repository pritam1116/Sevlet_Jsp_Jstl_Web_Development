package com.login.dao;

import java.sql.*;



public class LoginDao {

	
		
		public boolean check(String uname,String pass) {
			
			try {
				
				String url = "jdbc:oracle:thin:@localhost:1521:orcl";
				
				String user = "SYSTEM";
				
				String password = "Rahul007";
				
				String sql = "select *from login where uname=? and pass=? ";
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				Connection con = DriverManager.getConnection(url,user,password);
				
				PreparedStatement st = con.prepareStatement(sql);
				
				st.setString(1, uname);
				
				st.setString(2, pass);
				
				ResultSet rs = st.executeQuery();
				
				if(rs.next()) {
					
					return true;
				}
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return false;
		
	}

}
