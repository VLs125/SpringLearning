<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>details confirm</title>
</head>
<body>
<h2> Please enter your details</h2>

<div class="main">
    <form action="/employee/showDetails" method="get">
        <input type="text" name="employeeName"
        placeholder="Write your name"/>
        <input type="submit">
    </form>
</div>
</body>
</html>
