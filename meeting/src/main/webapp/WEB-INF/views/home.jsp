<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
	<script>
		var result = '${msg}';
		if(result == 'success')
			alert('회원가입 성공!');
	</script>
</head>
<body>
<h1>
	Hello world!  
</h1>
<span>${a.username}</span>
<span>${a.password }</span>
<span>${a.kakaoid}</span>
<span>${a.displayname }</span>
<h2>${result}</h2>
<p>${pageContext.request.userPrincipal.name}</p>
<div>
	<label>${onUser}</label>
</div>
<c:if test="${pageContext.request.userPrincipal.name != null }">
	<li>Welcome: ${pageContext.request.userPrincipal.name}</li>
	<c:if test="${pageContext.request.userPrincipal.name == 'admin'}">	
		<li><a href=" <c:url value="/admin/"/> ">ADMIN PAGE</a></li>
	</c:if>
	<li><a href="<c:url value="/user/mypage/"/>">MyPage</a></li>
	<li><a href="<c:url value="/logout/"/> ">logout</a></li>
</c:if>
<c:if test="${pageContext.request.userPrincipal.name == null }">
	<li><a href="<c:url value="/login/"/>">로그인</a></li>
	<li><a href="<c:url value="/user/signup/"/>">회원가입</a></li>
</c:if>
</body>
</html>
