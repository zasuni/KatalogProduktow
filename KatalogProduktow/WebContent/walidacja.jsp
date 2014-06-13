<%@ page import="kontroler.UserKontroler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Katalog produktów</title>
</head>
<body>
<body>
 
	<jsp:useBean id="user" class="model.User" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="user" />
	<jsp:useBean id="userDataSource" class="kontroler.UserKontroler" scope="session"></jsp:useBean>

	<%

		if (userDataSource.checkExist(user.getUsername())) {
			response.sendRedirect("produktLista.jsp");
		}else {
			response.sendRedirect("logowanie.jsp");
		} 
			
	%>

</body>


</body>
</html>