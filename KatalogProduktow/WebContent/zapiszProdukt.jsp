<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Produkt" %>
<%@ page import="kontroler.ProduktKontroler"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="Stylesheet" type="text/css" href="CSS/katalogProduktow.css" />


<title>Katalog produktów</title>
 
</head>
<body>
	
	<jsp:useBean id="produkt" class="model.Produkt" scope="session"></jsp:useBean>
	<jsp:setProperty property="*" name="produkt" />
	<jsp:useBean id="produktKontroler" class="kontroler.ProduktKontroler" scope="application" /> 

<%
 
	Produkt pr = produktKontroler.getProduktById(Integer.parseInt(request.getParameter("id")));
	if(pr==null) {
		produktKontroler.dodajNowy(produkt.getNazwa(), produkt.getOpis(), produkt.getKategoria());		
	} else {
		pr.setNazwa(produkt.getNazwa());
		pr.setKategoria(produkt.getKategoria());
		pr.setOpis(produkt.getOpis());
	}
	response.sendRedirect("produktLista.jsp");

%>

</body>
</html>