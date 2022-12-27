<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>passwordReset</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>
<body>

<c:if test="${requestScope.flag==false}">
	<script>
		alert("등록되지 않은 이메일입니다.");
		PasswordResetForm.email.focus();
	</script>
</c:if>
<div class="formWrap">
<h3>Password Reset</h3>
<h5>등록 시 사용한 사용자 이름 또는 이메일 주소를 입력하세요. 임시 비밀번호를 발급해드립니다.</h5>
<form action="${pageContext.request.contextPath}/PasswordResetController" method="post" name="PasswordResetForm" onsubmit=" return nullCheck(this.form)">
	<input type="email" name="email" placeholder="이메일 주소">
	<span class="LoginAlertEmail Jcheck hide">이메일을 입력해야합니다.</span>
	<input class="submit" type="button" value="send" onClick="nullCheck(this.form)">
</form>
<div class="or">
	<span class="line"></span>
	<span>OR</span>
	<span class="line"></span>
</div>
<div class="facebook">
	<a href ="">Log in with Facebook</a>
</div>
<p class="lost"><a href ="${pageContext.request.contextPath}/member/login.jsp">Login</a></p>
<p class="lost"><a href ="${pageContext.request.contextPath}/member/join.jsp">Don't have an account?<span style="color:#0095F6"> Sign up</span></a></p>
</div>

</body>
<script src="${pageContext.request.contextPath}/javascript/passwordResetCheck.js" charset="utf-8"></script>
</html>