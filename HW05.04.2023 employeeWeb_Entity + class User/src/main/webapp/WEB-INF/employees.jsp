<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Employees Info</title>

    <link rel="stylesheet" href="<spring:url value="/resources/css/style.css"/>" type="text/css"/>

</head>
<body>

<spring:url value="/employees/delete" var="delUrl"/>


<div class="container">

    <h2>Employees</h2>
    <table class="table table-hover">
        <tbody>
        <tr>
            <th>Name</th><th>Surname</th><th>Id</th><th>Age</th>
        </tr>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td>${employee.name}</td>
                <td>${employee.surname}</td>
                <td>${employee.id}</td>
                <td>${employee.age}</td>
                <td>
                    <form:form action="${delUrl}" method="POST">
                        <input type="hidden" value="${employee.id}" name="employeeId">
                        <input type="submit" value="delete"/>
                    </form:form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <h2>Add new Employee:</h2>

    <spring:url value="/employees" var="formUrl"/>
    <form:form action="${formUrl}" method="POST" modelAttribute="employeeToAdd">

        <div class="row">

            <div class="form-group">
                <label for="employeeToAdd-name">Name</label>
                <form:input path="name" cssClass="form-control" id="employeeToAdd-name"/>
            </div>

            <div class="form-group">
                <label for="employeeToAdd-surname">Surname</label>
                <form:input path="surname" cssClass="form-control" id="employeeToAdd-surname"/>
            </div>

            <div class="form-group">
                <label for="employeeToAdd-id">ID</label>
                <form:input path="id" cssClass="form-control" id="employeeToAdd-id"/>
            </div>

            <div class="form-group">
                <label for="employeeToAdd-age">Age</label>
                <form:input path="age" cssClass="form-control" id="employeeToAdd-age"/>
            </div>

            <button type="submit" class="btn btn-default">Submit</button>

        </div>

    </form:form>

    <c:if test="${deleted != null}">
        <div>
            <p>Employee with id=${deleted} successfully deleted</p>
        </div>
    </c:if>
    <c:if test="${added != null}">
        <div>
            <p>Employee with id=${added} successfully added</p>
        </div>
    </c:if>

</div>
</body>
</html>