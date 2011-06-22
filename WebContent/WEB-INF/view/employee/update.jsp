<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

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
  
   <form action="<%=request.getContextPath()%>/employee/update/${employee.id}" method="post">
   <input type="hidden" name="id" value="${employee.id}">
   	登录名：<input name="loginName" value="${employee.loginName}"><br/>
   	姓名：<input name="name" value="${employee.name}"><br/>
   	密码：<input type="password" name="password" value="${employee.password}"><br/>
   	
   	性别：<select name="gender">
   			<c:if test="${employee.gender == 'M'}">
   				<option value="M" selected="selected">男</option>
   				<option value="F">女</option>
   			</c:if>
   			<c:if test="${employee.gender == 'F'}">
   			<option value="M">男</option>
   				<option value="F" selected="selected">女</option>
   			</c:if>
   	   		<c:if test="${employee.gender == null }">
   				<option value="M">男</option>
   				<option value="F">女</option>
   			</c:if>   			
   		</select><br/>

	入职日期：
   	<input class="Wdate" name="employmentDate" value="<fmt:formatDate value="${employee.employmentDate}" pattern="yyyy-MM-dd"/>" onClick="WdatePicker()"><br/>
   	
   	手机：<input name="mobilePhone" value="${employee.mobilePhone}"><br/>
   	公司邮箱：<input name="officeEmail" value="${employee.officeEmail}"><br/>

   	部门：
   <select name="title.id">
   		<c:forEach items="${titleList}" var="title">
   			<c:if test="${title.id == employee.title.id}">
		   		<option value="${title.id}" selected="selected">${title.name}</option>
   			</c:if>
   			<c:if test="${title.id != employee.title.id}">
		   		<option value="${title.id}">${title.name}</option>
   			</c:if>
	   </c:forEach>
   	</select>
	<input type="submit" value="提交">
   </form>
  </body>
</html>