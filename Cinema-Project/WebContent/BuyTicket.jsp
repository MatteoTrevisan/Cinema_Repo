<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="/Cinema-Project/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="/Cinema-Project/js/jquery.validate.js"></script>
<script type="text/javascript" src="/Cinema-Project/js/inputControl.js"></script>
<script type="text/javascript" src="/Cinema-Project/js/cinema.js"></script>
<!-- <script type="text/javascript" src="/Cinema-Project/js/controlliEs2.js"></script> -->

<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>Welcome to purchase Ticket page</h2>
		<h3>choose the available dates for this film:</h3>

		<%
			String name = (String) request.getAttribute("name");
			String price = (String) request.getAttribute("price");
			/* request.setAttribute("name", name); */
		%>

		<center>
			Title <input type="text" readonly value="<%=name%>">
				<input type="hidden" value="<%=price%>">
		</center>
		<br>
		<center>
			Avaible Dates <select name="filmDates">
				<%
					String[] dates = (String[]) request.getAttribute("dates");

					for (int i = 0; i < dates.length; i++) {
				%>
				<option class="date" value=""><%=dates[i]%></option>
				<%
					}
				%>
			</select>
		</center>
		<h3>Please enter your data</h3>
		<form id="modulo" method="post"
			action="/Cinema-Project/SummaryPurchasePage.jsp">
			<div>
				<span>Name</span><br> <input type="text" id="nome" name="nome">
			</div>
			<div>
				<span>Surname</span><br> <input type="text" id="cognome"
					name="cognome">
			</div>
			<div>
				<span>Email</span><br> <input type="text" id="email"
					name="email">
			</div>
			<div>
				Payment method: <select name="methodOfPayment">
					<option selected="selected">Paypal</option>
					<option>CreditCard</option>
				</select>name
			</div>
			<input id="filmNameInfo" name="filmName" type="hidden" value="<%=name%>" >	
			<input id="userName" name="userName" type="hidden" value="" >
			<input id="userSurname" name="userSurname" type="hidden" value="" >
			<input id="filmPrice" name="filmPrice" type="hidden" value="<%=price%>" >
			<input type="submit" value="Invia i dati" onclick="summaryData()">
			</form>
</center>
</body>
</html>