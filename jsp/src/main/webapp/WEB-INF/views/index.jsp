<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<h1>Index</h1>
	<h2>인덱스 입니다.</h2>
	
	<c:forEach begin="1" end="10" step="2" var="i">
		<h3>${i }</h3>
	</c:forEach>
	
	서버에서 오는 값 : ${test }<br>
	보드의 총 글수 : ${totalSize }
	
	<a href="/board">board로 이동하기</a>
</body>
</html>