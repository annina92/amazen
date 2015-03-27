<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Address</title>
</head>
<body>
<f:view>
<h1>Products</h1>
<h:form>
<table>
	<tr>
		<th>Street</th><th>City</th><th>ZipCode</th>
	</tr>
	<c:forEach var="address" items="#{addressController.addresses}">
		<tr><td>
		<h:commandLink action="#{addressController.findAddress}" value="#{address.street}">
			<f:param name="id" value="#{address.id}" />
		</h:commandLink>
		</td>
			<td>${address.city}</td>
			<td>${address.zipcode}</td>
		</tr>
	</c:forEach>
</table>
</h:form>

</f:view>
</body>
</html>