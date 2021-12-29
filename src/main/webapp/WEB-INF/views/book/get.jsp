<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>책 제목 상세 내역</h1>
	<table style="border: 5px solid pink">
		<tr>
			<th>#번호</th>
			<th>책 제목</th>
			<th>출판사</th>
			<th>가격</th>
		</tr>
		<tr>
			<td><c:out value="${book.bookId }"/></td>
			<td><c:out value="${book.bookName }"/></td>
			<td><c:out value="${book.publisher }"/></td>
			<td><c:out value="${book.price }"/></td>
		</tr>
	</table>
</body>
</html>