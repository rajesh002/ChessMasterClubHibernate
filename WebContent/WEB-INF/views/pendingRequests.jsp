<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>  
<%@page import="utility.ConnectionManager"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Players</title>
</head>
<body>


<%
Connection con=ConnectionManager.getConnection();
PreparedStatement pstmt = con.prepareStatement("select * from requests where status=?");
pstmt.setString(1, "Pending");
ResultSet rs = pstmt.executeQuery();		
%>



<table border="1">
<tr>
<td>PLAYER_ID</td>
<td>NAME</td>
<td>AGE</td>
<td>PLACE</td> 
  
</tr> 

<%
while (rs.next()) {
%>


<tr>
<td><%=rs.getInt("id")%></td>
<td><%=rs.getString("name")%></td>
<td><%=rs.getInt("age") %></td>
<td><%=rs.getString("place") %></td>

</tr>



<%
}
con.close();
%> 

</table>

</body>
</html>