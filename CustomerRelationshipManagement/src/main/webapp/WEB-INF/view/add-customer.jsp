<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Relationship Management :- Add/Update Customer</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/add-customer-style.css"/>
</head>
<body>

<div id="wrapper">
    <div id="header">
        <h2>Customer Relationship Management :- Add/Update Customer</h2>
    </div>
</div>

<div id="container">

    <p>
    <h2>Save Customer</h2>
    </p>

    <form:form action="saveCustomer" modelAttribute="customer" method="post">
        <form:hidden path="id"></form:hidden>
        <table>
            <tbody>
            <tr>
                <td>First Name</td>
                <td><form:input path="firstName"></form:input></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><form:input path="lastName"></form:input></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><form:input path="email"></form:input></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save" class="save"></td>
            </tr>
            </tbody>
        </table>
    </form:form>

    <div style="clear:both;"></div>

    <p>
        <a href="list">Back to List</a>
    </p>
</div>
</body>
</html>