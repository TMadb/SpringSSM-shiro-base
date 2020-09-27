<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<link href="<c:url value='/css/mycss.css' />" type="text/css" rel="stylesheet" />
</head>
<body>
	<h2 id="red">login.jsp</h2><br />
	${msg}<br />
	<form action="<c:url value='/user/login.do'/>">
		账号：<input type="text" name="username" /><br /><br />
		密码：<input type="text" name="password" /><br /><br />
		<input type="submit" value="登录"/>
	</form>

</body>
</html>