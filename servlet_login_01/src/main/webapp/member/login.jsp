<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>login</title>
<link rel="stylesheet" href="../css/login.css">
</head>
<body>

<div class="formWrap">
<h3>login</h3>
<form action="" method="post" >
	<input type="text" name="id" placeholder="Phone number, username, or email">
	<input type="password" name="pwd" placeholder="Password">
	<input type="submit" value="Log In">
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
<p class="lost"><a href ="">Don't have an account?<span style="color:#0095F6"> Sign up</span></a></p>

</div>
</body>
</html>