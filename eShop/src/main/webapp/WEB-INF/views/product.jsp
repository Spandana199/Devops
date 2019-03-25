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
<sf:form action="addproduct" method="post" modelAttribute="pr" enctype="multipart/form-data">

ProductName<sf:input path="ProductName"/>
ProductPrice<sf:input path="ProductPrice"/>
ProductImage<sf:input path="image" type="file" />

<input type="submit"value="saveproduct"/>
</sf:form>
</body>
</html>