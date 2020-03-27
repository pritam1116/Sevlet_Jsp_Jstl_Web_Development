<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
	<%
	    String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		String USER = "SYSTEM";
		String PASS = "Rahul007";
		String sql = "select *from student where Roll_Num=100";
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con = DriverManager.getConnection(URL, USER, PASS);
	    Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery(sql);
	    rs.next();
	    //out.println(rs.getString(1));
	%>
	Name: <%= rs.getString(1) %><br>
	Roll_Num: <%= rs.getString(2) %>


</body>
</html>
