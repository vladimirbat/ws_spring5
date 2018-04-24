<?xml version="1.0" encoding="ISO-8859-1" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Acceso a la aplicación</title>
</head>
<body>
	<h3>Acceso a la aplicación</h3>
	<form method="post" action="j_spring_security_check">
	<p>
		Usuario: <input type="text" name="j_username"/><br />
		Contraseña: 
			<input type="text" name="j_password"/><br />
		<input type="submit" value="entrar"/>
	</p>
	</form>
	<c:if test="${!empty(msg)}">
		<p style="border:1px solid red;padding:15px;">
			<c:out value="${msg}" />
		</p>
	</c:if>
</body>
</html>