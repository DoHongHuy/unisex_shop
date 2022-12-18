<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Users</title>
    <link rel="stylesheet" href="/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assets/css/style.css">
    <script src="/assets/bootstrap/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-lg-6">
            <h1>Cafe</h1>
        </div>
    </div>

    <div>
        <div class="col-lg-6">
            <a href="/cafe?action=create">
                <button type="button" class="btn btn-outline-success">Create User</button>
            </a>
            <a href="/cafe?action=order">
                <button type="button" class="btn btn-outline-success">Menu order</button>
            </a>
        </div>
        <table class="table table-hover">
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>PRICE</th>
                <th>information</th>
                <th>ACTION</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope['productList']}" var="item">
                <tr>
                    <td>${item.getId()}</td>
                    <td>${item.getName()}</td>
                    <td>${item.getPrice()}.VND</td>
                    <td>${item.getInformation()}</td>
                    <td>
                    <td>
                        <a href="/cafe?action=edit&id=${item.getId()}">
                            <button type="button" class="btn btn-outline-primary">Edit</button>
                                <%--                                <button type="button" class="btn btn-outline-primary">Delete</button>--%>
                        </a>
                        <a href="/cafe?action=delete&id=${item.getId()}">
                            <button type="button" class="btn btn-outline-primary">Delete</button>
                                <%--                                <button type="button" class="btn btn-outline-primary">Delete</button>--%>
                        </a>
                    </td>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
