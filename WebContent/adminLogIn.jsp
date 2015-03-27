<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>LogIn Admin</title>
</head>
<body>
<f:view>
	<h:form>
		<div>UserName: <h:inputText value="#{adminController.username}" 
	               				 required="true"
	               				 requiredMessage="Email is mandatory"
	               				 id="email"/> <h:message for="email" />
		</div>
		<div>Password: <h:inputText value="#{adminController.password}" 
	              					required="true"
	              					requiredMessage="Password is mandatory"
	              					id="pwd"/> <h:message for="pwd" />
		</div>
		<h:commandButton action="#{adminController.logIn}" value="LogIn"/>
	</h:form>
	<h:form>
		<h:commandButton action="/faces/newAdmin.jsp" value="Registration"/>
	</h:form>
</f:view>
</body>
</html>