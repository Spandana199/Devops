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
   <th class="th-sm">cartId

     </th>
     <th class="th-sm">ProductName

     </th>
     <th class="th-sm">ProductPrice

     
     </th>
     <th class="th-sm">Quantity

     </th>


   </tr>
 </thead>
 <tbody>
 <js:forEach items="${pro}"  var="c">

   <tr>
   <td>${c.cartId}</td>
     <td>${c.productName}</td>
      <td>${c.productPrice}</td>
     
     <td>${c.quantity}</td>

   </tr>

</js:forEach>

 </tbody>
 <tfoot>
   <tr>
   <th class="th-sm">cartId

     </th>
     <th>ProductName
     </th>
     <th>ProductPrice
     </th>
     
     <th>Quantity
     </th>

   </tr>
 </tfoot>
</table>

</body>
</html>