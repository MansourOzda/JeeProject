<!DOCTYPE html>

<html>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@ include file="header.jsp"%>
<style><%@include file="/WEB-INF/CSS/Accueil.css"%></style>
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
	<div id="ancre-v1" class="container">
		<div class="row">
			<div class="col">
				<h1 style="margin-top: 180px;">iKoniK V7</h1>
			</div>
			<div class="col">
				<br>
				<h3>Batterie</h3>
				<p>Grande autonomie</p>
				<br>
				<h3>Accélération</h3>
				<p>0 à 100 km/h en 1,7 secondes</p>
				<br>
				<h3>Autonomie</h3>
				<p>728 km (WLTP)</p>
				<br>
				<h3>Transmission</h3>
				<p>Transmission Intégrale</p>
				<br>
				<h3>Places</h3>
				<p>2 adultes</p>
				<br>
			</div>
			<div class="col">
				<br>
				<h3>Jantes</h3>
				<p>19" ou 21"</p>
				<br>
				<h3>Poids</h3>
				<p>2 316 kg</p>
				<br>
				<h3>Capacité de chargement</h3>
				<p>804 litres</p>
				<br>
				<h3>Affichage</h3>
				<p>Écran tactile de 17 pouces</p>
				<br>
				<h3>Le réseau superchargeur</h3>
				<p>Paiement à l'utilisation</p>
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
				<a href="#carouselExampleIndicators">Retour à la liste des voitures</a>
				<button style="text-align: center; margin-top: 10px;">Acheter</button>
			</div>
		</div>
	</div>
	<HR size=2 align=center width="100%">
	<div id="ancre-v2" class="container">
		<div class="row">
			<div class="col">
				<h1 style="margin-top: 180px;">iKoniK P2</h1>
			</div>
			<div class="col">
				<br>
				<h3>Batterie</h3>
				<p>Grande autonomie</p>
				<br>
				<h3>Accélération</h3>
				<p>0 à 100 km/h en 2,8 secondes</p>
				<br>
				<h3>Autonomie</h3>
				<p>698 km (WLTP)</p>
				<br>
				<h3>Transmission</h3>
				<p>Transmission Intégrale, Double Moteur</p>
				<br>
				<h3>Places</h3>
				<p>5 adultes</p>
				<br>
			</div>
			<div class="col">
				<br>
				<h3>Jantes</h3>
				<p>20"</p>
				<br>
				<h3>Poids</h3>
				<p>1 847 kg</p>
				<br>
				<h3>Capacité de chargement</h3>
				<p>812 litres</p>
				<br>
				<h3>Affichage</h3>
				<p>Écran tactile de 15 pouces</p>
				<br>
				<h3>Le réseau superchargeur</h3>
				<p>Paiement à l'utilisation</p>
				<br>
			</div>
		</div>
		<div class="row" style="text-align: center;">
			<div class="col">
				<h2 style="text-align: center;">2,8 s</h2>
				<p style="text-align: center;">De 0 à 100 km/h</p>
			</div>
			<div class="col">
				<h2 style="text-align: center;">812 litres</h2>
				<p style="text-align: center;">Capacité de chargement</p>
			</div>
			<div class="col">
				<h2 style="text-align: center;">698 km</h2>
				<p style="text-align: center;">Autonomie (WLTP)</p>
			</div>
			<div class="col">
				<a href="#carouselExampleIndicators">Retour à la liste des voitures</a>
				<button style="text-align: center; margin-top: 10px;">Acheter</button>
			</div>
		</div>
	</div>
	<HR size=2 align=center width="100%">
	<div id="ancre-v3" class="container">
		<div class="row">
			<div class="col">
				<h1 style="margin-top: 180px;">iKoniK L3</h1>
			</div>
			<div class="col">
				<br>
				<h3>Batterie</h3>
				<p>Moyenne autonomie</p>
				<br>
				<h3>Accélération</h3>
				<p>0 à 100 km/h en 4,5 secondes</p>
				<br>
				<h3>Autonomie</h3>
				<p>539 km (WLTP)</p>
				<br>
				<h3>Transmission</h3>
				<p>Transmission Intégrale, Double Moteur</p>
				<br>
				<h3>Places</h3>
				<p>jusqu'à 7 adultes</p>
				<br>
			</div>
			<div class="col">
				<br>
				<h3>Jantes</h3>
				<p>21"</p>
				<br>
				<h3>Poids</h3>
				<p>2003 kg</p>
				<br>
				<h3>Capacité de chargement</h3>
				<p>653 litres</p>
				<br>
				<h3>Affichage</h3>
				<p>Écran tactile de 15 pouces</p>
				<br>
				<h3>Le réseau superchargeur</h3>
				<p>Paiement à l'utilisation</p>
				<br>
			</div>
		</div>
		<div class="row" style="text-align: center;">
			<div class="col">
				<h2 style="text-align: center;">4,5 s</h2>
				<p style="text-align: center;">De 0 à 100 km/h</p>
			</div>
			<div class="col">
				<h2 style="text-align: center;">653 litres</h2>
				<p style="text-align: center;">Capacité de chargement</p>
			</div>
			<div class="col">
				<h2 style="text-align: center;">539 km</h2>
				<p style="text-align: center;">Autonomie (WLTP)</p>
			</div>
			<div class="col">
				<a href="#carouselExampleIndicators">Retour à la liste des voitures</a>
				<button style="text-align: center; margin-top: 10px;">Acheter</button>
			</div>
		</div>
	</div>

</body>

</html>
