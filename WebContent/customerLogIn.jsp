<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>LogIn Customer</title>
</head>
<body>
<f:view>
	<h:form>
		<div>Email: <h:inputText value="#{customerController.email}" 
	               				 required="true"
	               				 requiredMessage="Email is mandatory"
	               				 id="email"/> <h:message for="email" />
		</div>
		<div>Password: <h:inputText value="#{customerController.pwd}" 
	              					required="true"
	              					requiredMessage="Password is mandatory"
	              					id="pwd"/> <h:message for="pwd" />
		</div>
		<h:commandButton action="#{customerController.logIn}" value="LogIn"/>
	</h:form>
	<h:form>
		<h:commandButton action="/faces/newCustomer.jsp" value="Registration"/>
	</h:form>
</f:view>
</body>
</html>