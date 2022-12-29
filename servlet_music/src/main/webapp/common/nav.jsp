<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<body>
    <nav>
        <ul class="navList">
            <li><a href="${pageContext.request.contextPath}/mainProductListAllController"><span class="material-symbols-outlined">home</span>home</a></li>
            <li><a href="${pageContext.request.contextPath}/common/search.jsp"><span class="material-symbols-outlined">search</span>검색하기</a></li>
            <li><a href="#"><span class="material-symbols-outlined">library_books</span>라이브러리</a></li>
          	
          	     <li class=""><a href="${pageContext.request.contextPath}/ProductListController"><span class="material-symbols-outlined"><span class="material-symbols-outlined">library_add</span></span>내 음악</a></li>
          	<!-- <c:if test="${not status.first}"></c:if> -->
        </ul>
    </nav>
</body>
</html>