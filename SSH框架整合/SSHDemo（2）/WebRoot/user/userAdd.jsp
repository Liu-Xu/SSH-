<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
%>

<!DOCTYPE>
<html>
	<head>
		<base href="<%=path%>/">
		<title>用户新增</title>
	</head>
  
	<body>
		<form action="user_insert" method="post">
			姓名：<input type="text" name="user.name" /><br />
			<input type="submit" value="保存" />
		</form>
	</body>
</html>
