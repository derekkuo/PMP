<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>增加员工</title>
	<%@include file="/common.jsp"%>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/My97DatePicker/WdatePicker.js"></script>
  </head>
  
  <body>
   <div style="margin-left:5px;">
   <form action="<%=request.getContextPath()%>/employee/update/${employee.id}" method="post">
   <input type="hidden" name="id" value="${employee.id}">
   <table>
	   <tr>
	   		<td>登录名：</td>
	   		<td><input name="loginName" value="${employee.loginName}"><br/></td>
	   </tr>
   	<tr>
	   		<td>姓名：</td>
	   		<td><input name="name" value="${employee.name}"><br/></td>
   	</tr>
   	<tr>
	   		<td>密码：</td>
	   		<td><input type="password" name="password" value="${employee.password}"><br/></td>
   	</tr>
   	<tr>
	   		<td>性别：</td>
	   		<td><select name="gender">
	   			<c:if test="${employee.gender != 'F'}">
	   				<option value="M" selected="selected">男</option>
	   				<option value="F">女</option>
	   			</c:if>
	   			<c:if test="${employee.gender == 'F'}">
	   			<option value="M">男</option>
	   				<option value="F" selected="selected">女</option>
	   			</c:if>
	   		</select></td>
	</tr>
	<tr>
	   		<td>入职日期：</td>
	   		<td><input class="Wdate" name="employmentDate" value="<fmt:formatDate value="${employee.employmentDate}" pattern="yyyy-MM-dd"/>" onClick="WdatePicker()"><br/></td>
   	</tr>
   	
   	<tr>
	   		<td>手机：</td>
	   		<td><input name="mobilePhone" value="${employee.mobilePhone}"><br/></td>
   	
   	<tr>
	   		<td>公司邮箱：</td>
	   		<td><input name="officeEmail" value="${employee.officeEmail}"><br/></td>
   	</tr>
   	
   	<tr>
	   		<td>部门：</td>
	   		<td>
			   	<select name="dept.id" class="hasValueDeptSelect">
			   		<option value="${employee.dept.id}" selected="selected">${employee.dept.id}</option>
			   	</select>
			</td>
   	</tr>
   	
   	<tr>
   	<td>职位：</td>
   	<td>
   	<select name="title.id" class="hasValueTitleSelect">
   		<option value="${employee.title.id}" selected="selected">${employee.title.id}</option>   	
   	</select>
   	</td>
   	</tr>
   <tr><td colspan='2' align="center">
	<input type="submit" value="提交">
	<a href="javascript:history.back();">取消</a>
	</td>
	</tr>
	</table>
   </form>
  </div>
  </body>
</html>
