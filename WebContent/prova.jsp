<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Products</title>
</head>
<body>
<f:view>
<h1>Products</h1>
<h:form>
<h:commandButton action="#{orderController.currentOrder(customerController.id)}" value="Cart" />
<h:commandButton value="Home" action="#{customerController.goToHome}"/>
<table>
	<tr>
		<th>Name</th><th>Price</th>
	</tr>
		<c:forEach var="product" items="#{productController.products}">
	<tr>
		<td>${product.name}</td>
		<td>${product.price}</td>
		<td>
			<h:commandButton action="#{productController.findProduct}" value="Details">
				<f:param name="id" value="#{product.id}" />
			</h:commandButton>
		</td>
<!-- 		<td> -->
<%-- 			<h:commandButton action="#{productController.deleteProduct}" value="Delete"> --%>
<%-- 				<f:param name="id" value="#{product.id}" /> --%>
<%-- 			</h:commandButton> --%>
<!-- 		</td> -->
<!-- 		<td> -->
<%-- 			<h:commandButton action="#{productController.goToUpdateProduct}" value="Update"> --%>
<%-- 				<f:param name="id" value="#{product.id}" /> --%>
<%-- 			</h:commandButton> --%>
<!-- 		</td> -->
		<td>
<%-- 				Quantity: <h:inputText value="#{productController.quantity}"  --%>
<%--  	                     required="true"  --%>
<%-- 	                     requiredMessage="Quantity is mandatory" --%>
<%-- 	                     id="quantity"/> <h:message for="quantity" /> --%>
				<h:commandButton action="#{productController.goToPurchase}" 
									  value="Purchase">
					<f:param name="id" value="#{product.id}" />
				</h:commandButton>
						
		</td>
	</tr>
	</c:forEach>
</table>
</h:form>

</f:view>
</body>
</html>