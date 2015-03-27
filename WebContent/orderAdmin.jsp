<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Order Admin</title>
	</head>
	<body>
	
		<f:view>
		<div>
		<h:form>
			<h:commandButton action="#{adminController.logOut}" value="LogOut"/>
		</h:form>
	</div>
		<h1>Order</h1>
			<h:form>
				<h:commandButton value="Return To Order List" action="#{orderController.getOrderForEvasion(customerController.id)}"/>
				<div>
					dateOfCreation: <fmt:formatDate value="${orderController.order.dateOfCreation}" type="date" pattern="dd/MM/yyyy"/>
					 - dateOfValidation: <fmt:formatDate value="${orderController.order.dateOfValidation}" type="date" pattern="dd/MM/yyyy"/>
				</div>
				<div>
					List:
				</div>
				<table>
					<tr>
						<th>Name</th> <th>Price</th> <th>Quantity</th>
					</tr>
						<c:forEach var="ol" items="#{orderController.orderLines}">
					<tr>
						<td>${ol.name}</td>
						<td>${ol.price}</td>
						<td>${ol.quantity}</td>
					</tr>
						</c:forEach>
				</table>
				<h:commandButton action="#{orderController.evasionOrder(adminController.id)}" value="Evasion">
								<f:param name="id" value="#{orderController.id}" />
				</h:commandButton>
			</h:form>
		</f:view>
	</body>
</html>