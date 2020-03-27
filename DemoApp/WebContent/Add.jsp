<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

   


</head>
<body bgcolor='cyan'>

<%-- 
      
    * There are four types of tag in jsp
      1) directive: <%@ page import=java.util.Date %>
      2) declaration: <%!  int value = 10;   %> -> outside service method of servlet & inside servlet class.
      3) scriptlet: <%  int i=request.getParameter("num"); %> -> java code inside service method of servlet.
      4) Expression: <%=k %> -> out.print(k).
     
     --%>
	<% 
		int i = Integer.parseInt(request.getParameter("num1"));
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		out.println("Output: "+k);
		%>	
</body>
</html>