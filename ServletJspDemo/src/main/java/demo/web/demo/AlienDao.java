package demo.web.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import demo.web.model.Alien;

public class AlienDao {

	public Alien getAlien(int aid) {
		
		Alien a = new Alien();
		a.setAid(101);
		a.setAname("Pritam");
		a.setTech("Java");
		System.out.println("a");
		try {
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			
			String user = "SYSTEM";
			
			String password = "Rahul007";
			
			
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("b");
			Connection con = DriverManager.getConnection(url,user,password);
			System.out.println("c");
			Statement st = con.createStatement();
			ResultSet rs  =  st.executeQuery("select * from alien where aid=" + aid);
			if(rs.next()) {
				a.setAid(rs.getInt("aid"));
				a.setAname(rs.getString("aname"));
				a.setTech(rs.getString("tech"));
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a;
		
	}

}
