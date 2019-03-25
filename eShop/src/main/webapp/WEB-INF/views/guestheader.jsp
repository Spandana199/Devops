<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
 <script type="text/javascript" src="https://cdn.datatables.net/v/bs3/dt-1.10.18/datatables.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
 <div class="container-fluid">
 
 <div class="navbar-header">
     <a class="navbar-brand" href="#">Eshop</a>
   </div>
   <ul class="nav navbar-nav">
   <li class="active"><a href="cartlist">Cart</a></li>
     <li class="active"><a href="v">Products</a></li>
     <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="signup">SignUp <span class="caret"></span></a>
     
       <ul class="dropdown-menu">
         <li><a href="register">Register</a></li>
         <li><a href="Login">Login</a></li>
         <li><a href="perform_logout">Logout</a></li>

       </ul>

   </ul>
 </div>
</nav>
</body>
</html>