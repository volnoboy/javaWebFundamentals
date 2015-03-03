
<html>

<body>
<%@include file="header.jsp"%>
<div class="${app["formCssClass"]["name"]}">
    <c:if test="${!empty user.name}">
        <h2>Welcome ${user.name}</h2>
    </c:if>
    <c:if test="${empty user.name}">
        <h2>Welcome stranger</h2>
    </c:if>

    <c:choose>
        <c:when test="${!empty user.name}">
            <h2>Welcome ${user.name}</h2>
        </c:when>
        <c:otherwise><h2>Welcome stranger</h2></c:otherwise>
    </c:choose>

    <c:out value="Hello Everybody"/>
    <h2>${3+2}</h2>
    <h2>${3!=2}</h2>

    <ul class="nav nav-tabs">
        <c:forEach items="${app.tabs}" var="tab">
            <li><a href="${tab.url}">${tab.name}</a></li>
        </c:forEach>
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
