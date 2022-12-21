<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/nav.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/search.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
  crossorigin="anonymous"></script>
<meta charset="utf-8">
<title>AlbumList</title>
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
			<div class="search">
                <form action="">
                    <input type="text">
                    <button></button>
                </form>
            </div>
            <!--  -->
            <div class="genre">
                <ul>
                    <li class="m1"><a href="#">가요</a></li>
                    <li class="m2"><a href="#">pop</a></li>
                    <li class="m3"><a href="#">힙합</a></li>
                    <li class="m4"><a href="#">랩</a></li>
                    <li class="m5"><a href="#">재즈</a></li>
                </ul>
            </div>
            <div class="music">
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
<script src="${pageContext.request.contextPath}/javascript/search.js" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/javascript/header.js" charset="utf-8"></script>

</html>