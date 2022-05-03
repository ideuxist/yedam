<%@page import="co.dev.vo.MemberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberResult/memberSearch.jsp</title>
</head>
<body>
	<c:choose>
	<c:when test="${empty member }"><h3>조회하신 정보가 없습니다</h3>
	</c:when>
	
	<c:otherwise>
	<table border="1">
	<thead>
		<tr>
			<td>아이디</td><td>이름</td><td>이메일</td><td>비밀번호</td>
		</tr>
	<tbody>
		<tr>
			<td>${member.id}</td><td>${member.name}</td>
			<td>${member.email}</td><td>${member.passwd}</td>
		</tr>
	</tbody>
	</table>
	</c:otherwise>
	
	</c:choose>
	<jsp:include page="home.jsp"></jsp:include>
</body>
</html>