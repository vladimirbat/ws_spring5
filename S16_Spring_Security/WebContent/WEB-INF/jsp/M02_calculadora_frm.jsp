<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora</title>
</head>
<body>
<sec:authentication property="principal.username" var="yo" /> 
<h2>Calculadora para ${yo}</h2>

<form  action="calcular.spr" method="post">
	<p>
		a: <input type="text" name="txta" /><br />
		b: <input type="text" name="txtb" />
		<select name="operacion">
			<option value="+">Sumar</option>
			<option value="-">Restar</option>
			<option value="x">Multiplicar</option>
			<option value="/">Dividir</option>
			<option value="r">Raiz</option>
		</select>
		<button type="submit">Calcular</button>
		<!-- El botón factorizar solamente se muestra al administrador -->
	<sec:authorize access="hasRole('administrador')">
		<button type="submit">Factorizar (Solo administradores)</button>
	</sec:authorize>
	<!-- El botón factorizar solamente se muestra al administrador -->
	<sec:authorize access="principal.username=='rafa'">
		<button type="submit">Estadistica (Solo rafa)</button>
	</sec:authorize>
	<sec:authorize url="/buscar.spr">
		<button type="submit">Buscar</button>
	</sec:authorize>
	</p>
</form>
<div><a href="logout">Cerrar session</a></div>
<c:if test="${!empty(ERR)}">
	<div style="border: 1px solid red; padding: 20px;">
		${ERR}
	</div>
</c:if>
<sec:authentication property="principal.authorities" var="misRoles" />
<h3>Mis perfiles</h3>
<ul>
<c:forEach items="${misRoles}" var="x" >
	<li>${x}</li>
</c:forEach>
</ul>
</body>
</html>