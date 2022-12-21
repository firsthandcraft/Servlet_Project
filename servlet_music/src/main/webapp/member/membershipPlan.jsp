<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/nav.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/membershipPlan.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
  crossorigin="anonymous"></script>
<meta charset="EUC-KR">
<title>membershipPlan</title>
</head>
<body>

<div class="Wrap">
    <!-- header -->
    <%@ include file="/common/header.jsp" %>
    <!-- header -->
       <main><!-- main -->
         <form class="contentWrap" action="${pageContext.request.contextPath}/MemberShipPlanController" method="post">
		    <h3>요금제 선택하기</h3>
		    <h5>휴대폰, 스피커 및 기타 디바이스에서 제한 없이 마음껏 들으세요.</h5>
		    <div class="plan">
		    	<input type="radio" name="MembershipPlan" id="buyer" checked value="buyer">
	        	<label for="buyer">
	        		<span class="check-icon"></span>
					<dl>
		            <dt>Basic</dt>
		            <dd>나만의 플레이리스트</dd>
		            </dl>
	            </label>
	            <input type="radio" name="MembershipPlan" id="seller" value="seller">
				<label for="seller">
				<span class="check-icon"></span>
					<dl>
		            <dt>Premium Seller</dt>
		            <dd>나만의 플레이리스트</dd>
		            <dd>나만의 음악 올리기</dd>
		            </dl>
				</label>
		    </div>
		   <input type="text" readonly name="email" value="${m.email}">
		    <input type="submit" value="시작하기">
		</form>
      </main><!-- main -->
</div>
</body>
<script src="${pageContext.request.contextPath}/javascript/header.js" charset="utf-8"></script>

</html>