<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Modify Customer</title>
</head>
<body>
<f:view>
<div>
		<h:form>
			<h:commandButton action="#{customerController.logOut}" value="LogOut"/>
		</h:form>
	</div>
<h:form>
    <div>Name: <h:inputText value="#{customerController.firstName}" 
               				 required="false"
               				 id="firstName"/> <h:message for="firstName" />
	</div>
	<div>Name: <h:inputText value="#{customerController.lastName}" 
              					required="false"
              					id="lastName"/> <h:message for="lastName" />
	</div>
    <div>Email: <h:inputText value="#{customerController.email}" 
                				  required="false"
                			     id="email"/> <h:message for="email" />
	</div>
	<div>Phone Number: <h:inputText value="#{customerController.phoneNumber}" 
                      				  required="false"
                      				  id="phoneNumber"/> <h:message for="phoneNumber" />
	</div>
	<div>Date of Birth (GG-MM-AAAA) <h:inputText value="#{customerController.dateOfBirth}"
											  					required="false"
							              					id="dateOfBirth"/> <h:message for="dateOfBirth" />	
	</div>
	<div>
		<p>Address Info</p>
	
	   <div>Street: <h:inputText value="#{customerController.street}" 
 	                				  required="false" 
 	               				  id="street"/> <h:message for="street" /> 
		</div>
		<div>City: <h:inputText value="#{customerController.city}" 
	              					required="false" 
	              					id="city"/> <h:message for="city" />
		</div>
		<div>State: <h:inputText value="#{customerController.state}" 
                  				 required="false" 
                  				 id="state"/> <h:message for="state" /> 
		</div>
		<div>Zip Code: <h:inputText value="#{customerController.zipcode}" 
 	                  				 required="false" 
 	                  				 id="zipcode"/> <h:message for="zipcode" /> 
		</div>
		<div>Country: <h:inputText value="#{customerController.country}" 
                    					required="false" 
	                 					id="country"/> <h:message for="country" /> 
		</div>	
	</div>
	<div>
		<h:commandButton value="Confim Update"  action="#{customerController.updateCustomer}"/>
		<h:commandButton value="Cancel Update"  action="#{customerController.cancelUpdate}"/>
	</div>
</h:form>
</f:view>
</body>
</html>