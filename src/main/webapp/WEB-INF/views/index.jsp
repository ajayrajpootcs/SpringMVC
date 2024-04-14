<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CRUD-Spring</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" />
<!-- <script src="https://cdn.tailwindcss.com"></script> -->
<style type="text/css">
	:root, [data-bs-theme="light"] {
    --bd-purple: #4c0bce;
    --bd-violet: #712cf9;
    --bd-accent: #ffe484;
    --bd-violet-rgb: 112.520718, 44.062154, 249.437846;
    --bd-accent-rgb: 255, 228, 132;
    --bd-pink-rgb: 214, 51, 132;
    --bd-teal-rgb: 32, 201, 151;
    --bd-violet-bg: var(--bd-violet);
    --bd-toc-color: var(--bd-violet);
    --bd-sidebar-link-bg: rgba(var(--bd-violet-rgb), .1);
    --bd-callout-link: 10, 88, 202;
    --bd-callout-code-color: #ab296a;
    --bd-pre-bg: var(--bs-tertiary-bg);
	}
	nav{
		background-color:var(--bd-violet);
	}
</style>
</head>
<body class="bg-dark">
	
	<nav class="navbar navbar-expand-lg  border-bottom border-body" data-bs-theme="dark" style="background-color:#712cf9">
  		<div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
        </li>
      </ul>
    </div>
  </div>
	</nav>
	<div class="container-fluid mt-4" >
	<!--  d-flex flex-column justify-content-center align-items-center flex-wrap" style="height:100vh-->
		<div class="container d-flex flex-column justify-content-center align-items-center flex-wrap " >
			<h1 class="text" style="color:#712cf9" > CRUD USING SPRING WITH JSP </h1>
			<div class="d-flex justify-content-center align-items-center flex-wrap mt-1">
				<button class="btn btn-outline-primary ms-1 me-1" type="button"><a href="./registration-form" class="text-decoration-none text-light fw-bold">Register YourSelf</a></button>
				<button class="btn btn-outline-primary ms-1 me-1" type="button"><a href="./find" class="text-decoration-none text-light fw-bold">Search</a></button>
				<button  class="btn btn-outline-primary ms-1 me-1" type="button"><a href="./list" class="text-decoration-none text-light fw-bold">List Of Employee</a></button>
			</div>
		</div>
		
	
	</div>

	
	<script type="text/javascript" src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>