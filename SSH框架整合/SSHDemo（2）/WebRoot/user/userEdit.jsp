<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE>
<html>
	<head>
		<base href="<%=path%>/">
		<title>用户修改</title>
	</head>
  
	<body>
		<form action="user_update" method="post">
			<input type="hidden" name="user.id" value="${user.id }" />
			姓名：<input type="text" name="user.name" value="${user.name }" /><br />
			<input type="submit" value="保存" />
		</form>
	</body>
</html>
