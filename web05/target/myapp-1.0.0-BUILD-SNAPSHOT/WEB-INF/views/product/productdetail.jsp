<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보 보기</title>
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
				<h2 class="tit">상품 상세 정보</h2>
				<div class="panel-body">
				    <div class="row">
				        <div class="col-lg-6" id="fr1">
							<c:if test="${member.cid == 'admin' }">
							<form action="updateGoods.do" method="post" onsubmit="return uploadCk(this)">
							</c:if>
							<c:if test="${member.cid != 'admin' }">
							<form action="addCart.do" method="post">
							</c:if>
								<div class="form-group">
									<label for="pno">상품명</label>
									<div class="input-group-append">
										<input type="hidden" name="pno" id="pno" value="${product.pno }" />
										<c:if test="${member.cid == 'admin' }">
										<input type="text" name="pname" id="pname" class="form-control" value="${product.pname }" />
										</c:if>
										<c:if test="${member.cid != 'admin' }">
										<input type="hidden" name="pname" id="pname" value="${product.pname }"/>
										<span>${product.pname }</span>
										</c:if>
									</div>	
								</div>
								<br>
							<%-- 	<c:if test="${member.cid == 'admin' }">
								<div class="form-group">
									<label for="ccode">카테고리 코드</label>
									<input type="text" name="ccode" id="ccode" class="form-control" value="${goods.ccode }" />
								</div>
								</c:if>
								<c:if test="${sid != 'admin' }">
								<input type="hidden" name="ccode" id="ccode" value="${goods.ccode }"/>
								</c:if>
								<br> --%>
								<div class="form-group">
									<label for="pcost">가격</label>
									<c:if test="${member.cid == 'admin' }">
									<input type="text" name="pcost" id="pocst" class="form-control" value="${product.pcost}"/>
									</c:if>
									<c:if test="${member.cid != 'admin' }">
									<span>${product.pcost }</span>
									<input type="hidden" name="pcost" id="pcost" value="${product.pcost }"/>
									</c:if>
								</div>
								<br>
								<div class="form-group">
									<label for="pamunt">수량</label>
									<div>
										<c:if test="${member.cid == 'admin' }">
										<input type="number" name="pamunt" id="pamunt" class="form-control" value="${product.pamunt }" />
										</c:if>
										<c:if test="${member.cid != 'admin' && product.pamunt" >= 1}">
										<input type="number" name="pamunt" id="pamunt" class="form-control" min="1" max="${product.pamunt }" value="1" required/>
										</c:if>
										<c:if test="${member.cid != 'admin' && product.pamunt < 1}">
										<span>품절</span>
										</c:if>
									</div>
								</div>
								<br>
								<div class="form-group">
									<label for="pcok">설명</label>
									<div>
									<c:if test="${member.cid != 'admin' }">
									<span>${product.pcok }</span>
									</c:if>
									<c:if test="${member.cid == 'admin' }">
									<textarea name="pcok" id="pcok" rows="2" cols="80">${product.pcok }</textarea>
									</c:if>
									</div>
								</div>
								<br>
								<div class="form-group">
									<label for="pimg1">상품 이미지1</label>
									<div>
										<img src="../upload/${product.pimg1 }" alt="${product.pimg1 }"/>
									</div>
									<c:if test="${member.cid == 'admin' }">
										<input type="text" name="pimg1" id="pimg1" class="form-control" value="${product.pimg1}" />
										<button type="button" id="uploadBtn" onclick="goodsUpload()">상품 이미지1 업로드</button>
										<input type="hidden" id="upload_ck" name="uplaod_ck" />
									</c:if>
								</div>
								<div class="form-group">
									<label for="pimg2">상품 이미지2</label>
									<div>
										<img src="../upload/${product.pimg2 }" alt="${product.pimg2 }"/>
									</div>
									<c:if test="${member.cid == 'admin' }">
										<input type="text" name="pimg2" id="pimg2" class="form-control" value="${product.pimg2 }" />
										<button type="button" id="uploadBtn" onclick="goodsUpload()">상품 이미지 업로드</button>
										<input type="hidden" id="upload_ck" name="uplaod_ck" />
									</c:if>
								</div>
								<br>
								<div class="form-group">
									<label for="come">입고일</label>
									<span>${product.come }</span>
								</div>
								<br>
								<div class="form-group">
									<div class="text-right">
										<c:if test="${member.cid != 'admin' && (!empty member.cid) && product.pamunt >= 1 && empty pno }">
										<button type="submit" class="btn btn-primary">구매</button>
										<a href="javascript:addCartPro()" class="btn btn-primary">장바구니 담기</a>
										</c:if>
										<c:if test="${member.cid != 'admin' && (!empty member.cid) && product.pamunt >= 1 && !empty pno }">
										<button type="button" onclick="salesTrans()" class="btn btn-primary">구매하기</button>
										<a href="javascript:deleteCartPro()" class="btn btn-primary">장바구니 삭제</a>
										</c:if>
										<c:if test="${member.cid == 'admin' }">
										<button type="submit" class="btn btn-primary">상품 정보변경</button>
										<a href="deleteProduct.do?pno=${product.pno }" class="btn btn-primary">상품 삭제</a>
										</c:if>
										<a href="productList.do" class="btn btn-primary">목록</a>
										<button type="reset" class="btn btn-primary">취소</button>
									</div>
								</div>
							</form>
							<c:if test="${member.cid == 'admin' }">
							<script>
							var popwin;
							function goodsUpload(){
								popwin = window.open("productImgUploadForm.do", "이미지 업로드", "width=600, height=400");
							}
							
							function uploadCk(f){
								var pimg1 = f.pimg1.value;
								var upload_ck = f.upload_ck.value;
								if(pimg=="" || upload_ck==""){
									alert("해당 데이터 업로드가 되지 않았습니다.");
									return false;
								}
							}
							function uploadCk(f){
								var pimg2 = f.pimg2.value;
								var upload_ck = f.upload_ck.value;
								if(pimg=="" || upload_ck==""){
									alert("해당 데이터 업로드가 되지 않았습니다.");
									return false;
								}
							}
							</script>
							</c:if>
						<!-- 	<script>
							function salesTrans() {
								var pamunt = document.getElementById("pamunt").value;
								console.log(pamunt);
								location.href="../cart/addcart.do?pno="+${product.pamunt }+"&pno="+${pno}+"&pamunt="+pamunt;
							}
							function addCartPro(){
								var amunt = parseInt(document.getElementById("pamunt").value);
								var pno = document.getElementById("pno").value;
								if(amunt<1 || amunt>${product.pamunt}) {
									alert("장바구니 수량이 맞지 않습니다.");
									return false;
								}
								location.href = "../cart/addCart.do?pno="+pno+"&amunt="+amunt;
							}
							function deleteCartPro(){
								location.href = "../cart/deleteCart.do?pno="+${pno};
							}							
							</script> -->
						</div>
					</div>
				</div>		
			</div>
			<br><br><hr><br><br>
		<%-- 	<div class="row" style="width:640px; margin:0 auto;">
				<table class="table">
					<tbody id="review_area">
						<c:forEach items="${reviewList }" var="review" varStatus="status">
						<tr>
							<td><a href="../review/getReview.do?uno=${review.uno}">${review.subject }</a></td>
							<td>${review.regdate }</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				<c:if test="${reviewCk=='yes'}">
				<button type="button" onclick="addReviewFormLoading()" class="btn btn-primary">이용후기 남기기</button>
				</c:if>
			</div>
			<script>
			function addReviewFormLoading() {
				var gnum = document.getElementById("gnum").value
				location.href = "../review/addReviewForm.do?gnum="+gnum;	
			}
			</script>
			<div class="blank" style="min-height:350px;"></div>
		</div>	 --%>
	</div>
	<%@ include file="../inc/footer.jsp" %>

</body>
</html>