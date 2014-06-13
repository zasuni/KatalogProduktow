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
 
<div class="box">
	Katalog produktów
</div>

<div class="panelPrzyciskow">
	<a href='edycjaProduktu.jsp?id=-1' class='buttonZmien'>Nowy produkt</a>	
	<a href='logowanie.jsp' class='buttonZmien'>Wyloguj</a>	
</div>

<div class="tabelka" >	
	<table>
		<tr>
			<td>Nazwa</td>
			<td>Opis</td>
			<td>Kategoria</td>
			<td>Opcje</td>
		</tr>
		
		<%
		
		for(Produkt p : produktKontroler.getProdukty()){
			out.print("<tr>");
			out.print("<td>"); out.print(p.getNazwa()); out.print("</td>");
			out.print("<td>"); out.print(p.getOpis()); out.print("</td>");
			out.print("<td>"); out.print(p.getKategoria()); out.print("</td>");
			out.print("<td width='200'>"); out.print(" <a href='edycjaProduktu.jsp?id="); out.print(p.getId()); out.print("' class='buttonZmien'>Edycja</a>"); out.print(" <a href='usunProdukt.jsp?id="); out.print(p.getId()); out.print("' class='buttonUsun'>Usuń</a>"); out.print("</td>");
			out.print("</tr>");
		}
		
		%>
			
	</table>
</div>

</body>
</html>