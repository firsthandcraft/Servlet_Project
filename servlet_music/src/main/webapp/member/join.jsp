<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>join</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">

<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

</head>
<body>
<div class="formWrap">
		<h3>join</h3>
		<form action="${pageContext.request.contextPath}/JoinController" name="joinForm" method="post">
			<h5 class="title">이메일 주소로 가입하기</h5>
			
			<label for="userEmail">이메일이 어떻게 되시나요?</label>
			<input type="email" id ="userEmail" placeholder="이메일을 입력하세요."name="email">
			<span class="alertEmail Jcheck hide">이메일을 입력해야합니다.</span>
			<!-- 잘못된 이메일 주소입니다. example@email.com 형식으로 입력되었는지 확인하세요. -->
			<!-- 이 이메일은 이미 계정에 연결되어 있습니다. 로그인하세요. -->
			<label for="useremailCheck">이메일을 확인하세요.</label>
			<input type="email" id="useremailCheck" class="user" placeholder="이메일을 다시 입력하세요."name="emailCheck" >
			<span class="alertEmailCheck Jcheck hide">이메일 주소가 일지 하지 않습니다.</span>
			
			<label for="userPwd" class="password">
				<p>비밀번호를 만드세요.</p>
				<input type="password" id="userPwd"placeholder="비밀번호를 만드세요" name="pwd">
				<span class="material-symbols-outlined" >visibility_off</span><!-- visibility  -->
			</label>
			<span class="alertPwd Jcheck hide">비밀번호가 너무 짧습니다.</span>
			
			<label for="userName">어떤 사용자의 이름을 사용하시겠어요?</label>
			<input type="text" id="userName"class="user" placeholder="프로필에 표시되는 이름을 입력하세요."name="name">
			<span class="alertName Jcheck hide nameCheck">프로필에 쓰일 이름을 입력하세요.</span>
			<span class="JcheckOK hide nameCheck">프로필에 표시되는 이름입니다.</span>
			
			<label>생년월일이 어떻게 되시나요?</label>
<!-- 			<div class="birth">
				<label for="userYear">연도<input type="text" id="userYear"class="user" placeholder="YY" maxlength="4"name="year"></label>
				<label for="userMonth">월
					<select id="userMonth" name="month">
						<option selected disabled value>월</option>
						<option value="01">1월</option>
						<option value="02">2월</option>
						<option value="03">3월</option>
						<option value="04">4월</option>
						<option value="05">5월</option>
						<option value="06">6월</option>
						<option value="07">7월</option>
						<option value="08">8월</option>
						<option value="09">9월</option>
						<option value="10">10월</option>
						<option value="11">11월</option>
						<option value="12">12월</option>
					</select>
				</label>
				<label for="userDay">일<input type="text" id="userDay"name="date" placeholder="DD" maxlength="2"></label>
			</div>
			<span class="alertYear Jcheck hide">유효한 연도를 입력하세요.</span>
			<span class="alertMonth Jcheck hide">태어난 달을 입력하세요.</span>
			<span class="alertDay Jcheck hide">해달 월 중 유효한 날짜를 입력하세요.</span>
 -->
 			<label for="userYear"><input type="text" id="userYear"class="user" placeholder="YYMMDD" maxlength="6"name="birth" ></label>
 			<span class="alertYear Jcheck hide">숫자를 입력하세요.</span>
			<label>성별이 무엇인가요?</label>
				<p class="gender">
					<label><span>남성</span><input type="radio" name="gender" value="male" checked></label>
					<label><span>여성</span><input type="radio" name="gender" value="female"></label>
				</p>
			<span class=" Jcheck hide">성별을 선택하세요.</span>
			<input type="hidden" name="MembershipPlan"value="buyer">
			<input type="button" class="submit" value="Join" onClick="emptyCheck(this.form)">
		</form>
		<div class="or">
			<span class="line"></span>
			<span>OR</span>
			<span class="line"></span>
		</div>
		<p class="lost">계정이 있나요?<a href ="${pageContext.request.contextPath}/member/login.jsp" style="color:#0095F6"> Log in</a><p>
		</div>
</body>
<script src="${pageContext.request.contextPath}/javascript/joinCheck.js" charset="utf-8"></script>
</html>