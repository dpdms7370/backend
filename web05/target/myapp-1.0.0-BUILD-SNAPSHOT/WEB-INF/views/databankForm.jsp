<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 보기</title>
<%@ include file="./inc/head.jsp" %>
<style type="text/css">
.contents{margin: 10rem auto; }
.tit{text-align:center;}
</style>
</head>
<body>
<%@ include file="./inc/header.jsp" %>
<div id="contents" class="contents">
	<div class="container px-4 px-lg-5 mt-5">
		<div class="row">
			<br><br>		
			<h2 class="tit"><strong>상품 올리기</strong></h2>
			<form action="databankInsert.do" method="post" enctype="multipart/form-data">
			<table class="table">
				<tbody>
					<tr>
						<th><label for="title">제목</label>
						<td>						
							<input type="text" name="title" id="title" size="40" class="single100"/><br><br>
						</td>
					</tr>
					<tr>
						<th><label for="fileurl">파일</label></th>
						<td>
							<input type="file" name="fileurl" id="fileurl" size="100" class="single100"/>
						</td>
					</tr>
					<tr>
						<th><label for="author">작성자</label></th>							
						<td>
							<input type="text" name="author" id="author" size="40" class="single40"/>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<input type="submit" name="submitBtn" value="자료 등록">
						</td>
					</tr>	
				</tbody>
			</table>
			</form>
		</div>
	</div>		
</div>
<%@ include file="./inc/footer.jsp" %>
</body>
</html>