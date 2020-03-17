<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">


<title>Insert title here</title>
</head>
<body>
<form action="Startseite,java" method="get" accept-charset="utf-8">
		<label>Gastname: <input type="text" name="gast"></label><br>
	</form>
	<form action="Startseite,java" method="get" accept-charset="utf-8">
		<input type ="submit" name="submit" value="senden"> 
	</form>
<div class="container">
	<div class ="row">
		<div class ="col-sm">
		<h1><%=session.getAttribute("benutzer")%></h1>
	</div>

	</div>
		</div>
</body>
</html>