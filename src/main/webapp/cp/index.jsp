<!DOCTYPE html>
<html lang="en">
<head>
  <title>Minton - Responsive Admin Dashboard Template</title>
<%@include file="/cp/layout/head.jsp"%>
  <style>
    .navbar-custom {
      background-color: #3c1b1b;
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
              <h4 class="page-title" style="font-size: 68px; font-style: normal; background-color: lightgrey;text-align: center; margin-right: inherit;margin-left: inherit;">MENU CAFE
                      <div class="input-group">
                        <form method="get" class="app-search">
                        <input name="search" type="text" class="form-control" placeholder="Search...">
                        <div class="input-group-append">
                          <button class="btn" type="submit">
                            <i class="fe-search"></i>
                          </button>
                        </div>
                        </form>
                    </div>
                  </form>
                </h4>
            </div>
            <%@include file="/cp/product/list.jsp"%>
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
<%--          <div class="col-md-6">--%>
<%--            <div class="text-md-right footer-links d-none d-sm-block" style="background-color: #0017ff;">--%>
<%--              <a href="javascript:void(0);">About Us</a>--%>
<%--              <a href="javascript:void(0);">Help</a>--%>
<%--              <a href="javascript:void(0);">Contact Us</a>--%>
<%--            </div>--%>
<%--          </div>--%>
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