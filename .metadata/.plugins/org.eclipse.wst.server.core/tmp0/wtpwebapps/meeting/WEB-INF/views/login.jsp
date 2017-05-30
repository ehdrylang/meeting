<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="container-wrapper">
<div class="container">
<h2>Login with Username and Password</h2>
<form action="<c:url value="/login"/>" method="post">
  <div class="form-group">
    <label for="username">Username:</label>
    <input type="text" class="form-control" name="username" id="username">
  </div>
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="password" class="form-control" name="password" id="password">
  </div>
  <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
  <input type="submit" value="확인" class="btn btn-default">
</form>
</div>
</div>