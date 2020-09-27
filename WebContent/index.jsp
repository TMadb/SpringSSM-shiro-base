<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>


</head>
<body>
	
	<h2>欢迎${user}回来</h2>
	<h2>message${message}</h2>
	<a href="<c:url value='/user/logout.do' />">退出登录</a> <br />
	<a href="<c:url value='/user/add.do'/>">添加</a> <br />
	<a href="<c:url value='/user/delete.do'/>">删除</a> <br />
	<a href="<c:url value='/user/select.do'/>">查询</a> <br />
	<a href="<c:url value='/user/update.do'/>">修改</a> <br />
	
</body>
</html>