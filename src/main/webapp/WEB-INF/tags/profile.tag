<%@ tag body-content="empty" %>
<%@ attribute name="user" required="true" type="com.volnoboy.User" %>

<table class="table table-condensed">
    <tr>
        <td>Name:</td><td>${user.name}</td>
    </tr>
    <tr>
        <td>Email:</td><td>${user.email}</td>
    </tr>
</table>