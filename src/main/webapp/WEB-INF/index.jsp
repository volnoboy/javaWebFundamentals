
<html>

<body>
<%@include file="header.jsp"%>
<div class="${app["formCssClass"]["name"]}">
<h2>Welcome ${user.name}</h2>

    <ul class="nav nav-tabs">
        <li><a href="#">${app.tabNames[0]}</a></li>
        <li><a href="#">${app.tabNames[1]}</a></li>
        <li><a href="#">${app.tabNames[2]}</a></li>
        <li><a href="#">${app.tabNames[3]}</a></li>
    </ul>
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
