<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>page</title>
</head>

 <meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body style="background color:lightblue;">

<sf:form action="addCategory" method="post" modelAttribute="cg">
      
   <nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">CategoryPage</a>
    </div>
    <ul class="nav navbar-nav">
  <li class="active"><a href="#">CategoryId<input type="text" class="form-control" name="search"></a></li>
  <li class="active"><a href="#">CategoryName<input type="text" class="form-control" name="search"></a></li>
  <li class="active"><a href="#">CategoryDescription<input type="text" class="form-control" name="search"></a></li>
  <input type="submit"value="SaveProduct"/>
          </ul>
  </div>
</nav>
  </sf:form>
</body>
</html>