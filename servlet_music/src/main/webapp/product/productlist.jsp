<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/header.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/nav.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/product.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="https://code.jquery.com/jquery-3.6.1.js" integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
  crossorigin="anonymous"></script>
<meta charset="utf-8">
<title>myMusic</title>
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
        <div class="musicList">
        <c:if test="${empty products}">
                <h2>
                    <span class="material-symbols-outlined">album</span>
	                </br> </br>
                    첫 앨범을 등록해보세요
                </h2>
                <a class="albumPlus" href="${pageContext.request.contextPath}/product/productInsert.jsp">앨범 등록</a>                    
		</c:if>
		<c:if test="${not empty products}">	
        <!-- 데이터가 있을때 -->
        <div class="playList">
        <h6>My Music</h6>
		<a href="${pageContext.request.contextPath}/product/productInsert.jsp">                    
        	<span class="material-symbols-outlined">add_circle</span>
        </a>
       </div>
       <div class="listWrap">
			<ul class="content">
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
        </c:if>
       </div>
      </main><!-- main -->
    </div><!-- contentWrap -->
</div>
</body>
<script src="${pageContext.request.contextPath}/javascript/main.js" charset="utf-8"></script>

</html>