<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'welcome.jsp' starting page</title>
    <%@include file="/common.jsp"%>
    <script type="text/javascript" src="js/pmp-menu.js"></script>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body style="background-color: #ddddff">
  <div style="padding:5 5 100 5; margin:5 3 10 5;border:2px solid #ddddff; background-color: #ffffff;">
   	员工管理
	<ul class="box">
		<li><a href="<%=request.getContextPath()%>/employee/list">显示所有员工</a></li>
		<li><a href="<%=request.getContextPath()%>/employee/add">增加员工</a></li>
	</ul>
	<br/>
   	职位管理
	<ul class="box">
		<li>显示所有职位</li>
		<li>增加职位</li>
	</ul>
	</div>
	</body>

</html>
