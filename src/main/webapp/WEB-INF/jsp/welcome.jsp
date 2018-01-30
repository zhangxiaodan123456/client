<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<link rel="stylesheet" type="text/css" href="<c:url value='/css/bootstrap.min.css'/>" />
 <script type="text/javascript" src="<c:url value='/js/jquery.min.js'/>"></script>
 <script type="text/javascript" src="<c:url value='/js/bootstrap.min.js'/>"></script>
</head>
<body>
  <nav class="navbar navbar-inverse">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href="#">Spring Boot</a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li><a href="#about">About</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container">
        <div class="starter-template">
            <h1>Spring Boot Web JSP Example</h1>
            <h2>Message: ${message}</h2>
        </div>
    </div>
  
</body>
</html>