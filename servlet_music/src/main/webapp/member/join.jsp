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
			<h5 class="title">�̸��� �ּҷ� �����ϱ�</h5>
			
			<label for="userEmail">�̸����� ��� �ǽó���?</label>
			<input type="email" id ="userEmail" placeholder="�̸����� �Է��ϼ���."name="email">
			<span class="alertEmail Jcheck hide">�̸����� �Է��ؾ��մϴ�.</span>
			<!-- �߸��� �̸��� �ּ��Դϴ�. example@email.com �������� �ԷµǾ����� Ȯ���ϼ���. -->
			<!-- �� �̸����� �̹� ������ ����Ǿ� �ֽ��ϴ�. �α����ϼ���. -->
			<label for="useremailCheck">�̸����� Ȯ���ϼ���.</label>
			<input type="email" id="useremailCheck" class="user" placeholder="�̸����� �ٽ� �Է��ϼ���."name="emailCheck" >
			<span class="alertEmailCheck Jcheck hide">�̸��� �ּҰ� ���� ���� �ʽ��ϴ�.</span>
			
			<label for="userPwd" class="password">
				<p>��й�ȣ�� ���弼��.</p>
				<input type="password" id="userPwd"placeholder="��й�ȣ�� ���弼��" name="pwd">
				<span class="material-symbols-outlined" >visibility_off</span><!-- visibility  -->
			</label>
			<span class="alertPwd Jcheck hide">��й�ȣ�� �ʹ� ª���ϴ�.</span>
			
			<label for="userName">� ������� �̸��� ����Ͻðھ��?</label>
			<input type="text" id="userName"class="user" placeholder="�����ʿ� ǥ�õǴ� �̸��� �Է��ϼ���."name="name">
			<span class="alertName Jcheck hide nameCheck">�����ʿ� ���� �̸��� �Է��ϼ���.</span>
			<span class="JcheckOK hide nameCheck">�����ʿ� ǥ�õǴ� �̸��Դϴ�.</span>
			
			<label>��������� ��� �ǽó���?</label>
<!-- 			<div class="birth">
				<label for="userYear">����<input type="text" id="userYear"class="user" placeholder="YY" maxlength="4"name="year"></label>
				<label for="userMonth">��
					<select id="userMonth" name="month">
						<option selected disabled value>��</option>
						<option value="01">1��</option>
						<option value="02">2��</option>
						<option value="03">3��</option>
						<option value="04">4��</option>
						<option value="05">5��</option>
						<option value="06">6��</option>
						<option value="07">7��</option>
						<option value="08">8��</option>
						<option value="09">9��</option>
						<option value="10">10��</option>
						<option value="11">11��</option>
						<option value="12">12��</option>
					</select>
				</label>
				<label for="userDay">��<input type="text" id="userDay"name="date" placeholder="DD" maxlength="2"></label>
			</div>
			<span class="alertYear Jcheck hide">��ȿ�� ������ �Է��ϼ���.</span>
			<span class="alertMonth Jcheck hide">�¾ ���� �Է��ϼ���.</span>
			<span class="alertDay Jcheck hide">�ش� �� �� ��ȿ�� ��¥�� �Է��ϼ���.</span>
 -->
 			<label for="userYear"><input type="text" id="userYear"class="user" placeholder="YYMMDD" maxlength="6"name="birth" ></label>
 			<span class="alertYear Jcheck hide">���ڸ� �Է��ϼ���.</span>
			<label>������ �����ΰ���?</label>
				<p class="gender">
					<label><span>����</span><input type="radio" name="gender" value="male" checked></label>
					<label><span>����</span><input type="radio" name="gender" value="female"></label>
				</p>
			<span class=" Jcheck hide">������ �����ϼ���.</span>
			<input type="hidden" name="MembershipPlan"value="buyer">
			<input type="button" class="submit" value="Join" onClick="emptyCheck(this.form)">
		</form>
		<div class="or">
			<span class="line"></span>
			<span>OR</span>
			<span class="line"></span>
		</div>
		<p class="lost">������ �ֳ���?<a href ="${pageContext.request.contextPath}/member/login.jsp" style="color:#0095F6"> Log in</a><p>
		</div>
</body>
<script src="${pageContext.request.contextPath}/javascript/joinCheck.js" charset="utf-8"></script>
</html>