<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자료 목록</title>
</head>
<body>
	<div>
		<h2>자료 목록</h2>
		<ul class="lst">
			<c:forEach items="${databankList }" var="databank" varStatus="status">
			<li>
				<a href="">
					<h5>${status.count }</h5>
					<h3>${databank.title }</h3>
					<div><img src="./upload/${databank.fileurl }" alt="${databank.title }"/></div>
					<!-- /WEB-INF/views/upload/ -->
					<p>${databank.author }</p>
				</a>
			</li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>