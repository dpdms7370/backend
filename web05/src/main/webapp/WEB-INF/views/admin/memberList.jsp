<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<c:set var="path1" value="{pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 목록</title>
<%@ include file="../inc/head.jsp" %>
<link rel="stylesheet" href="../inc/datatables.min.css" />
<script src="../inc/datatables.min.js"></script>
<style>
a {text-decoration:none}
a:hover{text-decoration: line; color: hotpink;}
</style>

</head>
<body>
<%@ include file="../inc/header.jsp" %>
<div id="contents" class="contents">
	<div class="container px-4 px-lg-5 mt-5">
		<div class="row">
			<br><br>		
			<h2 class="tit">공지사항 목록</h2>
			<c:if test="${member.cid == 'admin' }">
			<div class="row">
				<a href="addBoardForm.do" class="btn btn-primary" style="display:inline-block;">글쓰기</a>
			</div>
			</c:if>
			<br><br>
			<div class="panel-body">
				<table class="table" id="myTable">
					<thead>
						<tr>
							<th>번호</th>
							<th>아이디</th>
							<th>이름</th>
							<th>생일</th>
							<th>전화번호</th>
							<th>이메일</th>
							<th>주소1</th>
							<th>주소2</th>
							<th>등급</th>
							<th>가입일</th>>
						</tr>
					</thead>
					<tbody>						
							<c:forEach items="${memberList}" var="member" varStatus="status">
							<tr>
								<td>${status.count}</td>
								<td><a href="memberRead.do?cid=${member.cid}">${member.cid }</a></td>
								<td>${member.cname}</td>
								<td>${member.cbirth}</td>
								<td>${member.ctel}</td>
								<td>${member.cmail}</td>
								<td>${member.cadd1}</td>
								<td>${member.cadd2}</td>
								<td>${member.grade}</td>
								<td>${member.regdate}</td>
							</tr>
							</c:forEach>
					
					</tbody>
				</table>
			</div>
			<script>
			$(function(){
				$("#myTable").DataTable();
			});
			</script>
		</div>
	</div>
	<div class="blank" style="min-height:350px"></div>		
</div>
<%@ include file="../inc/footer.jsp" %>
</body>
</html>