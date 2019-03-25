<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form action="showproduct" method="post" modelAttribute="cg">
         <li><a href="#">Dell</a></li>
         <li><a href="#">HP</a></li>
         <li><a href="#">Lenovo</a></li>
  </sf:form>
</body>
</html>