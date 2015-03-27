<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Index Customer</title>
</head>
<body>
<f:view>
	${customerController.customer.firstName}
	<h:form>
		<h:commandButton action="#{productController.listProducts}" value="View Catalog"/>
		<h:commandButton action="#{customerController.goToProfile}" value="My Profile"/>
		${customerController.id }
		<div>
			<h:commandButton action="#{orderController.currentOrder(customerController.id)}" value="Cart" />
		</div>
	</h:form>
</f:view>
</body>
</html>