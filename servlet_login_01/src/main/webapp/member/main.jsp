<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
  crossorigin="anonymous"></script>
<meta charset="EUC-KR">
<title>main</title>
</head>
<body>

<div class="Wrap">
    <nav><!-- nav -->
        <h1>iconimg</h1>
        <ul class="list">
            <li class="active"><a href="#"><span class="material-symbols-outlined">home</span>home</a></li>
            <li><a href="#"><span class="material-symbols-outlined">search</span>검색하기</a></li>
            <li><a href="#"><span class="material-symbols-outlined">library_books</span>라이브러리</a></li>
            <li><a href="${pageContext.request.contextPath}/member/mymusic.jsp"><span class="material-symbols-outlined"><span class="material-symbols-outlined">library_add</span></span>내 음악</a></li>
        </ul>
    </nav><!-- nav -->
    <div class="contentWrap"><!-- contentWrap -->
        <header><!-- header -->
            <div class="profile">
                <h4 >
                    <span class="material-symbols-outlined">account_circle</span>
					${m.name}
					<span class="material-symbols-outlined arrow_drop">arrow_drop_down</span>
                </h4>
                <ul class="profileList hide">
                    <li><a href="${pageContext.request.contextPath}/SearchController">계정<span class="material-symbols-outlined">login</span></a></li>
                    <li><a href="${pageContext.request.contextPath}/LogoutController">로그아웃</a></li>
                    <li><a href="#">프로필</a></li>
                </ul>
            </div>
        </header><!-- header -->
        
        <main><!-- main -->
            <div class="artistList">
                <h3>${m.name}님을 위한 뮤지션</h3>
                <div class="arrow">
                    <span class="material-symbols-outlined leftBTN">chevron_left</span>
                    <span class="material-symbols-outlined rightBTN">chevron_right</span>
                </div>
                <div class="listWrap">
                    <ul class="Acontent">
                        <li>
                            <img src="rex.jpg" alt="artistimg">
                            <p>악동뮤지션</p>    
                        </li>
                        <li>
                            <img src="ariana.jpg" alt="artistimg">
                            <p>ff</p>    
                        </li>
                        <li>
                            <img src="rex.jpg" alt="artistimg">
                            <p>rr</p>    
                        </li>
                        <li>
                            <img src="ariana.jpg" alt="artistimg">
                            <p>아델</p>    
                        </li>
             
                        <li>
                            <img src="rex.jpg" alt="artistimg">
                            <p>아e델</p>    
                        </li>
                        <li>
                            <img src="ariana.jpg" alt="artistimg">
                            <p>dd</p>    
                        </li>
                        <li>
                            <img src="Avril Lavigne.jpg" alt="artistimg">
                            <p>ss</p>    
                        </li>
                        <li>
                            <img src="Avril Lavigne.jpg" alt="artistimg">
                            <p>aa</p>    
                        </li>
                    </ul>
                </div>
            </div>         
            <div class="musicList">
                <h3>playList</h3>
                <div class="arrow">
                    <span class="material-symbols-outlined">chevron_left</span>
                    <span class="material-symbols-outlined">chevron_right</span>
                </div>
                <div class="listWrap">
                    <ul class="Mcontent">
                        <li>
                            <img src="rex.jpg" alt="albumimg">
                            <div>
                                <p>시간의 지평선</p>
                                <p>윤하</p>
                                <p>3:59</p>
                            </div>
                            
                        </li>
                    </ul>
                </div>
            </div>
        </main><!-- main -->
        </div><!-- contentWrap -->
</div>
</body>
<script src="${pageContext.request.contextPath}/javascript/main.js" charset="utf-8"></script>

</html>