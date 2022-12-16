<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<body>
  <header>
  		<h1><a href="${pageContext.request.contextPath}/ProductListAllController"><img src="${pageContext.request.contextPath}/img/logo_wh.png"></a></h1>
	    <div class="profile">
	    	<h4>
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
  </header>
</body>
</html>