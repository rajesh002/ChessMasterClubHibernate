<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>  
<%@page import="java.time.LocalDate"%>
<%@page import="utility.ConnectionManager"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Tournaments</title>
</head>
<body>

<% 
PreparedStatement pstmt1;
ResultSet rs1 ;
String status;
Connection con=ConnectionManager.getConnection();
PreparedStatement pstmt = con.prepareStatement("select * from tournament");
ResultSet rs = pstmt.executeQuery();
%>


<table border="1">
<tr>
<td>TOURNAMENT_ID</td>
<td>NAME</td>
<td>STARTDATE</td>
<td>ENDDATE</td> 
<td>STATUS</td>   
</tr> 

<%
while (rs.next()) {
	pstmt1 = con.prepareStatement("select * from players where tournament_id=? and final_result=?");
	pstmt1.setInt(1,rs.getInt("id"));
	pstmt1.setString(2, "Win");
	rs1 = pstmt1.executeQuery();
	if(rs1.next())
		status="Completed";
	else
		status="Running";
%>

<tr>
<td><%=rs.getInt("id")%></td>
<td><%=rs.getString("name")%></td>
<td><%=rs.getDate("start_date").toLocalDate() %></td>
<td><%=rs.getDate("end_date").toLocalDate() %></td>
<td><%=status %></td>
</tr>

<%
}
con.close();
%> 

</table>

</body>
</html>