<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="Stylesheet" type="text/css" href="CSS/katalogProduktow.css" />

<title>Katalog Produktów</title>
</head>
<body>
 
<div class="box">
	Katalog produktów

</div>     

<div class="box2">
	<form  class="form-container" method="post" action="walidacja.jsp">
		<div class="form-title"><h2>Logowanie</h2></div>
	 	<div class="form-title">Użytkownik</div>
	 	<input class="form-field" type="text" name="username" /><br />
	 	<div class="form-title">Hasło</div>
	 	<input class="form-field" type="text" name="password" /><br />
		<div class="submit-container">
			<input class="submit-button" type="submit" value="Zaloguj" />
		</div>
	</form>
</div>

</body>
</html>