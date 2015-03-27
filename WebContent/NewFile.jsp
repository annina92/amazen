<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%-- <fmt:formatDate value="${exchange.rateDate.time}" type="date" dateStyle="SHORT"/> --%>
<%-- <fmt:formatDate value="${exchange.rateDate.time}" type="date" pattern="dd/MM/yyyy"/> --%>
<!DOCTYPE html>
<html>
<head>
<title>Customer</title>
</head>
<body>
	<f:view>
	<h:form>
			<h:commandButton value="My Order List" action="#{orderController.getAllOrderCustomer(customerController.id)}"/>
		</h:form>
	<h1>Customer Details</h1>
		<div>Name: ${customerController.customer.firstName}</div>
		<div>Surname: ${customerController.customer.lastName}</div>
		<div>Email: ${customerController.customer.email}</div>
		<div>Phone Number: ${customerController.customer.phoneNumber}</div>
		<div>	Date Of Birth:
		<fmt:formatDate value="${customerController.customer.dateOfBirth}" type="date" pattern="dd/MM/yyyy"/>
	</div>
	<div>Registration Date: 
		<fmt:formatDate value="${customerController.customer.registrationDate}" type="date" pattern="dd/MM/yyyy"/>
	</div>
		<div>Street: ${customerController.customer.address.street}</div>
		<div>City: ${customerController.customer.address.city}</div>
		<div>State: ${customerController.customer.address.state}</div>
		<div>Zip Code: ${customerController.customer.address.zipcode}</div>
		<div>Country: ${customerController.customer.address.country}</div>
		<div>
		<h:form>
			<h:commandButton value="Home" action="#{customerController.goToHome}"/>
		</h:form>
	</div>
	<div>
		<h:form>
			<h:commandButton value="Edit" action="#{customerController.goToUpdateCustomer}"/>
		</h:form>
	</div>	
	</f:view>
</body>
</html>
