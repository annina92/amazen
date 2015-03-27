<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>New Product</title>
</head>
<body>
<f:view>
<h:form>
    <div>Name: <h:inputText value="#{customerController.firstName}" 
                     required="true"
                     requiredMessage="Name is mandatory"
                     id="firstName"/> <h:message for="firstName" />
	</div>
    <div>Surname: <h:inputText value="#{customerController.lastName}" 
                     required="true"
                     requiredMessage="Surname is mandatory"
                     id="lastName"/> <h:message for="lastName" />
	</div>
    <div>Email: <h:inputText value="#{customerController.email}" 
                     required="true"
                     requiredMessage="Email is mandatory"
                     id="email"/> <h:message for="email" />
	</div>
    <div>Password: <h:inputSecret value="#{customerController.password}" 
                     required="true"
                     requiredMessage="Password is mandatory"
                     id="password"/> <h:message for="password" />
	</div>
	
	<div>Phone Number: <h:inputText value="#{customerController.phoneNumber}" 
                     required="true"
                     requiredMessage="Phone number is mandatory"
                     id="phoneNumber"/> <h:message for="phoneNumber" />
	</div>
	
	<div>Date of Birth: <h:inputText value="#{customerController.dateOfBirth}" 
                     required="true"
                     requiredMessage="Date of birth is mandatory"
                     id="dateOfBirth"/> <h:message for="dateOfBirt" />
	</div>
	
	<h1>Address</h1>

	<div>Street: <h:inputText value="#{customerController.street}" 
                     required="true"
                     requiredMessage="street is mandatory"
                     id="street"/> <h:message for="street" />
	</div>
	
	<div>City: <h:inputText value="#{customerController.city}" 
                     required="true"
                     requiredMessage="city is mandatory"
                     id="city"/> <h:message for="city" />
	</div>
	
	<div>Zip Code: <h:inputText value="#{customerController.zipCode}" 
                     required="true"
                     requiredMessage="zip code is mandatory"
                     id="zipCode"/> <h:message for="zipCode" />
	</div>
	
	<div>Country: <h:inputText value="#{customerController.country}" 
                     required="true"
                     requiredMessage="country is mandatory"
                     id="country"/> <h:message for="country" />
	</div>


	
	<div>
		<h:commandButton value="Submit"  action="#{customerController.createCustomer}"/>
	</div>
	<h:commandLink action="#{customerController.listCustomers}"
						value="List all Customers" />
</h:form>
</f:view>
</body>
</html>
