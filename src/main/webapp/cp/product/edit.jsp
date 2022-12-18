<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <%@include file="/cp/layout/head.jsp"%>
</head>
<body>
<div class="container">
    <div>
        <form method="post">
            <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <input type="text" class="form-control" id="name" name="name" value="${requestScope['product'].name}">
            </div>
            <div class="mb-3">
                <label for="price" class="form-label">price</label>
                <input type="number" class="form-control" id="price" name="price" value="${requestScope['product'].price}">
            </div>
            <div class="mb-3">
                <label for="information" class="form-label">information</label>
<%--                <input type="text" class="form-control" id="information" name="information" value="${requestScope['product'].information}">--%>
                <select type="text" class="form-control" id="information" name="information" value="${requestScope['product'].information}">
                    <option>Hết hàng</option>
                    <option>Đang bán</option>
                    <option>Gần hết</option>
                    <option>He he</option>
                </select>
            </div>
            <button  type="submit" class="btn btn-outline-primary" >
                <a >Update</a>
            </button>
            <a href="/product?action=list">
                <button type="button" class="btn btn-outline-primary">COME BACK</button>
            </a>

<%--            style="color: #090b6b;"--%>

        </form>
        <div  style="color: red;;font-size: 24px;">
            <c:if test="${requestScope['success'] == true}">
                <ul class="success" style="color: #2f55a0; text-align: initial">
                    <li> Cập nhập thành công </li>
                </ul>
            </c:if>
<%--            <c:if test="${!requestScope['errors']==true}">--%>
                <c:if test="${!requestScope['errors'].isEmpty()}">
                    <ul class="error">
                        <c:forEach items="${requestScope['errors']}" var="item">
                            <li>${item}</li>
                        </c:forEach>
                    </ul>
                </c:if>
<%--            </c:if>--%>
        </div>
    </div>




<%--    <div class="footer">--%>
<%--        <c:if test="${requestScope['success'] == true}">--%>
<%--            <ul class="success">--%>
<%--                <li>Cập nhật thành công</li>--%>
<%--            </ul>--%>
<%--        </c:if>--%>
<%--        <c:if test="${requestScope['error'] == true}">--%>
<%--            <ul class="error">--%>
<%--                <li>Cập nhật thất bại</li>--%>
<%--            </ul>--%>
<%--        </c:if>--%>
<%--    </div>--%>
</div>

</body>
</html>
