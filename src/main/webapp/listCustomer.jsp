<%--
  Created by IntelliJ IDEA.
  User: HUIYE
  Date: 2017/12/6
  Time: 16:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${list }" var="item">
    <tr>
        <td>${item.cust_name}</td>
        <%--<td>${item.price }</td>
        <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        <td>${item.detail }</td>--%>

       <%-- <td><a href="${pageContext.request.contextPath }/item/editItem.action?id=${item.id}">修改</a></td>--%>

    </tr>
</c:forEach>

</body>
</html>
