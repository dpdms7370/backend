<%@ page language="java" contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path1" value="{pageContext.request.contextPath }" />
<!DOCTYPE>
<html>
<head>
	<title>SHOP MAIN</title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<!-- 메타 데이터 -->
<!-- 파비콘 -->
<!-- 오픈그래프 -->
<!-- 폰트 -->
<!-- 필수 플러그인 -->
<script src="https://code.jquery.com/jquery-latest.js" crossorigin="anonymous"></script>
<!-- Bootstrap icons-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
<!-- Core theme CSS (includes Bootstrap)-->
<link href="../inc/styles.css" rel="stylesheet" />
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<!-- Core theme JS-->
<script src="../inc/scripts.js" crossorigin="anonymous"></script>
<style>
label { padding-right:20px; padding-left:8px; }
.tit { padding-top:1.5rem; }
.row.inner { width:1320px; margin:0 auto; }
.h-100 { height:380px !important; overflow-y:hidden; }
</style>
</head>
<body>
<%@ include file="admin_header.jsp" %>
 <link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" type="text/css">
<div id="contents" class="contents">
	<div class="row inner">
		<h1 class="tit">관리자 메인</h1>
		<hr/>
		<%-- <div class="panel-body">
			<P>  The time on the server is ${serverTime}. </P>
		</div> --%>
	</div>
	<div class="row inner">
		<div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202108/89a7752ffc870f258092f4a6fdec889a.jpg" alt="pick">
	              <!-- Product details-->
	              <div class="card-body p-4">
	                  <div class="text-center">
	                      <!-- Product name-->
	                      <h5 class="fw-bolder">Fancy Product</h5>
	                      <!-- Product price-->
	                      $40.00 - $80.00
	                  </div>
	              </div>
	              <!-- Product actions-->
	              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">View options</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Sale badge-->
	              <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/20200408/a52828b00faacd858518f99a20655d80.jpg" alt="마이구미">
	              <!-- Product details-->
	              <div class="card-body p-4">
	                  <div class="text-center">
	                      <!-- Product name-->
	                      <h5 class="fw-bolder">Special Item</h5>
	                      <!-- Product reviews-->
	                      <div class="d-flex justify-content-center small text-warning mb-2">
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                      </div>
	                      <!-- Product price-->
	                      <span class="text-muted text-decoration-line-through">$20.00</span>
	                      $18.00
	                  </div>
	              </div>
	              <!-- Product actions-->
	              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Sale badge-->
	              <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/201907/8271b618291085ced9e37ba642068bae.jpg" alt="냥냥펀치">
	              <!-- Product details-->
	              <div class="card-body p-4">
	                  <div class="text-center">
	                      <!-- Product name-->
	                      <h5 class="fw-bolder">Sale Item</h5>
	                      <!-- Product price-->
	                      <span class="text-muted text-decoration-line-through">$50.00</span>
	                      $25.00
	                  </div>
	              </div>
	              <!-- Product actions-->
	              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202109/b08ddffd31b6c7d3c71f6251a5502a5c.jpg" alt="곰돌이 패밀리">
	              <!-- Product details-->
	              <div class="card-body p-4">
	                  <div class="text-center">
	                      <!-- Product name-->
	                      <h5 class="fw-bolder">Popular Item</h5>
	                      <!-- Product reviews-->
	                      <div class="d-flex justify-content-center small text-warning mb-2">
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                      </div>
	                      <!-- Product price-->
	                      $40.00
	                  </div>
	              </div>
	              <!-- Product actions-->
	              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Sale badge-->
	              <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202206/6090b7c1b20d351575e55e8d8ebff00d.jpg" alt="진주진주">
	              <!-- Product details-->
	              <div class="card-body p-4">
	                  <div class="text-center">
	                      <!-- Product name-->
	                      <h5 class="fw-bolder">Sale Item</h5>
	                      <!-- Product price-->
	                      <span class="text-muted text-decoration-line-through">$50.00</span>
	                      $25.00
	                  </div>
	              </div>
	              <!-- Product actions-->
	              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202206/6659cdf05f48a15d22a18673756b63ef.jpg" alt="오롤리데이">
	              <!-- Product details-->
	              <div class="card-body p-4">
	                  <div class="text-center">
	                      <!-- Product name-->
	                      <h5 class="fw-bolder">Fancy Product</h5>
	                      <!-- Product price-->
	                      $120.00 - $280.00
	                  </div>
	              </div>
	              <!-- Product actions-->
	              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">View options</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Sale badge-->
	              <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202205/710d4460940e67eb0d45c8ac9b399da1.jpg" alt="최고심">
	              <!-- Product details-->
	              <div class="card-body p-4">
	                  <div class="text-center">
	                      <!-- Product name-->
	                      <h5 class="fw-bolder">Special Item</h5>
	                      <!-- Product reviews-->
	                      <div class="d-flex justify-content-center small text-warning mb-2">
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                      </div>
	                      <!-- Product price-->
	                      <span class="text-muted text-decoration-line-through">$20.00</span>
	                      $18.00
	                  </div>
	              </div>
	              <!-- Product actions-->
	              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/20191205/489647f387b3a680e77ac147ec169c7f.jpg" alt="필통">
	              <!-- Product details-->
	              <div class="card-body p-4">
	                  <div class="text-center">
	                      <!-- Product name-->
	                      <h5 class="fw-bolder">Popular Item</h5>
	                      <!-- Product reviews-->
	                      <div class="d-flex justify-content-center small text-warning mb-2">
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                          <div class="bi-star-fill"></div>
	                      </div>
	                      <!-- Product price-->
	                      $40.00
	                  </div>
	              </div>
	              <!-- Product actions-->
	              <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">Add to cart</a></div>
	              </div>
	          </div>
	      </div>
	  </div>
	</div>  
	<div class="blank" style="min-height:350px;"></div>	
</div>
<%@ include file="../inc/footer.jsp" %>
</body>
</html>
