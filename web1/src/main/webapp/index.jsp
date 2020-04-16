<%--
  Created by IntelliJ IDEA.
  User: changjiang
  Date: 2020/3/25
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <form action="/User/login" method="post">
            用户名:<input type="text" name="username" placeholder="用户名">
            密码： <input type="password" name="password" placeholder="密码">
            <input type="submit" value="提交">
        </form>
</body>
</html>
