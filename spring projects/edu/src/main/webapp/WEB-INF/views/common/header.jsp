<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
	<!-- Brand -->
	<a class="navbar-brand" href="#">Logo</a>
	
	<!-- Links -->
	<ul class="navbar-nav">
		<li class="nav-item">
		  	<a class="nav-link" href="<c:url value='/member/signup'/>">회원가입</a>
		</li>
		<li class="nav-item">
		  	<a class="nav-link" href="#">Link 2</a>
		</li>
		
		<!-- Dropdown -->
		<li class="nav-item dropdown">
			<a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
			  Dropdown link
			</a>
			<div class="dropdown-menu">
				<a class="dropdown-item" href="#">Link 1</a>
				<a class="dropdown-item" href="#">Link 2</a>
				<a class="dropdown-item" href="#">Link 3</a>
			</div>
		</li>
	</ul>
</nav>