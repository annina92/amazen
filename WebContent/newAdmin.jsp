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

    <div>Username: <h:inputText value="#{adminController.username}" 
                     required="true"
                     requiredMessage="Name is mandatory"
                     id="email"/> <h:message for="email" />
	</div>
    <div>Password: <h:inputText value="#{adminController.password}" 
                     required="true"
                     requiredMessage="Name is mandatory"
                     id="password"/> <h:message for="password" />
	</div>
	
	<div>
		<h:commandButton value="Submit"  action="#{adminController.createAdmin}"/>
	</div>
	<h:commandLink action="#{adminController.listAdmins}"
						value="List all Customers" />
</h:form>
</f:view>
</body>
</html>
