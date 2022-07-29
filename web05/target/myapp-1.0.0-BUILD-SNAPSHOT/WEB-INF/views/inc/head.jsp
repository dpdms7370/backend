<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%-- <c:set var="path" value="{pageContext.request.contextPath }" /> --%>
<%
	String path = request.getContextPath();
%>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<!-- 메타 데이터 -->
<!-- 파비콘 -->
<link rel="shortcut icon" href="https://papago.naver.com/favicon.ico" />
<!-- 오픈그래프 -->
<!-- 폰트 -->
<!-- 필수 플러그인 -->
<script src="${pageContext.request.contextPath}/resources/inc/jquery-latest.js" crossorigin="anonymous"></script>
<!-- Bootstrap icons-->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" />
<!-- Core theme CSS (includes Bootstrap)-->

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<!-- Core theme JS-->
<script src="${pageContext.request.contextPath}/resources/inc/scripts.js" crossorigin="anonymous"></script>
<!-- 외부 스타일 -->
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
<link href="${pageContext.request.contextPath}/resources/css/styles.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/resources/css/datatables.min.css" rel="stylesheet" type="text/css">

   