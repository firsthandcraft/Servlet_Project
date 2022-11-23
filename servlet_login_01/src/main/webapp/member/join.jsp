<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>join</title>
<link rel="stylesheet" href="../css/login.css">
</head>
<body>
<div class="formWrap">
<h3>join</h3>
<form action="" method="post" >
	<h5 class="title">이메일 주소로 가입하기</h5>
	<label for="userId">이메일이 어떻게 되시나요?</label>
	<input type="text" id ="userId"name="id" placeholder="이메일을 입력하세요.">
	
	<label for="userIdCheck">이메일을 확인하세요.</label>
	<input type="text" id="userIdCheck"name="idCheck" placeholder="이메일을 다시 입력하세요.">
	
		<label for="userPwd">비밀번호를 만드세요.</label>
	<input type="password" id ="userPwd" name="pwd" placeholder="비밀번호를 만드세요">
	
	<label for="userName">어떤 사용자의 이름을 사용하시겠어요?</label>
	<input type="text" id="userName"name="name" placeholder="프로필 이름을 입력하세요.">
	<span class="nameCheck"></span>
	
	<label>생년월일이 어떻게 되시나요?</label>
	<div class="birth">
		<label for="userYear">연도<input type="text" id="userYear"name="year" placeholder="YY"></label>
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
		<label for="userDay">일<input type="text" id="userDay"name="date" placeholder="DD"></label>
	</div>
	<label>성별이 무엇인가요?</label>
	<p class="gender">
		<label>남<input type="radio" name="gender" ></label>
		<label>여<input type="radio" name="gender" checked></label>
	</p>
	
	
	<input class="submit" type="button" value="Join">
</form>
<div class="or">
	<span class="line"></span>
	<span>OR</span>
	<span class="line"></span>
</div>
<div class="facebook">
	
	<p>계정이 있나요?<a href =""> Log in</a><p>
</div>
</div>
</body>
</html>