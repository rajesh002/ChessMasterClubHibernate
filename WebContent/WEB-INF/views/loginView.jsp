<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
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
    <div class="login-form">
        <form action="${pageContext.request.contextPath}/login" method="post">
            <div><label class="label" for="Username">Username</label>
            <input type="text" name="Username" id="Username"></div>
            <div><label class="label" for="password">Password</label>
            <input type="password" name="password" id="password"></div>
            <button class="button1" type="submit">Login</button>
        </form>
    </div>
</body>
</html>