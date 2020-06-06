function newTournament() {
  		document.getElementById("newTournament").style.display = "block";
  		document.getElementById("newPlayer").style.display = "none";
  		document.getElementById("recordWin").style.display = "none";
  		document.getElementById("recordLoss").style.display = "none";
  		document.getElementById("tournamentWinner").style.display = "none";
  		document.getElementById("PlayersOfTournament").style.display = "none";
  		document.getElementById("pendingRequests").style.display = "none";
  		document.getElementById("update").style.display = "none";
  		document.getElementById("deleted").style.display = "none";
}
	function newPlayer() {
  		document.getElementById("newPlayer").style.display = "block";
  		document.getElementById("newTournament").style.display = "none";
  		document.getElementById("recordWin").style.display = "none";
  		document.getElementById("recordLoss").style.display = "none";
  		document.getElementById("tournamentWinner").style.display = "none";
  		document.getElementById("PlayersOfTournament").style.display = "none";
  		document.getElementById("pendingRequests").style.display = "none";
  		document.getElementById("update").style.display = "none";
  		document.getElementById("deleted").style.display = "none";
}
	function recordWin() {
		document.getElementById("recordWin").style.display = "block";
  		document.getElementById("newPlayer").style.display = "none";
  		document.getElementById("newTournament").style.display = "none";
  		document.getElementById("recordLoss").style.display = "none";
  		document.getElementById("tournamentWinner").style.display = "none";
  		document.getElementById("PlayersOfTournament").style.display = "none";
  		document.getElementById("pendingRequests").style.display = "none";
  		document.getElementById("update").style.display = "none";
  		document.getElementById("deleted").style.display = "none";
  		
}	
	function recordLoss() {
		document.getElementById("recordLoss").style.display = "block";
		document.getElementById("recordWin").style.display = "none";
  		document.getElementById("newPlayer").style.display = "none";
  		document.getElementById("newTournament").style.display = "none";
  		document.getElementById("tournamentWinner").style.display = "none";
  		document.getElementById("PlayersOfTournament").style.display = "none";
  		document.getElementById("pendingRequests").style.display = "none";
  		document.getElementById("update").style.display = "none";
  		document.getElementById("delete").style.display = "none";
  		
}
	function tournamentWinner() {
		document.getElementById("tournamentWinner").style.display = "block";
		document.getElementById("recordLoss").style.display = "none";
		document.getElementById("recordWin").style.display = "none";
  		document.getElementById("newPlayer").style.display = "none";
  		document.getElementById("newTournament").style.display = "none";
  		document.getElementById("PlayersOfTournament").style.display = "none";
  		document.getElementById("pendingRequests").style.display = "none";
  		document.getElementById("update").style.display = "none";
  		document.getElementById("deleted").style.display = "none";
  		
}
	function playersOfTournament() {
		document.getElementById("PlayersOfTournament").style.display = "block";
		document.getElementById("tournamentWinner").style.display = "none";
		document.getElementById("recordLoss").style.display = "none";
		document.getElementById("recordWin").style.display = "none";
  		document.getElementById("newPlayer").style.display = "none";
  		document.getElementById("newTournament").style.display = "none";
  		document.getElementById("pendingRequests").style.display = "none";
  		document.getElementById("update").style.display = "none";
  		document.getElementById("deleted").style.display = "none";
  		
}
	function requests() {
		document.getElementById("pendingRequests").style.display = "block";
		document.getElementById("tournamentWinner").style.display = "none";
		document.getElementById("recordLoss").style.display = "none";
		document.getElementById("recordWin").style.display = "none";
  		document.getElementById("newPlayer").style.display = "none";
  		document.getElementById("newTournament").style.display = "none";
  		document.getElementById("PlayersOfTournament").style.display = "none";
  		document.getElementById("update").style.display = "none";
  		document.getElementById("deleted").style.display = "none";
}
	
	function update() {
		document.getElementById("pendingRequests").style.display = "none";
		document.getElementById("tournamentWinner").style.display = "none";
		document.getElementById("recordLoss").style.display = "none";
		document.getElementById("recordWin").style.display = "none";
  		document.getElementById("newPlayer").style.display = "none";
  		document.getElementById("newTournament").style.display = "none";
  		document.getElementById("PlayersOfTournament").style.display = "none";
  		document.getElementById("update").style.display = "block";
  		document.getElementById("deleted").style.display = "none";
}
	
	function deleted() {
		document.getElementById("deleted").style.display = "block";
		document.getElementById("pendingRequests").style.display = "none";
		document.getElementById("tournamentWinner").style.display = "none";
		document.getElementById("recordLoss").style.display = "none";
		document.getElementById("recordWin").style.display = "none";
  		document.getElementById("newPlayer").style.display = "none";
  		document.getElementById("newTournament").style.display = "none";
  		document.getElementById("PlayersOfTournament").style.display = "none";
  		document.getElementById("update").style.display = "none";
}
	
	function tournamentWinners() {
  		document.getElementById("tournamentWinners").style.display = "block";
  		document.getElementById("requestToJoin").style.display = "none";
}
	function requestToJoin() {
  		document.getElementById("requestToJoin").style.display = "block";
  		document.getElementById("tournamentWinners").style.display = "none";
}