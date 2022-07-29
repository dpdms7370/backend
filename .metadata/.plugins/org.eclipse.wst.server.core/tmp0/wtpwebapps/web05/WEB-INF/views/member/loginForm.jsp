<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인을 하세요.</title>

<%@include file="../inc/head.jsp" %>
<style>
.col-lg-6{width:300px;}
form:label { display:inline-block; }
.login{margin: 10rem auto; }
.tit{text-align:center;}
.contents{margin:10rem 0;}
.form-control {display: block;
    width: 15%;
    padding: 0.375rem 0.75rem;
    font-size: 1rem;
    font-weight: 400;
    line-height: 1.5;
    color: #212529;
    background-color: #fff;
    background-clip: padding-box;
    border: 1px solid #ced4da;
    -webkit-appearance: none;
    -moz-appearance: none;
    appearance: none;
    border-radius: 0.25rem;
    transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;
    margin: 0 auto;
}
input:first-child{margin-bottom:1rem;}
.text-right{
	 margin: 0 auto;
	 width: 12%;
	 padding: 0.375rem 2rem;} // 작게 만들었을 때 이걸 없애면 화면에서 버튼 란이 움직임
.msg{text-align: center;}
</style>
</head>
<body>

<%@include file="../inc/header.jsp" %>

	<div id="contents" class="contents">
		<h2 class="tit"><strong>로그인</strong></h2>
		<div class="panel-body">
		    <div class="row">
		        <div class="col-lg-6" id="fr1">
					<form action="loginPro.do" method="post" id="frm1">
						<div class="form-group">
						<!-- 	<label for="cid" class="form-con">아이디</label> -->
							<input type="text" name="cid" id="cid" class="form-control" placeholder="아이디를 입력하세요." required/>
						</div>
						<div class="form-group">
						<!-- 	<label for="cpw" class="form-con" >비밀번호</label> -->
							<input type="password" name="cpw" id="cpw" class="form-control" placeholder="비밀번호를 입력하세요." required/>
						</div>
						<div class="form-group">
							<div class="text-right">
								<button type="submit" class="btn btn-primary">로그인</button>
								<button type="reset" class="btn btn-primary">취소</button>
							</div>
						</div>
					</form>
					<c:if test="${msg == false }">
					<div class="msg" id="msg">아이디 또는 비밀번호 입력이 잘못되어 로그인이 실패되었습니다.</div>
					</c:if>
					<script>
					</script>
				</div>
			</div>
		</div>	
	</div>	
<%@include file="../inc/footer.jsp" %>	
</body>
</html>