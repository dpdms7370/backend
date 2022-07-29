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
<title>질문 및 답변 관리 목록</title>
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
			<h2 class="tit">질문 및 답변 관리 목록</h2>
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
							<th>제목</th>
							<th>내용</th>
							<th>작성자</th>
							<th>작성일</th>
							<th>cnt</th>
							<th>root</th>
							<th>조회수</th>
							<th>indent</th>
						</tr>
					</thead>
					<tbody>
					<c:choose>
						<c:when test="${cnt gt 0 }">	
							<c:forEach items="${qnaList}" var="qna" varStatus="status">
							<tr>
								<td>${status.count }</td>
								<td><a href="read.do?qno=${qna.qno}">${qna.qtitle }</a></td>
								<td>${qna.qcontent }</td>
								<td>${qna.qwriter }</td>
								<td>${qna.qwritedate }</td>
								<td>${qna.qreadcnt }</td>
								<td>${qna.qroot }</td>
								<td>${qna.qstep }</td>
								<td>${qna.qindent }</td>
							</tr>
							</c:forEach>
						</c:when>
						<c:otherwise>
							<tr>
								<td colspan="9">등록된 질문이 없습니다.</td>
							</tr>
						</c:otherwise>
					</c:choose>
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