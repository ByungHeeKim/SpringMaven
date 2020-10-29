<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page import="java.util.*" %>
<%@ page import="com.hello.web.*" %>
<%@ page import="com.hello.web.vo.*" %>
<%@ page import="org.springframework.web.servlet.ModelAndView" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello List</title>
</head>
<body>

	<h1> Hello World List </h1>
	<c:forEach items="${HelloList}" var="hello">
		${hello.subject} ${hello.msg} ${hello.priority} <br/>
	</c:forEach>

</body>
</html>