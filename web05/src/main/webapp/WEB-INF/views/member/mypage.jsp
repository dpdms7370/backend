<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<%@ include file="../inc/head.jsp" %>
<style>
form:label { display:inline-block; }
</style>
<script>
$(document).ready(function(){
	$("#frm1").css("z-index","1000");
});
</script>
<style>
.tit { padding-top:1em; }
</style>
</head>
<body>
	<%@ include file="../inc/header.jsp" %>
	<div id="contents" class="contents">
		<div class="container px-4 px-lg-5 mt-5">
			<div class="row">
				<br><br>		
				<h2 class="tit">마이 페이지</h2>
				<div class="panel-body">
				    <div class="row">
				        <div class="col-lg-6" id="fr1">
							<form action="updatePro.do" method="post" onsubmit="return joinConfirmMember(this)">
								<div class="form-group">
									<label for="cid">아이디</label>
									<div class="input-group-append">
										<input name="cid" id="cid" class="form-control" value="${member.cid }" readonly />
									</div>	
								</div>
								<br>
								<div class="form-group">
									<label for="cpw">비밀번호</label>
									<input type="password" name="cpw" id="cpw" class="form-control" value="${member.cpw }" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cpw2">비밀번호 확인</label>
									<input type="password" name="cpw2" id="cpw2" class="form-control" value="${member.cpw2 }" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cname">이름</label>
									<input type="text" name="cname" id="cname" class="form-control" value="${member.cname }" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cbirth">생년월일</label>
									<span class="form-control">${member.cbirth }</span>
									<input type="hidden" name="cbirth" id="cbirth" class="form-control" value="${member.cbirth }" required />
								</div>
								<br>
								<div class="form-group">
									<label for="ctel">전화번호</label>
									<input type="tel" name="ctel" id="ctel" class="form-control" value="${member.ctel }" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cmail">이메일</label>
									<input type="email" name="cmail" id="cmail" class="form-control" value="${member.cmail }" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cadd1">주소</label>
									<input type="text" name="cadd1" id="cadd1" class="form-control" value="${member.cadd1 }" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cadd2">상세주소</label>
									<input type="text" name="cadd2" id="cadd2" class="form-control" value="${member.cadd2 }" required />
								</div>
								<br>
							<%-- 	<div class="form-group">
									<label for="regdate">가입일</label>
									<input type="date" name="regdate" id="regdate" class="form-control" value="${member.regdate }" readonly />
								</div> --%>
								<br>
								<div class="form-group">
									<label for="grade">이용등급</label>
									<input type="text" name="grade" id="grade" class="form-control" value="${member.grade }" readonly />
								</div>
								<br>
								<div class="form-group">
									<div class="text-right">
										<button type="submit" class="btn btn-primary">정보수정</button>
										<a href="deleteMember.do" class="btn btn-primary" >탈퇴</a>
										<a href="/" class="btn btn-primary" >취소</a>
									</div>
								</div>
							</form>
							<script>
							function joinConfirmMember(f) {
								if(f.pwd.value!=f.pwd2.value) {
									alert("비밀번호와 비밀번호 확인이 다릅니다.");
									return false;
								}
							}
							</script>
						</div>
					</div>
				</div>		
			</div>
			<div class="blank" style="min-height:350px;"></div>
		</div>	
	</div>
	<%@ include file="../inc/footer.jsp" %>

</body>
</html>