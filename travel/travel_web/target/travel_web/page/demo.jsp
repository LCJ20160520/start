<%--
  Created by IntelliJ IDEA.
  User: changjiang
  Date: 2020/3/26
  Time: 19:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table id="dataList"
       class="table table-bordered table-striped table-hover dataTable">
    <thead>
    <tr>
        <th class="" style="padding-right: 0px;"><input
                id="selall" type="checkbox" class="icheckbox_square-blue">
        </th>
        <th class="sorting_asc">ID</th>
        <th class="sorting_desc">编号</th>
        <th class="sorting_asc sorting_asc_disabled">产品名称</th>
        <th class="sorting_desc sorting_desc_disabled">出发城市</th>
        <th class="sorting">出发时间</th>
        <th class="text-center sorting">产品价格</th>
        <th class="sorting">产品描述</th>
        <th class="text-center sorting">状态</th>
        <th class="text-center">操作</th>
    </tr>
    </thead>
    <tbody>


    <c:forEach items="${productList}" var="product">

        <tr>
            <td><input name="ids" type="checkbox"></td>
            <td>${product.id }</td>
            <td>${product.productNum }</td>
            <td>${product.productName }</td>
            <td>${product.cityName }</td>
            <td>${product.departureTimeStr }</td>
            <td class="text-center">${product.productPrice }</td>
            <td>${product.productDesc }</td>
            <td class="text-center">${product.productStatusStr }</td>
            <td class="text-center">
                <button type="button" class="btn bg-olive btn-xs">订单</button>
                <button type="button" class="btn bg-olive btn-xs">详情</button>
                <button type="button" class="btn bg-olive btn-xs">编辑</button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
    <!--
<tfoot>
<tr>
<th>Rendering engine</th>
<th>Browser</th>
<th>Platform(s)</th>
<th>Engine version</th>
<th>CSS grade</th>
</tr>
</tfoot>-->
</table>
</body>
</html>
