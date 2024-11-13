<%@page import="com.dao.Dao"%>
<%@page import="com.model.ProductModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        .product-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(200px, 1fr));
            grid-gap: 20px;
            padding: 20px;
        }
        .product {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: center;
        }
        .product img {
            max-width: 100px;
            max-height: 100px;
        }
        .swd-button 
			{
				background: #f2db18;
				border: 1px solid white;
				border-radius: 5px;
				color: white;
				display: inline-block;
				font: bold 12px Arial, Helvetica, sans-serif;
				padding: 10px 15px;
				text-decoration: none;
				text-transform: uppercase;
				margin-top: 15px;
			}
        
    </style>
    
     <script type="text/javascript">

    function decreaseQuantity(element) {
        var input = element.nextElementSibling;
        var value = parseInt(input.value, 10);
        if (value > 0) {
            input.value = value - 1;
        }
    }

    // Function to increase quantity
    function increaseQuantity(element) {
        var input = element.previousElementSibling;
        var value = parseInt(input.value, 10);
        input.value = value + 1;
    }

    // Function to get final quantity
    function getFinalQuantity() {
        var products = document.getElementsByClassName('product');
        var totalQuantity = 0;
        
        for (var i = 0; i < products.length; i++) {
            var quantityInput = products[i].querySelector('.quantity-input');
            var quantity = parseInt(quantityInput.value, 10);
            totalQuantity += quantity;
        }
        
        console.log('Final Quantity:', totalQuantity);
        // You can use `totalQuantity` variable for further processing
    }
    </script>
    
</head>
<body>

<jsp:include page="header.jsp"/>


	<%
    
	    response.setHeader("cache-control", "no-cache");
	    response.setHeader("cache-control", "no-store");
	    response.setHeader("pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
    
    %>
    
    <%
    	if(session.getAttribute("project")!=null)
    	{
   	%>
   	
   	
   		
 <div class="product-grid">
        <% 
        // Your Java code to retrieve product data from the database goes here
        // For demonstration purposes, let's assume you have a list of Product objects
        
        List<ProductModel> list = Dao.viewproducts();// Method to retrieve product data from the database
        
        // Iterate over the product list and generate HTML for each product
         for (ProductModel m : list) 
        {
        %>
        <div class="product">
           <img src="data:image/jpeg;base64,<%=m.getP_image()%>" width="150px" height="200px" />
            <h3><%= m.getP_name() %></h3>
            <p>Price: <%= m.getP_price() %></p>
            
            
            	<form action="addtowishlist.jsp">
            		<input type="hidden" name="id" value="<%=m.getId()%>">
            		<input type="submit" class="swd-button" value="Wishlist">
            	</form>
            	
           <form action="addtocart.jsp">
	          <div class="quantity">
	            <div onclick="decreaseQuantity(this)">-</div>
	            <input type="text" name ="number" value="1" width="50px;" readonly="readonly"/>
	            <div onclick="increaseQuantity(this)">+</div>
        	</div>
      		
            	<input type="hidden" name="id" value="<%=m.getId()%>">
            	<input type="submit" class="swd-button" value="Cart">
          </form>
            
            	
            
            
          </div>
        <% } %>
    </div>
   	
   	<% 		
    	}
    	else
    	{
    		
    	
    %>

	 		<br>
						<center>
								
								<b><p style="color:red;font-family: sans-serif; font-size: 25px;">Please Login First!!</p></b>
							</center>

						<br>
						<br> 
						
						<%-- <%@ include file="signin.jsp"%> --%>
	<%
    	}
	%>


<jsp:include page="footer.jsp"/>


</body>
</html>