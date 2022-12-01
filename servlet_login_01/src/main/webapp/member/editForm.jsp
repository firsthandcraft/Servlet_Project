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
			<h5 class="title">�̸��� �ּ� ����</h5>
			
			<label for="userEmail">�̸����� ��� �ǽó���?</label>
			<input type="email" id ="userEmail" placeholder="�̸����� �Է��ϼ���."name="email"value="${m.email}" readonly>
			<span class="alertEmail Jcheck hide">�̸����� �Է��ؾ��մϴ�.</span>

			<label for="userPwd" class="password">
				<p>��й�ȣ�� ���弼��.</p>
				<input type="password" id ="userPwd"placeholder="��й�ȣ�� ���弼��" name="pwd"value="${m.pwd}">
				<span class="material-symbols-outlined" >visibility_off</span><!-- visibility  -->
			</label>
			<span class="alertPwd Jcheck hide">��й�ȣ�� �ʹ� ª���ϴ�.</span>
			
			<label for="userName">� ������� �̸��� ����Ͻðھ��?</label>
			<input type="text" id="userName"class="user" placeholder="�����ʿ� ǥ�õǴ� �̸��� �Է��ϼ���."name="name"value="${m.name}">
			<span class="alertName Jcheck hide nameCheck">�����ʿ� ���� �̸��� �Է��ϼ���.</span>
			<span class="JcheckOK hide nameCheck">�����ʿ� ǥ�õǴ� �̸��Դϴ�.</span>
			
			<label>��������� ��� �ǽó���?</label>
 			<label for="userYear"><input type="text" id="userYear"class="user" placeholder="YYMMDD" maxlength="6"name="birth"value="${m.birth}"></label>
 			<span class="alertYear Jcheck hide">���ڸ� �Է��ϼ���.</span>
			<label>������ �����ΰ���?</label>
			<c:if test="${m.gender=='male'}">
				<p class="gender">
					<label><span>����</span><input type="radio" name="gender" value="male" checked></label>
					<label><span>����</span><input type="radio" name="gender" value="female"></label>
				</p>
			</c:if>
			<c:if test="${m.gender=='female'}">
				<p class="gender">
					<label><span>����</span><input type="radio" name="gender" value="male" ></label>
					<label><span>����</span><input type="radio" name="gender" value="female" checked></label>
				</p>
			</c:if>
			<span class=" Jcheck hide">������ �����ϼ���.</span>
			<label>�����</label>
			<input type="text" readonly name="MembershipPlan" value="${m.membershipPlan}">
			<input type="button" class="submit" value="edit" onClick="emptyCheck(this.form)">
			<input type="button" class="reset" value="reset">
		</form>
		<div class="or">
			<span class="line"></span>
			<span>OR</span>
			<span class="line"></span>
		</div>
		<p class="lost">�׸� �̿��Ͻñ� ���ϼ���?<a href ="${pageContext.request.contextPath}/DelController" style="color:#0095F6">Ż���ϱ�</a><p>
		</div>
</body>
<script src="${pageContext.request.contextPath}/javascript/MemberEditCheck.js" charset="utf-8"></script>

</html>