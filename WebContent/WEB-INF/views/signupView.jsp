<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>CHESS MASTER CLUB</title>
    <link type="text/css" rel="stylesheet" href="./css/style.css">
</head>
<body>

<div id="header">
<h1>ChessMaster Club</h1>
</div>
<nav>
        <ul>
        <li></li>
            <li> <a href="${pageContext.request.contextPath}/login">Login</a></li>
            <li> <a href="${pageContext.request.contextPath}/signup">Sign Up</a></li>
        </ul>
    </nav>
	<div class="signup-form">
        <form action="${pageContext.request.contextPath}/signup" method="post">
            <div><label class="label" for="Username">Username</label>
            <input type="text" name="Username" id="Username"></div>
            <div><label class="label" for="password">Password</label>
            <input type="password" name="password" id="password"></div>
            <div><label class="label" for="confirmPassword">Confirm Password</label>
            <input type="password" name="confirmPassword" id="confirmPassword"></div>
            <button class="button1" type="submit">SignUp</button>
        </form>
    </div>
</body>
</html>