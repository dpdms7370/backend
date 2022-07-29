<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%-- <c:set var="path_hd" value="{pageContext.request.contextPath }" /> --%>
<%
	String path_hd = request.getContextPath();
%>
<header id="header" class="header">
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	    <div class="container px-4 px-lg-5">
	        <a class="navbar-brand" href="<%=path_hd %>/">Hang on own taste<i class="xi-emoticon-cool"></i></a>
	        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
	        <div class="collapse navbar-collapse" id="navbarSupportedContent">
	            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
	                <!-- <li class="nav-item"><a class="nav-link active" aria-current="page" href="#!">Home</a></li> -->
	                <li class="nav-item dropdown">
	                    <a class="nav-link dropdown-toggle" id="navbarDropdown1" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">About</a>
	                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown1">
	                        <li><a class="dropdown-item" href="<%=path_hd %>/">Yen Shop</a></li>
	                        <li><hr class="dropdown-divider"></li>
	                        <li><a class="dropdown-item" href="<%=path_hd %>/cart/cartList.do">Get your Cart<i class="xi-basket"></i></a></li>
	                        <li><a class="dropdown-item" href="<%=path_hd %>/board/list.do">Board</a></li> 
	                        <li><a class="dropdown-item" href="<%=path_hd %>/board/pageList.do?curPage=1">Notice2</a></li>
	                    </ul>
	                </li>
	                <li class="nav-item dropdown">
	                    <a class="nav-link dropdown-toggle" id="navbarDropdown2" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Shop</a>
	                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown2">
	                         <li><a class="dropdown-item" href="<%=path_hd %>/product/productList.do">All Products</a></li>
	                        <li><hr class="dropdown-divider"></li>
	                        <li><a class="dropdown-item" href="<%=path_hd %>/product/productList.do">Popular Items</a></li>
	                        <li><a class="dropdown-item" href="#!">New Arrivals</a></li>
	                    </ul>
	                </li>
	            </ul>
	            <ul class="navbar-nav me-auto mb-2 mb-lg-0 ms-lg-4">
	            	<c:if test="${member == null }">
	                <li class="nav-item"><a class="nav-link" href="<%=path_hd %>/member/loginForm.do"><strong>Login</strong></a></li>
	                <li class="nav-item"><a class="nav-link" href="<%=path_hd %>/member/joinForm.do"><strong>join</strong></a></li>
	                </c:if>
	               	<c:if test="${member != null }">
					<li class="nav-item"><a class="nav-link" href="<%=path_hd %>/member/logout.do"><strong>Logout</strong></a></li>
	                <li class="nav-item"><a class="nav-link" href="<%=path_hd %>/member/mypage.do"><strong>mypage</strong></a></li>
	                <li class="nav-item"><a class="nav-link" href="<%=path_hd %>/service/sendEmail.do"><strong>Contact</strong></a></li>
	                </c:if>
	               	<c:if test="${member.cid == 'admin' }">
					<li class="nav-item"><a class="nav-link" href="<%=path_hd %>/admin/admin.do"><strong>관리자 페이지로<i class="xi-piggy-bank"></i></strong></a></li>
	                </c:if>
	            </ul>
	            <form class="d-flex">
	                <button class="btn btn-outline-dark" type="submit">
	                    <i class="bi-cart-fill me-1"></i>
	                    <a id="need"  href="<%=path_hd %>/cart/cartList.do">Cart</a>
	                    <span class="badge bg-dark text-white ms-1 rounded-pill">0</span>
	                </button>
	            </form>
	        </div>
	    </div>
	</nav>
</header>