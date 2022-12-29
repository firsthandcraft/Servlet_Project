<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">

</head>
<body>
<c:if test="${requestScope.flag==false}">
	<script>
		alert("���̵�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
		loginForm.email.focus();
	</script>
</c:if>
<div class="formWrap">
<h3>login</h3>
<form action="${pageContext.request.contextPath}/LoginController" method="post" name="loginForm" onsubmit=" return nullCheck(this.form)">
	<input type="email" name="email" placeholder="�̸��� �ּ�">
	<span class="LoginAlertEmail Jcheck hide">�̸����� �Է��ؾ��մϴ�.</span>
	<input type="password" name="pwd" placeholder="��й�ȣ">
	<span class="LoginAlertPwd Jcheck hide">��й�ȣ�� �Է��ؾ��մϴ�.</span>
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
<p class="lost"><a href ="${pageContext.request.contextPath}/member/passwordReset.jsp">Forgot password?</a></p>
<p class="lost"><a href ="${pageContext.request.contextPath}/member/join.jsp">Don't have an account?<span style="color:#0095F6"> Sign up</span></a></p>
</div>

</body>
<script src="${pageContext.request.contextPath}/javascript/loginCheck.js" charset="utf-8"></script>
</html>