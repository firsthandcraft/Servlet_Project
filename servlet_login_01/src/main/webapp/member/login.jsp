<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
<link rel="stylesheet" href="../css/reset.css">
<link rel="stylesheet" href="../css/login.css">

</head>
<body>

<div class="formWrap">
<h3>login</h3>
<form action="${pageContext.request.contextPath}/LoginController" method="post" name="loginForm" onsubmit=" return nullCheck(this.form)">
	<input type="email" name="email" placeholder="이메일 주소 또는 사용자 이름">
	<span class="LoginAlertEmail Jcheck hide">이메일을 입력해야합니다.</span>
	<input type="password" name="pwd" placeholder="비밀번호">
	<span class="LoginAlertPwd Jcheck hide">비밀번호를 입력해야합니다.</span>
	<input class="submit" type="button" value="Log In" onClick="nullCheck(this.form)">
</form>
<div class="or">
	<span class="line"></span>
	<span>OR</span>
	<span class="line"></span>
</div>
<div class="facebook">
	<a href ="">Log in with Facebook</a>
</div>
<p class="lost"><a href ="">Forgot password?</a></p>
<p class="lost"><a href ="${pageContext.request.contextPath}/member/join.jsp">Don't have an account?<span style="color:#0095F6"> Sign up</span></a></p>

</div>
</body>
<script src="../javascript/loginCheck.js" charset="utf-8"></script>
</html>