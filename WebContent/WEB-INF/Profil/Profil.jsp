<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="../headerBlanc.jsp"%>
<%@ page import="com.project.beans.*" %>
<%@ page import="com.project.Repository.*" %>
<style><%@include file="/WEB-INF/CSS/Profil.css"%></style>

</head>


<body >
  <%
try{
	
	Client ObjetClient = new Client();
	ObjetClient = (Client) request.getAttribute( "ObjetClient");
	
	%>

	<br />
	<br />
	<br />
	<br />
	<br />
	<div class="row align-middle">
		<div class="col-sm-8 m-4 align-middle">
			<div class="card">
				<div class="card-body">
					<div>
						<h3 class="card-title text-dark text-center">INFORMATIONS BANCAIRES</h3>
						<p class="card-text text-dark">Information Paiement:<b> <%= ObjetClient.getInformationBancaire() %></b> </p>
						<p class="card-text text-dark">Capital: <b><%= ObjetClient.getCapital() %></b> </p>
						<button type="button" class="btn btn-primary">Modifier mes informations bancaires</button>
						
					</div>
					<div>
					<h3 class="card-title text-dark text-center">COORDONNEES</h3>
					<p class="card-text text-dark">Adresse:<b><%= ObjetClient.getAdresse() %></b></p>
					<p class="card-text text-dark">Code postal:<b><%= ObjetClient.getCodePostal() %></b></p>
					<p class="card-text text-dark">E-Tephone:<b><%= ObjetClient.getTelephone() %></b></p>
					<button type="button" class="btn btn-primary">Modifier mes coordonnï¿½es</button>
					</div>
				</div>
			</div>

		</div>
		<div class="col-sm-3  align-middle">
			<img
				src="https://www.aovc.org/wp-content/uploads/2015/10/photo-%C3%A0-venir-400x369.jpg"
				class="card-img-top" alt="...">

			<div class="card m-2 align-middle">
				<div class="card-body">
					<p class="card-text text-dark">Nom:<b><%= ObjetClient.getNom() %></b></p>
					<p class="card-text text-dark">Prénom:<b><%= ObjetClient.getPrenom() %></b></p>
					<p class="card-text text-dark">E-mail:<b><%= ObjetClient.getEmail() %></b></p>
					<p class="card-text text-dark">Mot de passe:<b><%= ObjetClient.getTelephone() %></b></p>
					<button type="button" class="btn btn-primary">Modifier mes
						informations d'identifications</button>
				</div>
			</div>
		</div>
	</div>
<%
}
catch(Exception e)
{
	System.out.println("erreur:"+e);
}
%>
</body>
</html>
