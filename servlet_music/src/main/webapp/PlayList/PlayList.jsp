<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head><link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/nav.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/playlist.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
  crossorigin="anonymous"></script>
<meta charset="utf-8">
<title>PlayList</title>
<script type="text/javascript">
function order(s){
	s.submit();
}
</script>
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
         	<ul class="topBanner">
         		<li>
         			<h4 class="bold">MY PLAYLIST</h4>
         		</li>
         	</ul>
         	<section class="playIcon">
         		<ul>
         			<li><button type="button" onclick="order(this.form)"><span class="material-symbols-outlined">play_circle</span></button></li>
         			<li>
         				<a href="#"><span class="material-symbols-outlined">more_horiz</span></a>
         				<ul class="submenu hide">
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
                         <c:forEach var="p" items="${products}">
                        <tr>
                            <td>${p.p_num}</td>
                            <td>
                            	<img src="${p.p_img}" alt="albumimg">
                                <span class="title">${p.p_title}</span>
                            </td>
                            <td>${p.p_producer}</td>
                            <td>${p.p_date}</td>
                         </tr>
                      </c:forEach>
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