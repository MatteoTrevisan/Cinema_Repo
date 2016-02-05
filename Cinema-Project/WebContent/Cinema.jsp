<%@page import="com.matteo.cinema.model.Film"%>
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
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="<c:url value="/js/Cinema.js" />">
</script>
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/css/Cinema.css">
<title>Cinema Jsp</title>
</head>
<body>
	<div id="menu">
		<img
			src="https://s-media-cache-ak0.pinimg.com/originals/a1/5b/e2/a15be2026584b4f16a63737fd4d4e18f.jpg"
			title="logo_cinema" width="100 px">

		<h2 class="trigger">
			<a href="#"> Film</a>
		</h2>

		<div class="container">
			<h3>Title</h3>
			<table>
				<% 
    	ArrayList<Film> cinema = (ArrayList<Film>)request.getAttribute("filmList") ;
    	Iterator<Film> it = cinema.iterator();
    %>


			</table>
		</div>
	</div>

</body>
</html>