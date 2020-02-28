<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style> <%@ include file="bootstrap.min.css" %> </style>
</head>

<body>
<%@ include file="menu.jsp" %>

	<form action="/Bibliotheque/ajout" method="post">
		<h3> Le livre : </h3>
		<input type="text" name="titre" placeholder="Saisir le titre"><br>
		
		<select name="categorie">
			<option value="bande dessinee"> bande desinnee </option>
			<option value="roman"> Roman </option>
			<option value="mangas"> mangas </option>
			<option value="sciences fictions"> sciences fictions </option>
		</select> <br>
		
		<input type="number" name="isbn">		
		<h3> L'auteur : </h3>
		<input type="text" name="nomAuteur" placeholder="saisir le nom de l'auteur"> <br>
		
		<input type="text" name="prenomAuteur" placeholder="saisir le prenom de l'auteur"> <br>
		
		<input type="submit" value="Valider">
		
	</form>
</body>
</html>