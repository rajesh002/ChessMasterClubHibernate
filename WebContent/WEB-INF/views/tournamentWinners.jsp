<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>  
<%@page import="utility.ConnectionManager"%>
<%@page import="java.time.LocalDate" %>
<%@page import="java.sql.Date" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Winners</title>
</head>
<body>

<%LocalDate date = (LocalDate)request.getAttribute("date"); %>

<%
Connection con=ConnectionManager.getConnection();
		
		PreparedStatement pstmt = con.prepareStatement("select tournament.name,tournament.start_date,tournament.end_date,players.name from players,tournament where ? BETWEEN tournament.start_date AND tournament.end_date and (players.final_result='Win' and players.tournament_id=tournament.id)");
		pstmt.setDate(1,Date.valueOf(date));
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()==false) {
			con.close();
		}
		else {
%>

<table border="1">
<tr>
<td>Tournament</td>
<td>Start Date</td>
<td>End Date</td>

  
</tr> 

<%
while(rs.next()) {
%>


<tr>
<td><%=rs.getString(1)%></td>
<td><%=rs.getDate(2).toLocalDate()%></td>
<td><%=rs.getDate(3).toLocalDate() %></td>
<td><%=rs.getString(4) %></td>
</tr>
<%
}
			con.close();
			
		}%>
</table>

</body>
</html>