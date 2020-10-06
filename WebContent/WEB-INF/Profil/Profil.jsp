<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="../header.jsp"%>

</head>


<body class="bg-info text-white">
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
						<p class="card-text text-dark">Numéro de la carte:</p>
						<p class="card-text text-dark">Capital:</p>
						<button type="button" class="btn btn-primary">Modifier mes informations bancaires</button>
						
					</div>
					<div>
					<h3 class="card-title text-dark text-center">COORDONNEES</h3>
					<p class="card-text text-dark">Adresse:</p>
					<p class="card-text text-dark">Code postal:</p>
					<p class="card-text text-dark">E-Téléphone:</p>
					<button type="button" class="btn btn-primary">Modifier mes coordonnées</button>
					</div>
				</div>
			</div>

		</div>
		<div class="col-sm-3  align-middle">
			<img
				src="https://www.domolandes.fr/wp-content/uploads/2016/10/cesi-567x420.jpg"
				class="card-img-top" alt="...">

			<div class="card m-2 align-middle">
				<div class="card-body">
					<p class="card-text text-dark">Nom:</p>
					<p class="card-text text-dark">Prénom:</p>
					<p class="card-text text-dark">E-mail:</p>
					<p class="card-text text-dark">Mot de passe:</p>
					<button type="button" class="btn btn-primary">Modifier mes
						informations d'identifications</button>
				</div>
			</div>
		</div>
	</div>

</body>
</html>