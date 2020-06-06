<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CHESS MASTER CLUB</title>
    <link type="text/css" rel="stylesheet" href="./css/style.css">
    <script src="./javascript/myscripts.js"></script>
</head>
<body>

<div id="header">
<h1>ChessMaster Club</h1>
</div>
<div id="list">
	<button class="button"  onclick="tournamentWinners()">Display Tournament Winners</button>
	<button class="button"  onclick="requestToJoin()">Request to Join</button>
</div>
	
<div id="requestToJoin">    

<form action="${pageContext.request.contextPath}/addUser" method="post">
			<div><label class="label">Player Name</label>
            <input type="text" name="playerName" id="playerName"></div>
            <div><label class="label">Player Age</label>
            <input type="text" name="playerAge" id="playerAge"></div>
            <div><label class="label">Player City</label>
            <input type="text" name="playerCity" id="playerCity"></div>
            <button class="button1" type="submit">Request</button>
        </form>
 </div>
 
 <div id="tournamentWinners">
 	<form action="${pageContext.request.contextPath}/tournamentWinners" method="post">
			<div><label class="label">Enter The Date</label>
            <input type="text" name="date" id="date"></div>
            <button class="button1" type="submit">Submit</button>
        </form>
 </div> 
</body>
</html>