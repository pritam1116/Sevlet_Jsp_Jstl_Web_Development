<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="demo.web.model.Alien" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan"> 
 in show alien
 <%
 Alien a = (Alien)request.getAttribute("Alien");
 out.println(a);
 %>
</body>
</html>