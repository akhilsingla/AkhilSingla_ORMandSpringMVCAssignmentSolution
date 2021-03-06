<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer Relationship Management</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<div id="wrapper">
    <div id="header">
        <h2>CUSTOMER RELATIONSHIP MANAGEMENT</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <button type="button" value="Add Customer" onclick="window.location.href = 'addCustomer';
                    return false;" class="add-button">Add Customer
        </button>
        <div>
            <p style="color: blue">
                <c:choose>
                    <c:when test="${not empty param.isSuccess}">
                        Customer Added/Updated Successfully
                    </c:when>
                    <c:when test="${not empty param.isDeleteSuccess}">
                        Customer Deleted Successfully
                    </c:when>
                </c:choose></p></div>
        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Action</th>
            </tr>

            <c:forEach var="customer" items="${customers}">

                <c:url var="updateLink" value="/customer/updateForm">
                    <c:param name="customerId" value="${customer.id}"></c:param>
                </c:url>

                <c:url var="deleteLink" value="/customer/deleteCustomer">
                    <c:param name="customerId" value="${customer.id}"></c:param>
                </c:url>

                <tr>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.email}</td>
                    <td><a href="${updateLink}">Update</a>
                        |
                        <a href="${deleteLink}"
                           onclick="if(!(confirm('Are you sure to delete entry of ${customer.firstName} ${customer.lastName}'))) return false">Delete</a>
                    </td>
                </tr>
            </c:forEach>

        </table>
    </div>
</div>
</body>
</html>