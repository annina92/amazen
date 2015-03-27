<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Product</title>
</head>
<body>
<f:view>
<h1>Address</h1>
<div>Street: ${addressController.address.street}</div>
<div>City: ${addressController.address.city}</div>
<div>State: ${addressController.address.state}</div>
<div>Zip Code: ${addressController.address.zipcode}</div>
<div>Country: ${addressController.address.country}</div>
</f:view>
</body>
</html>