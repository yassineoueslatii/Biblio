<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>livres</title>
</head>
<body>
<h1>Liste des livres</h1>
<c:forEach items="${livres}" var="blabla" > 
<h3> ${blabla.titre}</h3>
<h3> ${blabla.isbn}</h3>
<h3> ${blabla.categorie}</h3>

</c:forEach>

</body>
</html>