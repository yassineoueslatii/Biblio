<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1> ${message}</h1>
	<h3>Titre:  ${livre.titre}</h3>
	<h3>Cat�gorie : ${livre.categorie }</h3>
	<h3>ISBN : ${livre.isbn}</h3>
	
	<h3>Nom auteur : ${auteur.nom}</h3>
	<h3>Prenom auteur : ${auteur.prenom}</h3>
	
</body>
</html>