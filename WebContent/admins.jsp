<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Address</title>
</head>
<body>
<f:view>
<h1>Admin List</h1>
<h:form>
<table>
	<tr>
		<th>UserName</th>
	</tr>
	<c:forEach var="admin" items="#{adminController.admins}">
		<tr>
		<td>${admin.username}</td>
		<td>
			<h:commandButton action="#{adminController.deleteAdmin}" value="Delete">
				<f:param name="id" value="#{admin.id}" />
			</h:commandButton>
		</td>
		</tr>
	</c:forEach>
</table>
</h:form>
<h:commandButton value="Home" action="#{adminController.goToHome}"/>
</f:view>
</body>
</html>