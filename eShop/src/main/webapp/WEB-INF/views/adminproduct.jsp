<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="js" %>
<%@ include  file="guestheader.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
$(document).ready(function () {
      $('#dt13table').DataTable();
      $('.dataTables_length').addClass('bs-select');
    });
</script>
</head>
<body>

<table id="dt13table" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
 <thead>
   <tr>
     <th class="th-sm">ProductId

     </th>
     <th class="th-sm">ProductName

     </th>
     <th class="th-sm">ProductPrice

     </th>
     <th class="th-sm">Image

     </th>
     <th class="th-sm">Delete

     </th>

 </tr>
 </thead>
 <tbody>
 <js:forEach items="${pro}"  var="p">

   <tr>
     <td>${p.productId}</td>
      <td>${p.productName}</td>
     <td>${p.productPrice}</td>
    
     <td><img src="resources/proimg/${p.productId}.png" width="50" height="50" /></td>
     <td><a href="#">Delete</a></td>

   </tr>


</js:forEach>

 </tbody>
 <tfoot>
   <tr>
     <th>ProductId
     </th>
     <th>ProductName
     </th>
     <th>ProductPrice
     </th>
     <th>Image
     </th>
     <th>Delete
     </th>

   </tr>
 </tfoot>
</table>

</body>
</html>