<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Cart</title>
	</head>
	<body>
	
		<f:view>
		<div>
		<h:form>
			<h:commandButton action="#{customerController.logOut}" value="LogOut"/>
		</h:form>
	</div>
		<h1>Order</h1>
			<h:form>
				<h:commandButton value="Home" action="#{customerController.goToHome}"/>
				<h:commandButton action="#{productController.listProducts}" value="List all Products" />
				<div>
					dateOfCreation: <fmt:formatDate value="${orderController.order.dateOfCreation}" type="date" pattern="dd/MM/yyyy"/>
				</div>
				<table>
					<tr>
						<th>Name</th><th>Price</th><th>Quantity</th>
					</tr>
						<c:forEach var="orderLine" items="#{orderController.order.orderLines}">
					<tr>
						<td>${orderLine.name}</td>
						<td>${orderLine.price}</td>
						<td>${orderLine.quantity}</td>
					</tr>
						</c:forEach>
				</table>
				<h:commandButton value="Confirmation" action="#{orderController.orderConfirmation(customerControlle.id)}">
					<f:param name="id" value="#{orderController.order.id}" />
				</h:commandButton>
			</h:form>
		</f:view>
	</body>
</html>