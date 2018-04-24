<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculadora</title>
</head>
<body>
<h2>Calculadora</h2>
<h3>
${CALC.txta} ${CALC.operacion} ${CALC.txtb} = ${CALC.resultado}
</h3>
<a href=".">volver al índice</a>
<div><a href="logout">Cerrar session</a></div>
</body>
</html>