<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 6/28/2022
  Time: 9:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<hr />
<form action="RegisterServlet" method="post" enctype="multipart/form-data">
    Name: <input type="text" name="name" placeholder="Name"> <br /> <br />
    Image: <input type="file" name="image" placeholder="Image"> <br /> <br />

    <input type="submit" value="Register">
    <input type="reset" value="Reset">
    <img src="/UploadFileServlet">
    <img src="RegisterServlet">
    <img src="">

</form>

</body>
</html>
