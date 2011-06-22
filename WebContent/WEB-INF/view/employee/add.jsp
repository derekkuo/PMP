<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>增加员工</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/My97DatePicker/WdatePicker.js"></script>

  </head>
  
  <body>
  
   <form action="<%=request.getContextPath()%>/employee/add" method="post">
   	登录名：<input name="loginName"><br/>
   	密码：<input type="password" name="password"><br/>
   	确认密码：<input type="password" name="confirmpwd"><br/>
   	姓名：<input name="name"><br/>
   	性别：<select name="gender">
   			<option value="M">男</option>
   			<option value="F">女</option>
   		</select><br/>
   	入职日期：<input class="Wdate" name="employmentDate" onClick="WdatePicker()"><br/>
   	手机：<input name="mobilePhone"><br/>
   	公司邮箱：<input name="officeEmail"><br/>
   	
   	职位：<select name="title.id">
	   		<c:forEach items="${titleList}" var="title">
		   		<option value="${title.id}">${title.name}</option>
		   </c:forEach>
	   	</select>
	  <input type="submit" value="提交">
   </form>
  </body>
</html>
