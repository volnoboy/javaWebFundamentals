
<html>

<body>
<%@include file="header.jsp"%>
<div class="${app.formCssClass}">
<h2>Welcome ${user.name}</h2>
<form action="home" method="post">
    <p>
        Name: <input type="text" name="name">
    </p>
    <p>
         <input type="submit" value="Enter name">
    </p>
</form>
</div>
</body>
</html>
