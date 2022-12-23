<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/nav.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/productEdit.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
  crossorigin="anonymous"></script>
<meta charset="EUC-KR">
<title>musicInsert</title>
</head>
<body>

<div class="Wrap">
    <!-- nav -->
    <%@ include file="/common/nav.jsp" %>
   	<!-- nav -->
    <!-- header -->
    <%@ include file="/common/header.jsp" %>
    <!-- header -->
    <div class="contentWrap"><!-- contentWrap -->
        <main><!-- main -->
                <h3>앨범등록</h3>
                <div class="enrollWrap">
                    <form method="post" name="albumForm"action="${pageContext.request.contextPath}/ProductInsertController" enctype="multipart/form-data" >
                        <ul class="albumContent">
                            <li><input type="text" name="p_title" id=""placeholder="앨범 제목"></li>
                            <li>
                                <input type="text" name="p_producer"placeholder="제작자">
                            </li>
                            <li>
                                <textarea name="p_text" id="" cols="30" rows="10" placeholder="설명"></textarea>
                            </li>
                            <li>
                                <input type="file" name="p_img"placeholder="albumimg">
                                <img src="rex.jpg" alt="앨범이미지">   
                            </li>
                            <li><input type="button" value="등록" onclick="nullCheck(this.form)"></li>
                        </ul>
                        <input type="hidden" name="p_num">
                    </form>
                </div>
        </main><!-- main -->
    </div><!-- contentWrap -->
</div>
</body>
<script src="${pageContext.request.contextPath}/javascript/albumInsert.js" charset="utf-8"></script>

</html>