<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 보기</title>
<%@ include file="../inc/head.jsp" %>
</head>
<body>
<%@ include file="../inc/header.jsp" %>
<div id="contents" class="contents">
	<div class="container px-4 px-lg-5 mt-5">
		<div class="row">
			<br><br>		
			<h2 class="tit">공지사항 보기</h2>
			<form action="updateNotice.do" method="post">
			<table class="table">
				<tbody>
					<tr>
						<th><label for="btitle">제목</label></th>
						<td>
							<c:if test="${member.cid == 'admin' }">
							<input type="hidden" name="bno" id="bno" value="${board.bno}">
							<input type="text" name="btitle" id="btitle" size="100" class="single100" placeholder="글제목 입력" value="${board.btitle}" required>
							</c:if>
							<c:if test="${member.cid != 'admin' }">
							<span>${board.btitle }</span>							
							</c:if>
						</td>
					</tr>
					<tr>
						<th><label for="bcontent">내용</label></th>
						<td>
							<c:if test="${member.cid == 'admin' }">
							<textarea name="bcontent" id="bcontent" cols="100" rows="8" class="multi100" placeholder="글 내용 입력" required>${board.bcontent }</textarea>
							</c:if>
							<c:if test="${member.cid != 'admin' }">
							<p>${board.bcontent }</p>							
							</c:if>
						</td>
					</tr>
					<tr>
						<th><label for="bwriter">작성자</label></th>							
						<td>
							<c:if test="${member.cid == 'admin' }">
							<input type="text" name="bwriter" id="bwriter" size="40" class="single40" value="admin" readonly>
							</c:if>
							<c:if test="${member.cid != 'admin' }">
							<p>${board.bwriter }</p>							
							</c:if>
						</td>
					</tr>
					<tr>
						<th>작성일</th>							
						<td>
							<p>${board.bdate }</p>							
						</td>
					</tr>
					<tr>
						<th>읽은 횟수</th>							
						<td>
							<p>${notice.visited }</p>							
						</td>
					</tr> 
					<tr>
						<td colspan="2">
							<c:if test="${member.cid == 'admin' }">
							<input type="submit" class="btn btn-primary" value="글 수정">
							<input type="reset" class="btn btn-primary" value="취소">
							<a href="deleteBoard.do?bno=${board.bno}" class="btn btn-primary">글 삭제</a>
							</c:if>
							<a href="list.do?curPage=1" class="btn btn-primary">목록</a>
							<!-- <a href="pageList.do?curPage=1" class="btn btn-primary">목록</a>  -->
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