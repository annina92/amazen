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
<h1>Customers</h1>
<h:form>
<table>
	<tr>
		<th>Name</th><th>Surname</th><th>Email</th>
	</tr>
	<c:forEach var="customer" items="#{customerController.customers}">
		<tr>
		<td>${customer.firstName}</td>
		<td>${customer.lastName}</td>
		<td>${customer.email}</td>
		<td>
			<h:commandButton action="#{customerController.findCustomer}" value="Details">
				<f:param name="id" value="#{customer.id}" />
			</h:commandButton>
		</td>
		<td>
			<h:commandButton action="#{customerController.deleteCustomer}" value="Delete">
				<f:param name="id" value="#{customer.id}" />
			</h:commandButton>
		</td>
		<td>
			<h:commandButton action="#{customerController.goToUpdateCustomer}" value="Update">
				<f:param name="id" value="#{customer.id}" />
			</h:commandButton>
		</td>
		</tr>
	</c:forEach>
</table>
</h:form>
<h:commandButton value="Home" action="#{adminController.goToHome}"/>
</f:view>
</body>
</html>