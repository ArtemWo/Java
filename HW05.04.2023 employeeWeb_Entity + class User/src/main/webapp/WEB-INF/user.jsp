
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h2>User by ID</h2>
    <table class="table table-hover">
        <tbody>
        <tr>
            <th>Name</th>
            <th>Password</th>
            <th>Id</th>
            <th>Role</th>
            <th>E-mail</th>
        </tr>
        <c items="${userById}" var="user">
            <tr>
                <td>${userById.username}</td>
                <td>${userById.password}</td>
                <td>${userById.id}</td>
                <td>${userById.role}</td>
                <td>${userById.email}</td>
            </tr>
        </c>
        </tbody>
    </table>
</div>
</body>
</html>
