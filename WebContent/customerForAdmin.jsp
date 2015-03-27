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
	<div>
		<h:form>
			<h:commandButton action="#{adminController.logOut}" value="LogOut"/>
		</h:form>
	</div>
	<h1>Customer Details</h1>
		<div>Name: ${orderController.customer.firstName}</div>
		<div>Surname: ${orderController.customer.lastName}</div>
		<div>Email: ${orderController.customer.email}</div>
		<div>Phone Number: ${orderController.customer.phoneNumber}</div>
		<div>	Date Of Birth:
		<fmt:formatDate value="${orderController.customer.dateOfBirth}" type="date" pattern="dd/MM/yyyy"/>
	</div>
	<div>Registration Date: 
		<fmt:formatDate value="${orderController.customer.registrationDate}" type="date" pattern="dd/MM/yyyy"/>
	</div>
		<div>Street: ${orderController.customer.address.street}</div>
		<div>City: ${orderController.customer.address.city}</div>
		<div>State: ${orderController.customer.address.state}</div>
		<div>Zip Code: ${orderController.customer.address.zipcode}</div>
		<div>Country: ${orderController.customer.address.country}</div>
		<div>
		<h:form>
			<h:commandButton value="Back" action="#{adminController.goToHome}"/>
		</h:form>
	</div>	
	</f:view>
</body>
</html>
