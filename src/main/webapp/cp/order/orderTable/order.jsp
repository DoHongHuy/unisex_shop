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
        <table class="table table-hover">
            <thead>
            <tr>
                <th>TABLE</th>
                <th>NAME</th>
                <th>PRICE</th>
                <th>QUANTITY</th>
                <th>TOTAL</th>
                <th>information</th>
                <th>dob</th>
                <th>CREATEBY</th>
                <th>ACTION</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope['orderList']}" var="item">
                <tr>
                    <td>${item.getTable()}</td>
                    <td>${item.getName()}</td>
                    <td>${item.getPrice()}.VND</td>
                    <td>${item.getQuantity()}</td>
                    <td>${item.getTotal()}.VND</td>
                    <td>${item.getInformation()}</td>
                    <td>${item.getDob()}</td>
                    <td>${item.getCreateBy()}</td>
                    <td>
                        <a   href="/order?action=edit&id=${item.getTable()}">
                            <button type="button" class="btn btn-outline-primary">Edit</button>
                        </a>
                        <a  href="/order?action=delete&id=${item.getTable()}" >
                            <button type="button" class="btn btn-outline-primary">Delete</button>
                        </a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
