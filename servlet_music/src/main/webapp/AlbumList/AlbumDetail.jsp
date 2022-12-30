<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/nav.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/albumDetail.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
  crossorigin="anonymous"></script>
<meta charset="utf-8">
<title>AlbumDetail</title>
</head>
<!-- 로그인이 아닐 경우 넣기  -->
<body style="background:url('${p.p_img}') no-repeat 0 center;background-size: 106%;">

<div class="Wrap">
    <!-- nav -->
    <%@ include file="/common/nav.jsp" %>
   	<!-- nav -->
    <!-- header -->
    <%@ include file="/common/header.jsp" %>
    <!-- header -->
    <div class="contentWrap"><!-- contentWrap -->

         <main><!-- main -->
         	<ul class="topBanner">
         		<li><img src="${p.p_img}"alt="앨범이미지"></img></li>
         		<li>
         			<p>${p.p_date}</p>
         			<h4>${p.p_title}</h4>
         			<h5>Artist <span>${p.p_producer}</span></h5>
         		</li>
         	</ul>
         	<section class="playIcon">
         		<ul>
         			<li><a href="#"><span class="material-symbols-outlined">play_circle</span></a></li>
         			<li>
         				<a href="#"><span class="material-symbols-outlined">more_horiz</span></a>
         				<ul class="submenu">
         					<li><a href="#">신고하기</a></li>
         					<li><a href="#">공유하기</a></li>
         				</ul>
         			</li>
         		</ul>
         	</section>
         	 <div class="music" >
                <table>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>제목</th>
                            <th>앨범</th>
                            <th>발매일</th>
                            <th>시간icon</th>
                        </tr>
                    </thead>
                    <tbody>
                        <!-- 반복 -->
                        <tr>
                            <td>1</td>
                            <td>
                                <div class="titleImg">
                                    <img src="" alt="">
                                    <div>
                                        <p>제목...</p>
                                        <p>Artist name</p>
                                    </div>
                                </div>
                                
                            </td>
                            <td>앨범명</td>
                            <td>2021.01.19</td>
                            <td>3:20</td>
                         </tr>
                      
                        <!-- 반복 -->
                        <!-- 최대 50개 -->
                    </tbody>
                </table>
            </div>
        </main><!-- main -->
        </div><!-- contentWrap -->
</div>
</body>
<script src="${pageContext.request.contextPath}/javascript/header.js" charset="utf-8"></script>

</html>