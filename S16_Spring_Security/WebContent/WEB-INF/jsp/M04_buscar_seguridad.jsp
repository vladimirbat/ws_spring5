<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buscar Clientes</title>
<style type="text/css">
	table{border-collapse: collapse;}
	td, th {border: 1px solid black;}
</style>
</head>
<body>
<h2>Buscar Clientes</h2>

<form  action="buscar_seguridad.spr" method="post">
	<p>
		apellidos: <input type="text" name="apellidos" />
		<button type="submit">Buscar</button>
	</p>
</form>
<c:if test="${!empty(ERR)}">
	<div style="border: 1px solid red; padding: 20px;">
		${ERR}
	</div>
</c:if>

<div><a href="logout">Cerrar session</a></div>

<c:if test="${!empty(CLIENTES)}">
	<table>
		<thead><tr><th>dni</th><th>nombre</th><th>apellidos</th><th>saldo</th></tr></thead>
		<tbody>
			<c:forEach items="${CLIENTES}" var="cli">
				<tr> <td>${cli.dni}</td><td>${cli.nombre}</td>
					<td>${cli.apellidos}</td><td>${cli.saldo}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</c:if>
</body>
</html>