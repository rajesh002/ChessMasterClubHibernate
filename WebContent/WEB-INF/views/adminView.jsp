<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="./css/style.css">
<script src="./javascript/myscripts.js"></script>
</head>
<body>
<div id="header">
<h1>ChessMaster Club</h1>
</div>
	<button class="button"  onclick="newTournament()">Add new Tournament</button>
	<button class="button"  onclick="newPlayer()">Add player to tournament</button>
	<button class="button"  onclick="recordWin()">Record Win to player</button>
	<button class="button"  onclick="recordLoss()">Record Lose to player</button>
	<button class="button"  onclick="tournamentWinner()">Make As Tournament Winner</button>
	<button class="button"  onclick="playersOfTournament()">Players of Tournaments</button>
	<button class="button"  onclick="requests()">Pending requests</button>
	<button class="button"  onclick="update()">Rename Tournaments</button>
	<button class="button"  onclick="deleted()">Delete Tournament</button>
	
<div id="newTournament">    
<jsp:include page="displayTournament.jsp" />  

<form action="${pageContext.request.contextPath}/newTournament" method="post">
			<div><label class="label">Tournament Name</label>
            <input type="text" name="tournamentName" id="tournamentName"></div>
            <div><label class="label">Start Date</label>
            <input type="text" name="startDate" id="startDate"></div>
            <div><label class="label">End Date</label>
            <input type="text" name="endDate" id="endDate"></div>
            <button class="button1" type="submit">ADD</button>
        </form>
 </div>
 

<div id="newPlayer">
<jsp:include page="displayTournament.jsp" />  
<form action="${pageContext.request.contextPath}/newPlayer" method="post">
			<div><label class="label">Tournament ID</label>
            <input type="text" name="tournamentID" id="tournamentID"></div>
            <div><label class="label">Player Name</label>
            <input type="text" name="playerName" id="playerName"></div>
            <div><label class="label">Player Age</label>
            <input type="text" name="playerAge" id="playerAge"></div>
            <div><label class="label">Player City</label>
            <input type="text" name="PlayerCity" id="PlayerCity"></div>
            <button class="button1" type="submit">ADD</button>
        </form>
 </div>
 
<div id="recordWin">
<jsp:include page="displayTournament.jsp" />  
<form action="${pageContext.request.contextPath}/recordWin" method="post">
			<div><label class="label">Tournament ID</label>
            <input type="text" name="tournamentID" id="tournamentID"></div>
            <div><label class="label">Player ID</label>
            <input type="text" name="playerId" id="playerId"></div>
            <div><label class="label">No.Of Wins</label>
            <input type="text" name="numberOFWins" id="numberOFWins"></div>
            <button class="button1" type="submit">ADD</button>
        </form>
 </div>
 
  
<div id="recordLoss">
<jsp:include page="displayTournament.jsp" />  
<form action="${pageContext.request.contextPath}/recordLoss" method="post">
			<div><label class="label">Tournament ID</label>
            <input type="text" name="tournamentID" id="tournamentID"></div>
           <div> <label class="label">Player ID</label>
            <input type="text" name="playerId" id="playerId"></div>
            <div><label class="label">No.Of Loss</label>
            <input type="text" name="numberOFLoss" id="numberOFLoss"></div>
            <button class="button1" type="submit">ADD</button>
        </form>
 </div>
 
 
 <div id="tournamentWinner">
 <jsp:include page="displayTournament.jsp" /> 
<form action="${pageContext.request.contextPath}/tournamentWinner" method="post">
			<div><label class="label">Tournament ID</label>
            <input type="text" name="tournamentID" id="tournamentID"></div>
            <button class="button1" type="submit">Winner</button>
        </form>
 </div>
 
 
  <div id="PlayersOfTournament">
 <jsp:include page="displayTournament.jsp" /> 
<form action="${pageContext.request.contextPath}/playersOfTournament" method="post">
			<div><label class="label">Tournament ID</label>
            <input type="text" name="tournamentID" id="tournamentID"></div>
            <button class="button1" type="submit">Submit</button>
        </form>
 </div>
 
 <div id="pendingRequests">
 <jsp:include page="pendingRequests.jsp" /> 
 </div>


<div id="update">    
<jsp:include page="displayTournament.jsp" />  

<form action="${pageContext.request.contextPath}/update" method="post">
			<div><label class="label">Tournament ID</label>
            <input type="text" name="tournamentID" id="tournamentID"></div>
            <div><label class="label">New Name</label>
            <input type="text" name="tournamentName" id="tournamentName"></div>
            <button class="button1" type="submit">ADD</button>
        </form>
 </div>

 
 <div id="deleted">
 <jsp:include page="displayTournament.jsp" /> 
<form action="${pageContext.request.contextPath}/delete" method="post">
			<div><label class="label">Tournament ID</label>
            <input type="text" name="tournamentID" id="tournamentID"></div>
            <button class="button1" type="submit">DELETE</button>
        </form>
 </div>
 

</body>
</html>