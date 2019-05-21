<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
    <form action="${pageContext.request.contextPath }/home/hello" method="post">
    	<input type="text" name="userName" /><br></br>
    	<input type="password" name="password" /><br></br>
    	<input type="text" name="age" /><br></br>
    	<input type="text" name="email" /><br></br>
    	<input type="submit" value="submit" /><br></br>
    </form>
  </body>
</html>
