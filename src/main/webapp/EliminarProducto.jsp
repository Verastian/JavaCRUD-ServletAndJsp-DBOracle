<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="utf-8">
			<meta http-equiv="X-UA-Compatible" content="IE=edge">
			<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
			<!-- Bootstrap CSS -->
			<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"
				integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l"
				crossorigin="anonymous">
			<!-- icons Solid de Fontawesome-->
			<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">
			<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
				integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
				crossorigin="anonymous" />
			<!-- My Style -->
			<link href="assets/css/styles.css" rel="stylesheet">
			<title>Eliminar Producto</title>
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
			<!-- Navbar ---------------------------------------------------------------------------------->

			<div class="container">
				<div class="card text-center mt-4 border-danger">
					<div class="card-header border-danger">
					<h1 class="text_color">Eliminar Producto</h1>
					</div>
					<div class="card-body text-danger">
						<h3 class="card-title">¿Seguro que desea eliminar El Producto?</h3>	
						<form action="eliminar-producto" method="POST">
							<input value="${id}" type="hidden" name="id" />
							<!-- <button type="submit">Eliminar</button> -->
							<button type="submit" class="btn btn-danger">Eliminar</button>
							<a href="listar-producto" class="btn btn-warning">Cancelar</a>
						</form>
					</div>
					<div class="card-footer text-muted border-danger " style="height: 5em;">
					
					</div>
				</div>
			</div>

<!-- Footer -->
			<footer class="text-center text-lg-start bg-color-foot text-muted mt-5">
				<!-- Section: Social media -->
				<section class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
					<!-- Left -->
					<div class=" d-none d-lg-block">
						<span>Contactate con nosotros en las redes sociales.</span>
					</div>
					<!-- Left -->

					<!-- Right -->
					<div>
						<a href="" class="m-4 text-reset">
							<i class="fab fa-facebook-f"></i>
						</a>
						<a href="" class="m-4 text-reset">
							<i class="fab fa-twitter"></i>
						</a>
						<a href="" class="m-4 text-reset">
							<i class="fab fa-google"></i>
						</a>
						<a href="" class="m-4 text-reset">
							<i class="fab fa-instagram"></i>
						</a>
						<a href="" class="m-4 text-reset">
							<i class="fab fa-linkedin"></i>
						</a>
						<a href="" class="m-4 text-reset">
							<i class="fab fa-github"></i>
						</a>
					</div>
					<!-- Right -->
				</section>
				<!-- Section: Social media -->

				<!-- Section: Links  -->
				<section class="">
					<div class="container text-center text-md-start mt-5">
						<!-- Grid row -->
						<div class="row mt-3">
							<!-- Grid column -->
							<div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
								<!-- Content -->
								<div class="mb-4">
									<a class="navbar-brand mt-2 mt-lg-0" href="#">
										<img src="https://fontmeme.com/permalink/211010/bfbd26817f2f7c9a46ec6f50ce635fd5.png"
											height="30" alt="" loading="lazy" alt="air-albania-font" border="0">
									</a>
									<i class="fas fa-leaf "></i>
								</div>
								<p>
									Here you can use rows and columns to organize your footer content. Lorem ipsum
									dolor sit amet, consectetur adipisicing elit.
								</p>
							</div>
							<!-- Grid column -->

							<!-- Grid column -->
							<div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
								<!-- Links -->
								<h6 class="text-uppercase fw-bold mb-4">
									Productos
								</h6>
								<p>
									<a href="#!" class="text-reset">Detergentes</a>
								</p>
								<p>
									<a href="#!" class="text-reset">Desinfectantes</a>
								</p>
								<p>
									<a href="#!" class="text-reset">Aromatizantes</a>
								</p>
								<p>
									<a href="#!" class="text-reset">Desengrasantes</a>
								</p>
							</div>
							<!-- Grid column -->

							<!-- Grid column -->
							<div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
								<!-- Links -->
								<h6 class="text-uppercase fw-bold mb-4">
									Enlaces Utiles
								</h6>
								<p>
									<a href="listar-producto" class="text-reset">Lista de Productos</a>
								</p>
								<p>
									<a href="#!" class="text-reset">Precios</a>
								</p>
								<p>
									<a href="#!" class="text-reset">Ofertas</a>
								</p>
								<p>
									<a href="#!" class="text-reset">Ayuda</a>
								</p>
							</div>
							<!-- Grid column -->

							<!-- Grid column -->
							<div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
								<!-- Links -->
								<h6 class="text-uppercase fw-bold mb-4">
									Contact
								</h6>
								<p><i class="fas fa-home me-3"></i> Santiago, calleUno 100, Chile</p>
								<p>
									<i class="fas fa-envelope me-3"></i>
									limpia@correo.cl
								</p>
								<p><i class="fas fa-phone me-3"></i> + 01 234 567 88</p>
								<p><i class="fas fa-print me-3"></i> + 01 234 567 89</p>
							</div>
							<!-- Grid column -->
						</div>
						<!-- Grid row -->
					</div>
				</section>
				<!-- Section: Links  -->

				<!-- Copyright -->
				<div class="text-center p-4" style="background-color: rgba(0, 0, 0, 0.05);">
					&#169; 2021 Copyright:
					<a class="text-reset fw-bold" href="inicio">Limpia.cl</a>
				</div>
				<!-- Copyright -->
			</footer>
			<!-- End Footer -->

			<!-- Optional JavaScript; choose one of the two! -->

			<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
			<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
				integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
				crossorigin="anonymous"></script>
			<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
				integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
				crossorigin="anonymous"></script>
		</body>

		</html>