<%-- 
    Document   : forgot
    Created on : Nov 25, 2021, 1:15:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab11</title>
    </head>
    <body>
        <form method="POST" action="forgot">
            <h1>Forgot Password</h1>
            <p>Please enter your email address to retrieve your password.</p>
            Email Address:<input name="email"> 
            <br>
            <input type="submit" value="Submit">
            <input type="hidden" name="action" value="forgot">
            <br>
            <a href="login">Cancel</a>
            <br>
            <p>${emailSent}</p>
        </form>
    </body>
</html>
