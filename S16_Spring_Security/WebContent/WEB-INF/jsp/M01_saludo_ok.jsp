<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Saludo desde Spring</title>
</head>
<body>
<h2>Saludo</h2>
<p><%=request.getAttribute("mensaje")%></p>
<p><c:out value="${mensaje}" /></p>
<p>${mensaje}</p>
<p>La hora del servidor es ${hora}</p>
</body>
</html>