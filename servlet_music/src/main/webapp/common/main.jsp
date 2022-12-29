<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/nav.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
  crossorigin="anonymous"></script>
<meta charset="utf-8">
<title>main</title>
</head>
<!-- 로그인이 아닐 경우 넣기  -->
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
            <div class="artistList">
            	<div class="List_title" >
	            	 <h3>${m.name}님을 위한 Artist</h3>
	                <div class="arrow">
	                    <span class="material-symbols-outlined leftBTN">chevron_left</span>
	                    <span class="material-symbols-outlined rightBTN">chevron_right</span>
	                </div>
               </div>
                <div class="listWrap">
                    <ul class="Acontent">
                        <li>
                            <img src="" alt="artistimg">
                            <p>악동뮤지션</p>    
                        </li>
                        <li>
                            <img src="" alt="artistimg">
                            <p>ff</p>    
                        </li>
                        <li>
                            <img src="" alt="artistimg">
                            <p>rr</p>    
                        </li>          
                    </ul>
                </div>
            </div>         
            <div class="musicList">
            	<div class="List_title">
	                <h3>playList<span><a href="${pageContext.request.contextPath}/ProductListAllController">더보기</a></span></h3>
	                <div class="arrow">
	                    <span class="material-symbols-outlined leftBTN" >chevron_left</span>
	                    <span class="material-symbols-outlined rightBTN">chevron_right</span>
	                </div>
                </div>
                <div class="listWrap">
                    <ul class="Mcontent">
						<c:forEach var="p" items="${products}">
							<li>
								<a href="${pageContext.request.contextPath}/ProductSearchController?p_title=${p.p_title}">
									<img src="${p.p_img}"alt="albumimg">
									<span>${p.p_title}</span>
									<span><small>만든사람: ${p.p_producer}</small></span>
								</a>  
							</li>
						</c:forEach>
		            </ul>
                </div>
            </div>
        </main><!-- main -->
        </div><!-- contentWrap -->
</div>
</body>
<script src="${pageContext.request.contextPath}/javascript/main.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/javascript/header.js" charset="utf-8"></script>

</html>