<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/assets/css/style.css">
    <script src="/assets/bootstrap/js/bootstrap.bundle.min.js"></script>
    <style>

        .md-x-3-3{
            width: 500px;
            height: 200px;
            /* background: #141414; */
            margin:  500px;;
        }
        bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }
        @media (min-width: 768px) {
            bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
        b-example-divider {
            height: 3rem;
            background-color: rgba(0, 0, 0, .1);
            border: solid rgba(0, 0, 0, .15);
            border-width: 1px 0;
            box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
        }
        b-example-vr {
            flex-shrink: 0;
            width: 1.5rem;
            height: 100vh;
        }
        bi {
            vertical-align: -.125em;
            fill: currentColor;
        }

        scroller {
            position: relative;
            z-index: 2;
            height: 2.75rem;
            overflow-y: hidden;
        }

        .nav-scroller .nav {
            display: flex;
            flex-wrap: nowrap;
            padding-bottom: 1rem;
            margin-top: -1px;
            overflow-x: auto;
            text-align: center;
            white-space: nowrap;
            -webkit-overflow-scrolling: touch;
        }
        html,
        body {
            height: 100%;
        }

        body {
            display: flex;
            align-items: center;
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #f5f5f5;
        }

        .form-signin {
            max-width: 330px;
            padding: 15px;
        }

        .form-signin .form-floating:focus-within {
            z-index: 2;
        }

        .form-signin input[type="email"] {
            margin-bottom: -1px;
            border-bottom-right-radius: 0;
            border-bottom-left-radius: 0;
        }

        .form-signin input[type="password"] {
            margin-bottom: 10px;
            border-top-left-radius: 0;
            border-top-right-radius: 0;
        }

    </style>
</head>
<body>
<div></div>
<div></div>
<div></div>
<div>
    <form method="post" class="md-x-3-3" >
        <div class="mb-3-floating">
            <h1> Bạn Muốn xoá  sản phẩm</h1>
            <div>
                <button type="submit">YES</button>
                <a href="/product?action=list">
                    <button type="button" class="btn btn-outline-primary">NO</button>
            </div>
<%--            <div>--%>
<%--                <button type="submit">YES</button>--%>
<%--                <a href="/product?action=list">--%>
<%--                    <button type="button" class="btn btn-outline-primary">NO</button>--%>
<%--            </div>--%>
        </div>

    </form>
</div>
</body>
</html>
