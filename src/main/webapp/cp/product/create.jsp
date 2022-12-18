<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Minton - Responsive Admin Dashboard Template</title>
    <%@include file="/cp/layout/head.jsp"%>
</head>
<style>
</style>
<body>
<div id="wrapper">
    <div class="navbar-custom" style=" background-color: #3c1b1b;">
        <%@include file="/cp/layout/navbar/topnav-menu-left.jsp"%>
        <%@include file="/cp/layout/navbar/logo-box.jsp"%>
        <%@include file="/cp/layout/navbar/topnav-menu-rigth.jsp"%>
    </div>
    <%@include file="/cp/layout/left-side-menu.jsp"%>
    <div class="content-page">
        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-12">
                        <div class="page-title-box">
                        </div>
                        <div>
                            <div>
                                    <form method="post">
                                        <div>
                                            <label for="name" class="form-label">Nhập tên sản phẩm</label>
                                            <input type="text" class="form-control" id="name" name="name">
                                        </div>
                                        <div>
                                            <label for="price" class="form-label">Nhập giá sản phẩm</label>
                                            <input type="number" required class="form-control" id="price" name="price">
                                        </div>
                                        <div>
                                            <label for="information" class="form-label">Mô tả</label>
                                            <select type="text" class="form-control" id="information" name="information"">
                                                <option>Hết hàng</option>
                                                <option>Đang bán</option>
                                                <option>Gần hết</option>
                                                <option>He he</option>
                                            </select>
                                        </div>
                                        <div>
                                            <button class="w-100 btn btn-lg btn-primary" type="submit"  style="background-color: #9d6262;">Create</button>
                                        </div>
                                        <div>
                                            <div class="footer" style="bottom: auto; background-color: #f5f6f8; color: red" >
                                                <c:if test="${requestScope['success'] == true}">
                                                    <ul class="success">
                                                        <li>Thêm mới thành công</li>
                                                    </ul>
                                                </c:if>
                                                    <ul class="error">
                                                        <c:forEach items="${requestScope['errors']}" var="item">
                                                            <li>${item}</li>
                                                        </c:forEach>
                                                    </ul>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                    </div>
                </div>
            </div> <!-- content -->
            <!-- Footer Start -->


            <footer class="footer" >
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-6">
                            2016 - 2022 &copy; Minton theme by <a href="">Coderthemes</a>
                        </div>
                    </div>
                </div>
            </footer>


<%--            <footer class="footer" >--%>
<%--                <div class="container-fluid">--%>
<%--                    <div class="row">--%>
<%--                        <div class="col-md-6">--%>
<%--                            2016 - 2022 &copy; Minton theme by <a href="">Coderthemes</a>--%>
<%--                        </div>--%>
<%--                        <div class="col-md-6">--%>
<%--                            <div class="text-md-right footer-links d-none d-sm-block">--%>
<%--                                <a href="javascript:void(0);">About Us</a>--%>
<%--                                <a href="javascript:void(0);">Help</a>--%>
<%--                                <a href="javascript:void(0);">Contact Us</a>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </footer>--%>


            <!-- end Footer -->

        </div>

        <!-- ============================================================== -->
        <!-- End Page content -->
        <!-- ============================================================== -->


    </div>
    <!-- END wrapper -->

    <!-- Right Sidebar -->
    <%@include file="/cp/layout/right-bar.jsp"%>
    <!-- /Right-bar -->

    <!-- Right bar overlay-->
    <div class="rightbar-overlay"></div>

    <script src="/assets/js/vendor.min.js"></script>
    <script src="/assets/libs/jquery-knob/jquery.knob.min.js"></script>
    <script src="/assets/libs/peity/jquery.peity.min.js"></script>
    <script src="/assets/libs/jquery-sparkline/jquery.sparkline.min.js"></script>
    <script src="/assets/js/pages/dashboard-1.init.js"></script>
    <script src="/assets/js/app.min.js"></script>

</body>
</html>