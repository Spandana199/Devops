<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sf:form action="adduser" method="post" modelAttribute="user"  >
email<sf:input path="email" />
UserName<sf:input path="UserName"/>
password<sf:input path="password" />
mobile<sf:input path="mobile" />
role<sf:input path="role"     />
enabled<sf:input path="enabled" />
<input type="submit"  value="AddUserData" />
</sf:form>

</body>
</html>