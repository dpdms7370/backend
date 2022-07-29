<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path1" value="{page.Context.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품목록</title>
<%@include file="../inc/head.jsp" %>

<style type="text/css">
*{margin: 0; padding: 0;}
 body, html {font-family: 'Dongle', sans-serif; width: 100%;}  
 ul {list-style: none;}
 a{text-decoration: none; }

.product {margin-left: 30px}
.product ul{float: left}

</style>
<link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
<div>
<%@include file="../inc/header.jsp" %>
<%@include file="../inc/visual.jsp" %>
	<h2 class="tit">공지사항 목록</h2>
			<%-- <c:if test="${member.cid == 'admin' }">
			<div class="row">
				<a href="addBoardForm.do" class="btn btn-primary" style="display:inline-block;">글쓰기</a>
			</div>
			</c:if> --%>
			<br><br>
			<div class="panel-body">
				<table class="table" id="myTable">
					<thead>
						<tr>
							<th>상품코드</th>
							<th>상품명</th>
							<th>상품가격</th>
							<th>상품설명</th>
							<th>상품수량</th>
							<th>상품이미지1</th>
							<th>상품이미지2</th>
						</tr>
					</thead>
				<tbody>
							
							<c:forEach var="product" items="${productList}" >
							<tr>
								<td>${product.pcode}</td>
								<td><a href="productDetail.do?pcode=${product.pcode}">${product.pname}</a></td>
								<td>${product.pcost}</td>
								<td>${product.pcok}</td>
								<td><img src="${path1 }/img/${product.pimg1}" alt="상품 이미지1" name="상품1"></td>
								<td><img src="${path1 }/img/${product.pimg2}" alt="상품 이미지2" name="상품2"></td>
							</tr>
							</c:forEach>
				
				</tbody>
			</table>
		</div>
	
	</div>	
<%@include file="../inc/footer.jsp" %>
</body>
</html>
 
