<doctype html>
<html>
<head>
	<title>List Products</title>
</head>

<body>
	${allProducts.name } ${allProducts.sku } ${allProducts.price }
	<table border="1">
	<thead>
		<tr>
			<th>Name</th>
			<th>SKU</th>
			<th>Price</th>
		</tr>
	</thead>
		<g:each in="${allProducts }" var="product">
			<tr>
				<td>${product.name }</td>
				<td>${product.sku }</td>
				<td>${product.price }</td>
			</tr>
		</g:each>
	</table>
</body>
</html>