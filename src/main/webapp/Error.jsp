<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
	integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
	crossorigin="anonymous">
<title>Tienda MiBike</title>
</head>
<body>

<!-- Navbar -->
			<nav class="navbar navbar-expand-lg navbar-light " style="background-color: #bcc86a;">
				<!-- Container wrapper -->
				<div class="container-fluid">
					<!-- Toggle button -->
					<button class="navbar-toggler" type="button" data-toggle="collapse"
						data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false"
						aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
					</button>

					<a class="navbar-brand mt-2 mt-lg-0 " href="#">
						<img src="https://fontmeme.com/permalink/211010/bfbd26817f2f7c9a46ec6f50ce635fd5.png"
							height="30" alt="" loading="lazy" alt="air-albania-font" border="0">
							<i class="fas fa-leaf text_color"></i>
					</a>
					<!-- Collapsible wrapper -->
					<div class="collapse navbar-collapse d-lg-flex justify-content-lg-between ml-3" id="navbarTogglerDemo03">
						<!-- Navbar brand -->
						<!-- Left links -->
						<ul class="navbar-nav me-auto mb-2 mb-lg-0">
							<li class="nav-item">
								<a class="nav-link" href="inicio">Home</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="agregar-producto">Agregar Producto</a>
							</li>
							<li class="nav-item">
								<a class="nav-link" href="listar-producto">Listar Producto</a>
							</li>
						</ul>
						<!-- Left links -->

						<!-- Right elements -->
						<div class=" dropdown  d-flex align-items-center">
							<!-- Avatar -->
							<a class="dropdown-toggle d-flex align-items-center hidden-arrow" href="#"
								id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-expanded="false">
								<img src="assets/img/user.png" width="40" height="40" class="d-inline-block align-top"
									alt="">
							</a>
							<ul class="dropdown-menu dropdown-menu-left dropdown-menu-lg-right  "
								aria-labelledby="navbarDropdownMenuLink">
								<li>
									<h5 class="dropdown-header">${correo.toString()}</h5>
								</li>
								<li>
									<a class="dropdown-item" href="#">Settings</a>
								</li>
								<li>
									<a class="dropdown-item active" href="logout">Logout</a>
								</li>
							</ul>
						</div>
						<!-- Right elements -->
					</div>
					<!-- Collapsible wrapper -->
				</div>
				<!-- Container wrapper -->
			</nav>
			<!-- Navbar -->
	<h1>Error</h1>
	<p>Ha ocurrido un errror al procesar la solicitud</p>
	<a href="inicio">Volver a inicio</a>
	
	
	
	
	<!-- Optional JavaScript; choose one of the two! -->

	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
		crossorigin="anonymous"></script>
</body>
</html>