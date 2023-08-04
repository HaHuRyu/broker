<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!



</h1>

<P>  The time on the server is ${serverTime}. </P>

<a href="<%=request.getContextPath() %>/user_list.go">[회원 전체 목록]</a>

<input type="button" onclick="location.href='user_list.go'" value="회원 리스트">


</body>
</html>
