<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>New Product</title>
</head>
<body>
<f:view>
<h:form>


    <div>Email: <h:inputText value="#{customerController.email}" 
                     required="true"
                     requiredMessage="Name is mandatory"
                     id="email"/> <h:message for="email" />
	</div>
    <div>Password: <h:inputSecret value="#{customerController.password}" 
                     required="true"
                     requiredMessage="Name is mandatory"
                     id="password"/> <h:message for="password" />
	</div>
	
		<div>
		<h:commandButton value="Submit"  action="#{customerController.logIn}"/>
	</div>
	
</h:form>
</f:view>
</body>
</html>
