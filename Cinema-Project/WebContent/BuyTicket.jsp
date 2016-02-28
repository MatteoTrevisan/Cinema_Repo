<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/Cinema-Project/js/jquery.validate.js"></script>
<script type="text/javascript" src="/Cinema-Project/js/inputControl.js"></script>
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>Welcome to purchase Ticket page</h2>
		<h3>choose the available dates for this film:</h3>
		
			<%String name = (String) request.getAttribute("name"); %>
	
				<center>Title <input type="text" readonly value="<%=name%>"></center><br>
				<center>Avaible Dates <select name="filmDates">
						<%
					String[] dates = (String[]) request.getAttribute("dates");
					
					for (int i = 0; i < dates.length; i++) {
				%>
						<option value=""><%=dates[i]%></option>
						<%
					}
				%>
				</select>
		</center>
		<h3>Please enter your data</h3>
		<form name = "buyTicketForm" id="buyTicketForm">
		Name: <input type="text" name="inputName"><br><br>
		Surname: <input type="text" name="inputSurName"><br><br>
		Email: <input type="text" name="inputEmail"><br><br>
		<select name="methodOfPayment">
		<option selected="selected">Paypal</option>
		<option>CreditCard</option>
		</select>
		</form>
		<br><input type="button" value="Buy Ticket" onclick="buyTicket()">
	</center>
	
</body>
</html>