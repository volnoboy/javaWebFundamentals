<%@ tag body-content="scriptless" %>
<%@ attribute name="user" required="true" type="com.volnoboy.User" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="normalPriority" fragment="true" %>
<%@ attribute name="highPriority" fragment="true" %>
<%@ variable name-given="description" %>
<%@ variable name-given="priority" %>

<ul>
    <c:forEach items="${user.todos}" var="todo">
        <c:set var="description" value="${todo.description}"/>
        <c:set var="priority" value="${todo.priority}"/>
        <c:if test="${todo.priority == 1}" >
            <jsp:invoke fragment="normalPriority"/>
        </c:if>
        <c:if test="${todo.priority > 1}" >
            <jsp:invoke fragment="highPriority"/>
        </c:if>
    </c:forEach>
</ul>
