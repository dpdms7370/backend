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
<title>회원 가입</title>
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
				<h2 class="tit">회원가입</h2>
				<div class="panel-body">
				    <div class="row">
				        <div class="col-lg-6" id="fr1">
							<form action="joinPro.do" method="post" onsubmit="return joinConfirmMember(this)">
							<input type="hidden" name="member_cid_exist" id="member_cid_exist"/>
								<div class="form-group">
									<label for="cid">아이디</label>
									<div class="input-group-append">
										<input name="cid" id="cid" class="form-control" onkeypress="resetExistMember()" required />
										<br>
										<button type="button" class="btn btn-primary" onclick="checkExistMember()">중복확인</button>
										<c:if test="${msg == false}">
										<p class="msg">사용이 불가능한 아이디 입니다.</p>
										</c:if>
									</div>	
								</div>
								<br>
								<div class="form-group">
									<label for="cpw">비밀번호</label>
									<input type="password" name="cpw" id="cpw" class="form-control" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cpw2">비밀번호 확인</label>
									<input type="password" name="cpw2" id="cpw2" class="form-control" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cname">이름</label>
									<input type="text" name="cname" id="cname" class="form-control" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cbirth">생년월일</label>
									<input type="date" name="cbirth" id="cbirth" class="form-control" required />
								</div>
								<br>
								<div class="form-group">
									<label for="ctel">전화번호</label>
									<input type="tel" name="ctel" id="ctel" class="form-control" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cmail">이메일</label>
									<input type="cmail" name="cmail" id="cmail" class="form-control" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cadd1">주소1</label>
									<input type="text" name="cadd1" id="cadd1" class="form-control" required />
								</div>
								<br>
								<div class="form-group">
									<label for="cadd2">주소2</label>
									<input type="text" name="cadd2" id="cadd2" class="form-control" required />
								</div>
								<br>
								<div class="form-group">
									<label for="grade">서비스이용등급</label>
									<input type="text" name="grade" id="grade" class="form-control" value="1" readonly />
								</div>
								<br>
								<div class="form-group">
									<hidden><label for="grade">가입일</label></hidden>
									<hidden><!-- <input type="date" name="date" id="date" class="form-control" value="date()" readonly /> -->
									<span type="date" name="regdate" id="regdate" class="form-control" readonly>
													<script type="text/javascript">
										let today = new Date();   
			
										let year = today.getFullYear(); // 년도
										let month = today.getMonth() + 1;  // 월
										let date = today.getDate();  // 날짜
			
										document.write( year + '년 ' + month + '월 ' + date + '일')
									</script>
									</span>
									</hidden>
								</div>
								<br>
								<div class="form-group">
									<div class="text-right">
										<button type="submit" class="btn btn-primary">회원가입</button>
										<button type="reset" class="btn btn-primary">취소</button>
									</div>
								</div>
							</form>
							<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
							<script>
							function checkExistMember(){
								var cid = $("#cid").val();
								if(cid.trim().length == 0){
									alert("아이디를 입력해주세요");
									return false;
								}
								$.ajax({
									url : "checkExistMember.do",
									type: "post",
									data:{cid:cid},
									success : function(result) {
										if(result.trim()=='true'){
											alert("사용할 수 있는 아이디 입니다.");
											$("#member_cid_exist").val('true');
										} else {
											alert("중복된 아이디 입니다.");
											$("#member_cid_exist").val('false');
										}
									}
								});
							}
							function resetExistMember(){
								$("#member_cid_exist").val('false');
							}						
							function joinConfirmMember(f) {
								if(f.cpw.value!=f.cpw2.value) {
									alert("비밀번호와 비밀번호 확인이 다릅니다.");
									return false;
								}
								if(f.member_cid_exist.value!="true"){
									alert("아이디 중복확인을 하지 않으셨습니다.");
									return false;
								}
							}
							</script>
							<script type="text/javascript">
							let today = new Date();   

							let year = today.getFullYear(); // 년도
							let month = today.getMonth() + 1;  // 월
							let date = today.getDate();  // 날짜

							document.write('오늘의 날짜 : ' + year + '년 ' + month + '월 ' + date + '일')
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