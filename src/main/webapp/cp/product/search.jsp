<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <%@include file="/cp/layout/head.jsp"%>
</head>
<body>
<div class="container">
    <div>
        <table class="table table-hover" >
            <thead style="font-size: 23px; color: #555d2f;">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>PRICE</th>
                <th>INFORMATION</th>
                <th>ACTION</th>
            </tr>
            </thead>
            <tbody style="font-style: oblique;">
            <c:forEach items="${requestScope['productList']}" var="item">
                <tr>
                    <td>${item.getId()}</td>
                    <td>${item.getName()}</td>
                    <td>${item.getPrice()}</td>
                    <td>${item.getInformation()}</td>
                    <td>
                        <a href="/product?action=edit&id=${item.getId()}">
                            <button type="button" class="btn btn-outline-primary"> <i class="fa-solid fa-pen-to-square"></i></button>
                        </a>
                        <a href="/product?action=delete&id=${item.getId()}">
                            <button type="button" class="btn btn-outline-primary"><i class="fa-solid fa-trash-can"></i></button>
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
