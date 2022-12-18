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
            </tr>
            </thead>
            <tbody style="font-style: oblique;">
            <c:forEach items="${requestScope['productList']}" var="item">
                <tr>
                    <td>${item.getId()}</td>
                    <td>${item.getName()}</td>



                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
