<!DOCTYPE html>
<html lang="en">
<head>
    <title>Minton - Responsive Admin Dashboard Template</title>
    <%@include file="/cp/layout/head.jsp"%>
    <style>
        .navbar-custom {
            background-color: #7266ba;
            padding: 0 10px 0 0;
            position: fixed;
            left: 0;
            right: 0;
            height: 70px;
            top: 0;
            z-index: 100;
        }
        .footer {
            bottom: 0;
            padding: 19px 15px 20px;
            position: absolute;
            right: 0;
            height: 0;
            color: #98a6ad;
            left: 240px;
            background-color: #fff;
            -webkit-box-shadow: 0 0 1px rgb(50 58 70 / 10%);
        }
    </style>
</head>
<body>
<div id="wrapper">
    <div class="navbar-custom">
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

<%--                            <div class="page-title-right">--%>
<%--                                <ol class="breadcrumb m-0">--%>
<%--                                    <li class="breadcrumb-item"><a href="javascript: void(0);">Minton</a></li>--%>
<%--                                    <li class="breadcrumb-item active">Dashboard</li>--%>
<%--                                </ol>--%>
<%--                            </div>--%>

                        </div>
                        <%@include file="/cp/order/orderTable/create.jsp"%>
                    </div>
                </div>
            </div> <!-- content -->
            <!-- Footer Start -->
            <footer class="footer">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-6">
                            2016 - 2022 &copy; Minton theme by <a href="">Coderthemes</a>
                        </div>
                        <div class="col-md-6">
                            <div class="text-md-right footer-links d-none d-sm-block" style="background-color: #0017ff;">
                                <a href="javascript:void(0);">About Us</a>
                                <a href="javascript:void(0);">Help</a>
                                <a href="javascript:void(0);">Contact Us</a>
                            </div>
                        </div>
                    </div>
                </div>
            </footer>
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