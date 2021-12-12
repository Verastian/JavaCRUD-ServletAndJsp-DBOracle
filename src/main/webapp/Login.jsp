<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
	<!-- icons Solid de Fontawesome-->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.0.8/css/solid.css">

	<!-- My Style -->
	<link href="assets/css/login.css" rel="stylesheet">
<title>Login</title>
</head>

<body>
	
	
	<div class="modal fade" id="exampleModal" tabindex="-1"
		aria-labelledby="exampleModalLabel">
		<div class="modal-dialog modal-dialog-centered">
			<div class="modal-content ">
				<div class="user-img d-flex justify-content-center ">
					<img src="assets/img/user.png" class="rounded-circle shadow" />
				</div>
				<div class="modal-header d-flex justify-content-center">
					<h3 class="modal-title text-white" id="exampleModalLabel">Login User</h3>

				</div>
				<form action="login" method="GET">
					<div class="modal-body">
						<div class="form-group" id="user-group"> 

							<input value="${cookieName}" name="email" id="email" class="form-control pl-5" 
								placeholder="login">
						</div>

						<div class="form-group" id="contrasena-group">
							<input value="${cookiePass}" type="password" id="password" class="form-control my-4 pl-5"
								name="password" placeholder="Password">
						</div>
					</div>
					<div class="modal-footer">

						<!-- <button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button> -->
							
						<input type="submit" class="btn btn-danger btn-block text-uppercase mb-2 rounded-pill shadow-sm" value="Sign In" />
					</div>
				</form>

			</div>
		</div>
	</div>
	
	
	<!-- Optional JavaScript; choose one of the two! -->
<script src="https://use.fontawesome.com/releases/v5.0.7/js/all.js"></script>
	<!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns"
		crossorigin="anonymous"></script>
		
		<script>
		$(document).ready(function() {
			$('#exampleModal').modal('show')
		});

		$('#exampleModal').on('hide.bs.modal', function(e) {

			e.preventDefault();
			e.stopImmediatePropagation();
			return false;

		});
	</script>
</body>

</html>