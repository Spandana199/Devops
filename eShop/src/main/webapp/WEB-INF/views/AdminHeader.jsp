<!DOCTYPE html>

<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
        <ul class="nav navbar-nav">
      <li class="active"><a href="#">Product</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="product">PRODUCT <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="adminhome">addproduct</a></li>
          <li><a href="adminproducts">showproduct</a></li>
          
          
        </ul>
      </li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="category">CATEGORY <span class="caret"></span></a>
      <ul class="dropdown-menu">
      <li><a href="Category">addcategory</a></li>
       <li><a href="#">showcategory</a></li>
             
    </ul>
    <li><a href="#">Supliers</a></li>
  </div>
  <li class="nav-item">
     <a class="nav-link" href="perform_logout">Logout</a>
   </li>
</nav>
  
<div class="container">
  
</div>

</body>
</html>
