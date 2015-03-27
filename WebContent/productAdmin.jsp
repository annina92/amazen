<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
<head>
<title>Product</title>
</head>
<body>
<f:view>
<h1>${productController.product.name}</h1>
<h2>Details</h2>
<div>Code: ${productController.product.code}</div>
<div>Price: ${productController.product.price}</div>
<div>Description: ${productController.product.description}</div>

		
		<li><h:form>
			<h:commandButton action="#{adminController.adminIndex}"
				value="Index" />
			</h:form></li>
		<li>
				<h:form>
			<h:commandButton action="#{adminController.newProduct}"
				value="Instert other products" />
			</h:form></li>
		<li>
	</f:view>
</body>
</html>