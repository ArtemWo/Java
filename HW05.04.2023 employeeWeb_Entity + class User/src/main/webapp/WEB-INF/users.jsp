<%--
  Created by IntelliJ IDEA.
  User: orcaw
  Date: 20.04.2023
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">

  <h2>Users</h2>
  <table class="table table-hover">
    <tbody>
    <tr>
      <th>Name</th><th>Password</th><th>Id</th><th>Role</th><th>E-mail</th>
    </tr>
    <c:forEach items="${users}" var="user">
      <tr>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td>${user.id}</td>
        <td>${user.role}</td>
        <td>${user.email}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>

</div>
</body>
</html>
