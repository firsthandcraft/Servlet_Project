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
	<h5 class="title">�̸��� �ּҷ� �����ϱ�</h5>
	<label for="userId">�̸����� ��� �ǽó���?</label>
	<input type="text" id ="userId"name="id" placeholder="�̸����� �Է��ϼ���.">
	
	<label for="userIdCheck">�̸����� Ȯ���ϼ���.</label>
	<input type="text" id="userIdCheck"name="idCheck" placeholder="�̸����� �ٽ� �Է��ϼ���.">
	
		<label for="userPwd">��й�ȣ�� ���弼��.</label>
	<input type="password" id ="userPwd" name="pwd" placeholder="��й�ȣ�� ���弼��">
	
	<label for="userName">� ������� �̸��� ����Ͻðھ��?</label>
	<input type="text" id="userName"name="name" placeholder="������ �̸��� �Է��ϼ���.">
	<span class="nameCheck"></span>
	
	<label>��������� ��� �ǽó���?</label>
	<div class="birth">
		<label for="userYear">����<input type="text" id="userYear"name="year" placeholder="YY"></label>
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
		<label for="userDay">��<input type="text" id="userDay"name="date" placeholder="DD"></label>
	</div>
	<label>������ �����ΰ���?</label>
	<p class="gender">
		<label>��<input type="radio" name="gender" ></label>
		<label>��<input type="radio" name="gender" checked></label>
	</p>
	
	
	<input class="submit" type="button" value="Join">
</form>
<div class="or">
	<span class="line"></span>
	<span>OR</span>
	<span class="line"></span>
</div>
<div class="facebook">
	
	<p>������ �ֳ���?<a href =""> Log in</a><p>
</div>
</div>
</body>
</html>