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
	${adminController.admin.username}
	<h:form>
		<h:commandButton action="#{productController.listProductsAdmin(adminController.id)}" value="List All Products"/>
	</h:form>

</f:view>
</body>
</html>