<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path1" value="{page.Context.request.contextPath}"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 글쓰기</title>
<%@ include file="../inc/head.jsp" %>
</head>
<body>
<%@ include file="../inc/header.jsp" %>
<div id="contents" class="contents">
	<div class="container px-4 px-lg-5 mt-5">
		<div class="row">
			<br><br>		
			<h2 class="tit">공지사항 등록</h2>
			<form action="addBoard.do" method="post">
				<table class="table">
					<tbody>
						<tr>
							<th><label for="btitle">제목</label></th>
							<td><input type="text" name="btitle" id="btitle" size="100" class="single100" placeholder="글제목 입력" required></td>
						</tr>
						<tr>
							<th><label for="content">내용</label></th>
							<td><textarea name="bcontent" id="bcontent" cols="100" rows="8" class="multi100" placeholder="글 내용 입력" required></textarea></td>
						</tr>
						<tr>
							<th><label for="bwriter">작성자</label></th>
							<td><input type="text" name="bwriter" id="bwriter" size="40" class="single40" value="admin" readonly></td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="submit" class="btn btn-primary" value="글 등록">
								<input type="reset" class="btn btn-primary" value="취소">
							</td>
						</tr>	
					</tbody>
				</table>
			</form>
		</div>
	</div>		
</div>
<%@ include file="../inc/footer.jsp" %>
</body>
</html>