<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@	taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board</title>
</head>
<body>
<div class="container">
<div class="text-center mt-5">
	<h1>Board</h1>
<%-- 	${list } --%>
	<table class="table table-hover table-dark">
		<tr>
			<td>번호</td>
			<td>제목</td>
			<td>날짜</td>
			<td>글쓴이</td>
			<td>좋아요</td>
			<td>조회수</td>
		</tr>
		<c:forEach items="${list }" var="row">
			<tr>
				<td>${row.b_no }</td>
				<td>${row.b_title }</td>
				<td>${row.b_date }</td>
				<td>${row.member_name }</td>
				<td>${row.b_like }</td>
				<td>${row.b_read }</td>
			</tr>
		</c:forEach>
	</table>
</div>
</div>
</body>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">

</html>