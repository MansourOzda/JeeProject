<!DOCTYPE html>

<html>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="header.jsp"%>
<link rel="stylesheet" href="CSS/Accueil.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>

<body>
	<div id="carouselExampleIndicators"
		class="carousel-style carousel slide" data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner">
			<div class="carousel-item active slides">
				<img class="d-block w-100" src="Images/tesla_V7.jpg" width="1920"
					height="754" alt="First slide">
				<div class="carousel-caption d-none d-md-block">
					<h1>iKoniK V7</h1>
					<a href="#ancre-v1">Voir les caractéristiques</a>
				</div>
			</div>
			<div class="carousel-item slides">
				<img class="d-block w-100" src="Images/tesla_P2.jpg" width="1920"
					height="754" alt="Second slide">
				<div class="carousel-caption d-none d-md-block">
					<h1>iKoniK P2</h1>
					<a href="#ancre-v2">Voir les caractéristiques</a>
				</div>
			</div>
			<div class="carousel-item slides">
				<img class="d-block w-100" src="Images/tesla_L3.jpg" width="1920"
					height="754" alt="Third slide">
				<div class="carousel-caption d-none d-md-block">
					<h1>iKoniK L3</h1>
					<a href="#ancre-v3">Voir les caractéristiques</a>
				</div>
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>
	<div class="container">
		<div class="row">
			<div class="col">
				<h1 style="margin-top: 180px;">iKoniK V7</h1>
			</div>
			<div class="col">
				<br>
				<h3>Batterie</h3>
				<br>
				<h3>Accélération</h3>
				<br>
				<h3>Autonomie</h3>
				<br>
				<h3>Transmission</h3>
				<br>
				<h3>Places</h3>
				<br>
			</div>
			<div class="col">
				<br>
				<h3>Jantes</h3>
				<br>
				<h3>Poids</h3>
				<br>
				<h3>Capacité de chargement</h3>
				<br>
				<h3>Affichage</h3>
				<br>
				<h3>Le réseau superchargeur</h3>
				<br>
				<h3>Garantie</h3>
				<br>
			</div>
		</div>
		<div class="row" style="text-align: center;">
			<div class="col">
				<h2 style="text-align: center;">1,7 s</h2>
				<p style="text-align: center;">De 0 à 100 km/h</p>
			</div>
			<div class="col">
				<h2 style="text-align: center;">907 litres</h2>
				<p style="text-align: center;">Capacité de chargement</p>
			</div>
			<div class="col">
				<h2 style="text-align: center;">728 km</h2>
				<p style="text-align: center;">Autonomie (WLTP)</p>
			</div>
			<div class="col">
				<button style="text-align: center; margin-top: 20px;">Acheter</button>
			</div>
		</div>
	</div>

</body>

</html>
