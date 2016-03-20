<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.matteo.cinema.model.Film"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="/Cinema-Project/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="/Cinema-Project/js/cinema.js">
</script>
<script type="text/javascript" src="/Cinema-Project/js/jquery-ui.js">
</script>
<link rel="stylesheet" href="/Cinema-Project/css/jquery-ui-1.9.2.custom.css">
<link rel="stylesheet" href="/Cinema-Project/css/Cinema.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">

<title>Cinema Jsp</title>
</head>

<c:set var="servletPath" value="${pageContext.request.contextPath}" />
<body>
	<div id="menu">
		<img
			src="https://s-media-cache-ak0.pinimg.com/originals/a1/5b/e2/a15be2026584b4f16a63737fd4d4e18f.jpg"
			title="logo_cinema" width="100 px">

		<h2 class="trigger">
			<a href="#">Show Available Film List</a>
		</h2>


		<div class="container">
			<h3>Title</h3>
			<table>
				<%
					ArrayList<Film> cinema = (ArrayList<Film>) request.getAttribute("filmList");
					Iterator<Film> it = cinema.iterator();
					for (int i = 0; i < cinema.size(); i++) {
				%>
				<tr>
					<td><%=cinema.get(i).getFilmId()%></td>
					<td><a target="_blank"  href="<%=cinema.get(i).getLink()%>"><%=cinema.get(i).getTitle()%></a></td>
					<td><a class ="buy" "><img onclick="javascript:sendData(event)" data-id=<%=cinema.get(i).getFilmId()%> data-price=<%=cinema.get(i).getPrice() %> src="http://uxrepo.com/static/icon-sets/typicons/svg/basket.svg" 
					width="20px" 
					title ="buy ticket">
					</a>
					</td>
				</tr>
				<%
					}
				%>


			</table>
		</div>

	</div>
	<!-- <div>
	
		
		<p>
			Date: <input type="text" id="datepicker">
		</p>


	</div> -->
	<form id="subId"
		action="${servletPath}"
		method="post">
		<input id="inputId" name="filmId" type="hidden" value="">
		<input id="filmPrice" name="filmPrice" type="hidden" value="">
	</form>
	
</body>
</html>