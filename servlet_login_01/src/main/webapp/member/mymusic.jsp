<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/mymusic.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
  crossorigin="anonymous"></script>
<meta charset="EUC-KR">
<title>myMusic</title>
</head>
<body>

<div class="Wrap">
    <nav><!-- nav -->
        <h1>iconimg</h1>
        <ul class="list">
            <li><a href="${pageContext.request.contextPath}/member/main.jsp"><span class="material-symbols-outlined">home</span>home</a></li>
            <li><a href="#"><span class="material-symbols-outlined">search</span>검색하기</a></li>
            <li><a href="#"><span class="material-symbols-outlined">library_books</span>라이브러리</a></li>
            <li class="active"><a href="#"><span class="material-symbols-outlined"><span class="material-symbols-outlined">
library_add
</span></span>내 음악</a></li>
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
                      <!-- <div class="headImg">
                <h3>등록</h3>
                <div><img src="" alt="">앨범이미지</div>
                <div>앨범 설명</div>
            </div> -->
            <!-- 데이터가 없을때 -->
                <h2>
                    <span class="material-symbols-outlined">album</span>
	                </br> </br>
                    첫 앨범을 등록해보세요
                </h2>
                <a class="albumPlus" href="${pageContext.request.contextPath}/member/mymusicEdit.jsp">앨범 등록</a>                    
            <div class="musicList">
                <h3>playList</h3>
                <div class="arrow">
                    <span class="material-symbols-outlined">add_circle</span>
                </div>
              <!-- 데이터가 있을때 -->
                <div class="listWrap">
                    <ul class="Mcontent">
                        <li>
                            <img src="rex.jpg" alt="albumimg">
                            <p>시간의 지평선</p>
                            <p>만든사람:</p>                
                        </li>
                        <li>
                            <img src="rex.jpg" alt="albumimg">
                            <p>시간의 지평선</p>
                            <p>만든사람: </p>
                        </li>
                        <li>
                            <img src="rex.jpg" alt="albumimg">
                            <p>시간의 지평선</p>
                            <p>만든사람:</p>                     
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