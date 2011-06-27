<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>员工列表</title>
    <%@include file="/common-table.jsp"%>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
  <div style="margin-left: 5px;">
  <table id="mytable">
   <thead><tr>
   		<th>登录名</th><th>姓名</th><th>性别</th>
   		<th>入职日期</th><th>手机</th><th>公司邮箱</th>
   		<th>部门</th><th>职位</th>
   		<th>操作</th>
   </tr></thead>
   <tbody>
   <c:forEach items="${employeeList}" var="employee">
   	<tr>
   		<td>${employee.loginName}</td>
   		<td>${employee.name}</td>
   		<td>
   			<c:choose>
   				<c:when test="${employee.gender=='M'}">男</c:when>
   				<c:when test="${employee.gender=='F'}">女</c:when>
   				<c:otherwise>&nbsp;</c:otherwise>
   			</c:choose>
   		</td>
   		
   		<td><fmt:formatDate value="${employee.employmentDate}" pattern="yyyy-MM-dd"/></td>
   		<td>${employee.mobilePhone}</td>
   		<td>${employee.officeEmail}</td>
   		<td>${employee.dept.name}</td>
   		<td>${employee.title.name}</td>
	   	<td>
	   	<a href="<%=request.getContextPath()%>/employee/update/${employee.id}">更新</a>
	   	<a href="<%=request.getContextPath()%>/employee/delete/${employee.id}">删除</a>
	   	</td>
   	</tr>
   </c:forEach>
   </tbody>
   </table>
   <br/><br/><div align="center">${message}</div>
  </body>
  </div>
</html>
