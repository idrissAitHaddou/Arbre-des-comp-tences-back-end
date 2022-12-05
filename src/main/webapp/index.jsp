<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="/api/user/login" method="post">
    <input type="text" placeholder="email" name="email">
    <input type="password" placeholder="password" name=password>
    <button type="submit">submit</button>
</form>
</body>
</html>