<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--  
	<%
		String name = request.getAttribute("label").toString();
		out.println(name);
		
	%>
	${label} /* Expression Language */  <br>
	<c:out value="Hello World" /><br>
--%>	

<sql:setDataSource var="orcl" driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:orcl" user="SYSTEM" password="Rahul007" />
<sql:query var="rs" dataSource="${orcl}">select *from student</sql:query> 
<c:forEach items="${rs.rows}" var="stud">
	<c:out value="${stud.Name}"></c:out> : <c:out value="${stud.Roll_Num}"></c:out><br>
</c:forEach>

<%-- 
	${Students}<br>
	
	<c:forEach items="${Students}" var="s">
		${s} ${s.name}<br><br>
	</c:forEach>
--%>	

	
	
	

</body>
</html>