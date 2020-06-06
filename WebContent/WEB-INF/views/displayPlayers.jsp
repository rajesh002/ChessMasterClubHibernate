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


<%int tournamentID = (Integer)request.getAttribute("tournamentID"); %>

<%

Connection con=ConnectionManager.getConnection();
PreparedStatement pstmt = con.prepareStatement("select players.id,players.name,ranking.win,ranking.loss from Players,ranking where players.id=ranking.id and players.tournament_id="+tournamentID);
ResultSet rs = pstmt.executeQuery();
%>


<table border="1">
<tr>
<td>PLAYER_ID</td>
<td>NAME</td>
<td>WIN</td>
<td>LOSS</td> 
  
</tr> 

<%while (rs.next()) { %>




<tr>
<td><%=rs.getInt("id")%></td>
<td><%=rs.getString("name")%></td>
<td><%=rs.getInt("win") %></td>
<td><%=rs.getInt("loss") %></td>

</tr>

<%
}
con.close();
%> 

</table>

</body>
</html>