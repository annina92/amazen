<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Index</title>
</head>
<body>
<f:view>
<div>

		<h:form>
			<h:commandButton action="#{customerController.logOut}" value="LogOut"/>
		</h:form>
	</div>
Prodotto aggiunto all'ordine
	
	<h:form>
	<div>
			<h:commandButton action="#{productController.listProducts}" value="List all Products" />
		</div>
	</h:form>
	</f:view>
</body>
</html>

