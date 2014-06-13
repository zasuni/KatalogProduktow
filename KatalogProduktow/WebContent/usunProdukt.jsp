<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Produkt" %>

 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="Stylesheet" type="text/css" href="CSS/katalogProduktow.css" />


<title>Katalog produktów</title>
 
</head>
<body>
	
<jsp:useBean id="produktKontroler" class="kontroler.ProduktKontroler" scope="application" /> 

<%
 
    if ( request.getParameter("id") == null) {
       response.sendRedirect("produktLista.jsp");
    }else{
    	int id = Integer.parseInt(request.getParameter("id"));    	
    	Produkt pr = produktKontroler.getProduktById(id);    
    	produktKontroler.usunProdukt(pr);
    	response.sendRedirect("produktLista.jsp");
    }

%>

</body>
</html>