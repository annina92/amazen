<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE html>
<html>
<head>
<title>Product</title>
</head>
<body>
<f:view>
<h:form>
	<h1>${productController.product.name}</h1>
	<h2>Details</h2>
	<div>Code: ${productController.product.code}</div>
	<div>Price: ${productController.product.price}</div>
	<div>Description: ${productController.product.description}</div>
				Quantity: <h:inputText value="#{productController.quantity}" 
	                     required="true"
 	                     requiredMessage="Quantity is mandatory"
 	                     id="quantity"/> <h:message for="quantity" /> 
				<h:commandButton action="#{productController.buyProduct(customerController.id)}" 
									  value="Confirmation Purchase">
					<f:param name="id" value="#{productController.product.id}" />
				</h:commandButton>
	<h:commandButton value="Go Back" action="#{customerController.goToProducts}"/>
	<h:commandButton value="Home" action="#{customerController.goToHome}"/>
	</h:form>
</f:view>
</body>
</html>