<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE>
<html>
	<head>
		<base href="<%=path%>/">
		<title>用户列表</title>
	</head>
  
	<body>
	<div align="center">
		<a href="user/userAdd.jsp">新增</a>
		<table border="1" style="width:300px">
			<tr>
				<td>编号</td><td>姓名</td><td>操作</td>
			</tr>
			<s:iterator value="userList" var="user">
			<tr>
				<td>${user.id }</td><td>${user.name }</td>
				<td><a href="user_toEdit?user.id=${user.id }">修改</a>|
					<a href="user_delete?user.id=${user.id }">删除</a></td>
			</tr>
			</s:iterator>
		</table>
		总记录数:${page.countData }总页数:${page.countPage }当前页:${page.currentPage }<br />
		<a href="user_list?page.currentPage=1">首页</a>
		<a href="user_list?page.currentPage=${page.currentPage - 1}">上一页</a>
		<a href="user_list?page.currentPage=${page.currentPage + 1}">下一页</a>
		<a href="user_list?page.currentPage=${page.countPage }">尾页</a>
	</div>
	</body>
</html>
