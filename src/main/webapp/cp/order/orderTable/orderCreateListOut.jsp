<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <%@include file="/cp/layout/head.jsp"%>
</head>
<body>
<div class="container">
    <div>
        <table class="table table-hover" style="  width: auto;margin-bottom: auto;color: #211111; border: solid;    text-align: right;">
            <thead>BILL CAFE</thead>
            <h4>Số bàn  <input type="number"> </h4>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>PRICE</th>
<%--                <th>TỔNG TIỀN</th>--%>
            </tr>   
            </thead>
            <tbody>
            <c:forEach items="${requestScope['productList']}" var="item">
                <tr>
                    <td>${item.getId()}</td>
                    <td>${item.getName()}<button id="back"onclick="subValue(${value.id})">-</button> <button id="back" onclick="addValue(${value.id})">+</button></td>
                    <td>${item.getPrice()}</td>
                    <td></td>
                </tr>
            </c:forEach>
            </tbody>
            <script>
                let a = 0;
            </script>
        </table>
<%--        <div style="margin-top: -557px; margin-left: 565px;">--%>
<%--            <table border="1">--%>
<%--                <thead>BILL CAFE</thead>--%>
<%--                <h4>Số bàn  <input type="number"> </h4>--%>
<%--                <tr>--%>
<%--                    <th>ID</th>--%>
<%--                    <th>PRODUCT</th>--%>
<%--                    <th>PRICE</th>--%>
<%--                    <th>QUANTITY</th>--%>
<%--                    <th>TOTAL</th>--%>
<%--                </tr>--%>
<%--                <c:forEach items="${requestScope['productList']}" var="item">--%>
<%--                    <tr>--%>
<%--                        <td>${item.getId()}</td>--%>
<%--                        <td>${item.getName()} </td>--%>
<%--                        <td>${item.getPrice()}</td>--%>
<%--                        <td></td>--%>
<%--                    </tr>--%>
<%--                </c:forEach>--%>
<%--            </table>--%>
<%--        </div>--%>

    </div>
</div>
</body>
</html>
