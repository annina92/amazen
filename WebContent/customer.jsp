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
<div>Street: ${customerController.address.street}</div>
<div>City: ${customerController.address.city}</div>
<div>Zip Code: ${customerController.address.zipCode}</div>
<div>Country: ${customerController.address.country}</div>


			<li><h:form>
					<h:commandButton action="#{customerController.backToIndex}"
						value="Index" />
				</h:form></li>



</f:view>
</body>
</html>