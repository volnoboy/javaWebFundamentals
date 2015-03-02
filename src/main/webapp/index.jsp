<%@ page import="com.volnoboy.User" %>
<html>

<body>
<%@include file="header.jsp"%>
<% User user  =(User)request.getAttribute("user");
    if (user == null) {
        user = new User();
    }
    %>
<h2>Welcome <%= user.getName() %></h2>
<form action="home" method="post">
    <p>
        Name: <input type="text" name="name">
    </p>
    <p>
         <input type="submit" value="Enter name">
    </p>
</form>
</body>
</html>
