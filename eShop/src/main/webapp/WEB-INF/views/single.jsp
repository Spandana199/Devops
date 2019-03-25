<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 

<tr>
<td>${pro.productId}</td>
<td>${pro.productName}</td>
<td>${pro.productPrice}</td>

<td><a href="Cart?proid= ${pro.productId}">addToCart</a></td>
</tr>

</body>
</html>