<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>공지사항 목록</title>
	<style>
		table {
			border: 1px solid black;
			border-collapse: collapse;
		}
		th, td {
			border: 1px solid black;
		}
		h1 {
			color: skyblue;
		}
		th {
			background-color: azure;
		}
	</style>
	</head>
	<body>
		<h1>공지사항 목록</h1>
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			<c:forEach items="${nList }" var="notice" var="status">
			<!-- var="status" -> count 번호 순서대로 출력 -->
				<tr>
					<td>${notice.count }</td>
					<td><a href="#">${notice.noticeSubject }</a></td>
					<td>${notice.noticeWriter }</td>
					<td>${notice.noticeDate }</td>
					<td>${notice.noticeCount }</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>