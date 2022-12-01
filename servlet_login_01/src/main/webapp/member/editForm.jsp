<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>edit</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
</head>
<body>
<div class="formWrap">
	<h3>edit</h3>
	<form action="${pageContext.request.contextPath}/EditController" name="joinForm" method="post">
			<h5 class="title">이메일 주소 수정</h5>
			
			<label for="userEmail">이메일이 어떻게 되시나요?</label>
			<input type="email" id ="userEmail" placeholder="이메일을 입력하세요."name="email"value="${m.email}" readonly>
			<span class="alertEmail Jcheck hide">이메일을 입력해야합니다.</span>

			<label for="userPwd" class="password">
				<p>비밀번호를 만드세요.</p>
				<input type="password" id ="userPwd"placeholder="비밀번호를 만드세요" name="pwd"value="${m.pwd}">
				<span class="material-symbols-outlined" >visibility_off</span><!-- visibility  -->
			</label>
			<span class="alertPwd Jcheck hide">비밀번호가 너무 짧습니다.</span>
			
			<label for="userName">어떤 사용자의 이름을 사용하시겠어요?</label>
			<input type="text" id="userName"class="user" placeholder="프로필에 표시되는 이름을 입력하세요."name="name"value="${m.name}">
			<span class="alertName Jcheck hide nameCheck">프로필에 쓰일 이름을 입력하세요.</span>
			<span class="JcheckOK hide nameCheck">프로필에 표시되는 이름입니다.</span>
			
			<label>생년월일이 어떻게 되시나요?</label>
 			<label for="userYear"><input type="text" id="userYear"class="user" placeholder="YYMMDD" maxlength="6"name="birth"value="${m.birth}"></label>
 			<span class="alertYear Jcheck hide">숫자를 입력하세요.</span>
			<label>성별이 무엇인가요?</label>
			<c:if test="${m.gender=='male'}">
				<p class="gender">
					<label><span>남성</span><input type="radio" name="gender" value="male" checked></label>
					<label><span>여성</span><input type="radio" name="gender" value="female"></label>
				</p>
			</c:if>
			<c:if test="${m.gender=='female'}">
				<p class="gender">
					<label><span>남성</span><input type="radio" name="gender" value="male" ></label>
					<label><span>여성</span><input type="radio" name="gender" value="female" checked></label>
				</p>
			</c:if>
			<span class=" Jcheck hide">성별을 선택하세요.</span>
			<label>요금제</label>
			<input type="text" readonly name="MembershipPlan" value="${m.membershipPlan}">
			<input type="button" class="submit" value="edit" onClick="emptyCheck(this.form)">
			<input type="button" class="reset" value="reset">
		</form>
		<div class="or">
			<span class="line"></span>
			<span>OR</span>
			<span class="line"></span>
		</div>
		<p class="lost">그만 이용하시길 원하세요?<a href ="${pageContext.request.contextPath}/DelController" style="color:#0095F6">탈퇴하기</a><p>
		</div>
</body>
<script src="${pageContext.request.contextPath}/javascript/MemberEditCheck.js" charset="utf-8"></script>

</html>