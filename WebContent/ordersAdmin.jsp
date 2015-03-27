<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Products</title>
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
			<h:commandButton value="Home" action="#{adminController.goToHome}"/>
			<table>
				<tr>
					<th>Date Of Creation</th><th>Date Of Validation</th><th>Date Of Evasion</th>
				</tr>
				<c:forEach var="order" items="#{orderController.orders}">
					<tr>
						<td>		
							<fmt:formatDate value="${order.dateOfCreation}" type="date" pattern="dd/MM/yyyy"/>
						</td>
						<td>					
							<fmt:formatDate value="${order.dateOfValidation}" type="date" pattern="dd/MM/yyyy"/>
						</td>
						<td>					
							<fmt:formatDate value="${order.dateOfEvasion}" type="date" pattern="dd/MM/yyyy"/>
						</td>
						<td>
							<h:commandButton action="#{orderController.findOrderAdmin(adminController.id)}" value="Details">
								<f:param name="id" value="#{order.id}" />
							</h:commandButton>
						</td>
					</tr>
				</c:forEach>
			</table>
		</h:form>
	</f:view>
</body>
</html>