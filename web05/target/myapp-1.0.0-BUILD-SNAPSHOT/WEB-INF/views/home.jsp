<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:set var="path1" value="{page.Context.request.contextPath}"/>

<!DOCTYPE>
<html>
<head>
	<title>Shop Main</title>
<%@include file="./inc/head.jsp" %>
<style>
label { padding-right:20px; padding-left:8px; }
.tit { padding-top:1.5rem; }
.row.inner { width:1320px; margin:0 auto; }
.h-100 { height:380px !important; overflow-y:hidden; }
</style>
</head>
<body>
<%@ include file="./inc/header.jsp" %>
<%@include file="./inc/visual.jsp" %>
<link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" type="text/css">


	<div class="row inner">
		<div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202206/e07e7ade107dbae61ed3ea551371846c.jpg" alt="세컨드모닝">
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
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202103/a92a427648716ed3cad19c0347b2b4e2.jpg" alt="난 행복한 쿼카">
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
	                  <div class="text-center"><button class="btn btn-outline-dark mt-auto" >View options</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Sale badge-->
	              <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202205/07dd7ded399ccfc1967fffd1b4548163.jpg" alt="최고심-온 우주가 나를 도와!">
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
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">View options</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202206/daee7b2d73d50899c8151c02f59934fd.jpg" alt="양말엔 선물을">
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
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">View options</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Sale badge-->
	              <div class="badge bg-dark text-white position-absolute" style="top: 0.5rem; right: 0.5rem">Sale</div>
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202107/bb3b4630fc44832eb476640f9dac1cf2.jpg" alt="제로퍼제로">
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
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">View options</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202205/1c11834d4c9b2391dade88e16823e513.jpg" alt="어니더디데이">
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
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202204/379d71c26e658b39bf826bc91e3813cc.jpg" alt="...">
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
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#">View options</a></div>
	              </div>
	          </div>
	      </div>
	      <div class="col mb-5">
	          <div class="card h-100">
	              <!-- Product image-->
	              <img class="card-img-top" src="https://onemorebag.kr/web/product/big/202007/d1c9656050025ccf0a764380cba25032.jpg" alt="귀여운 멍멍이">
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
	                  <div class="text-center"><a class="btn btn-outline-dark mt-auto" href="#" id="need">View options</a></div>
	              </div>
	          </div>
	      </div>
	  </div>
 	<div id="contents" class="contents"></div>
<!-- 	<div class="blank" style="min-height:350px;"></div>	 -->
</div>
<%@ include file="./inc/footer.jsp" %>
</body>
</html>

