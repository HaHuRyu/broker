<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>회원 리스트</title>
</head>
<body>
  <c:set var="list" value="${List}"/>
  
    <c:forEach items="#{list}" var="dto">

        ${dto.user_nick}
    </c:forEach>

</body>
</html>
