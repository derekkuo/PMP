<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>login</title>
    <%@include file="/common.jsp"%>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
  	<div align="center" style="margin-top:50px;">
    <span style="margin-bottom:50px; margin-left:10px; font-size:20px;">项目经理综合管理系统</span>
    
    <form action="employee/login" method="post">
    	账号：<input name="loginName"><br/>
    	密码：<input type="password" name="password"><br/>
    	<input type="submit" value="登陆">
    </form>
    ${message}
    </div>
  </body>
</html>
