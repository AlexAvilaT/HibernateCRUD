<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create product</title>
</head>
<body>
	<h2>Create product</h2>
	
	<form action = "CreateProductServlet" method = "post">
	
	<p>
		<label for = "txtIdProduct">Id Product</label>
		<input type = "text" id = "txtIdProduct" name = "txtIdProduct" disabled>
	</p>
	
	<p>
		<label for = "txtNameProduct">name Product</label>
		<input type = "text" id = "txtNameProduct" name = "txtNameProduct">
	</p>
	
	<p>
		<label for = "txtPriceProduct">price Product</label>
		<input type = "text" id = "txtPriceProduct" name = "txtPriceProduct">
	</p>
	
	<input type = "submit" value = "create product">
	
	</form>

</body>
</html>