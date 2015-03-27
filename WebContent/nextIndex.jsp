<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Log In
<br>


	<f:view>
		<ul>
			<li><h:form>
					<h:commandButton action="#{adminController.formLogIn}"
						value="Admin" />
				</h:form></li>
				
			<li><h:form>
					<h:commandButton action="#{customerController.formForLogIn}"
						value="User" />
				</h:form></li>



		</ul>
		Register
				<ul>
			<li><a href='<c:url value="/faces/newCustomer.jsp" />'>Insert
					a new customer</a></li>
				
			<li><a href='<c:url value="/faces/newAdmin.jsp" />'>Insert
					a new customer</a></li>


		</ul>
		
		
	</f:view>
</body>
</html>