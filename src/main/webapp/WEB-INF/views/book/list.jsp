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
	<h1>BookList 나열하기</h1>
	<table style="border:5px solid pink">
		<tr>
			<th>#번호</th>
			<th>책 제목</th>
			<th>출판사</th>
			<th>가격</th>
		</tr>
		<c:forEach var="item" items="${list }">
			<tr class="odd gradeX">
				<td>${item.bookId }</td>
				<td><a href="get?bookId=${item.bookId}">${item.bookName }</a></td>
				<td>${item.publisher }</td>
				<td>${item.price }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>