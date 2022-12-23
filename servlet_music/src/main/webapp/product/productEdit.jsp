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
<title>musicEdit</title>
<script type="text/javascript">
function delForm(){
	const title = document.albumForm.p_title.value;
	//console.log("dddddddddd"+title);
	//header 계정
var flag= confirm("정말 삭제하시겠습니까?");

		if(flag){
			document.albumForm.action="${pageContext.request.contextPath}/ProductDelController?p_title="+title;
			document.albumForm.submit();
		} else{
			alert("삭제가 취소되었습니다.");
		}
 
};
</script>
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
                <h3>앨범수정</h3>
                <div class="enrollWrap">
                    <form method="post" name="albumForm"action="${pageContext.request.contextPath}/ProductEditController" enctype="multipart/form-data" >
                        <ul class="albumContent">
                            <li><input type="number" name="p_num" value="${p.p_num}" readonly></li>
                            <li><input type="text" name="p_title" value="${p.p_title}" readonly></li>
                            <li><input type="text" name="p_date" value="${p.p_date}" readonly></li>
                            <li>
                                <input type="text" name="p_producer"value="${p.p_producer}">
                            </li>
                            <li>
                                <textarea name="p_text" id="" cols="30" rows="10">${p.p_text}</textarea>
                            </li>
                            <li>
                                <input type="file" name="p_img">
                                <img src="${p.p_img}" alt="앨범이미지">   
                            </li>
                            <li><input type="reset" value="초기화" ></li>
                            <li><input type="submit" value="등록"></li>
                            <li><input type="button" value="삭제" onClick="delForm()"></li>
                        </ul>
                    </form>
                </div>
        </main><!-- main -->
    </div><!-- contentWrap -->
</div>
</body>
<script src="${pageContext.request.contextPath}/javascript/main.js" charset="utf-8"></script>
<!-- <script src="${pageContext.request.contextPath}/javascript/productdel.js" charset="utf-8"></script> -->

</html>