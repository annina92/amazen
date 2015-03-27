<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Update Product</title>
</head>
<body>

<f:view>
<div>
		<h:form>
			<h:commandButton action="#{adminController.logOut}" value="LogOut"/>
		</h:form>
	</div>
<h:form>
    <div>Name: <h:inputText value="#{productController.name}" 
    								 required="false"
    								 id="name"/>
			 		<h:message for="name" />
	</div>
    <div>Code: <h:inputText value="#{productController.code}" 
    								 required="false"
    								 id="code"/> 
    			   <h:message for="code" />
	</div>
    <div>Price: <h:inputText value="#{productController.price}" 
    								  required="false"
                             converterMessage="Price must be a number"
                             id="price"/> <h:message for="price" />
	</div>
    <div>Description: <h:inputTextarea value="#{productController.description}" 
    				                        required="false" 
    				                        cols="20" 
    				                        rows="5" />                      
	</div>
	<div>
		<h:commandButton value="Confim Update"  action="#{productController.updateProduct}">
			<f:param name="id" value="#{productController.id}"/>
		</h:commandButton>
	</div>
</h:form>
</f:view>
</body>
</html>