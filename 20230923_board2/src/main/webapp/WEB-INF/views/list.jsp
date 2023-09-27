<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<div>
	<section id="container">
				<form role="form" method="post" action=${pageContext.request.contextPath}/list>
					<table border="1">
						<thead>
							<tr>
								<th>번호</th>
								<th>제목</th>
								<th>내용</th>
								<th>작성자</th>
								<th>날짜</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${list }" var="list">
								<tr>
									<td><c:out value="${list.bno }"/></td>
									<td>
										<%-- <a href="/read?bno=${list.bno}"><c:out value="${list.title }"/></a> --%>
										<a href="${pageContext.request.contextPath }/read?=${list.bno}"><c:out value="${list.title }"/></a>
									</td>
									<td><c:out value="${list.content }"/></td>
									<td><c:out value="${list.writer }"/></td>
									<%-- <td><fmt:formatDate value="${list.regdate }" pattern="yyy-MM-dd"/></td> --%>
									<td>${fn:split(list.regdate, " ")[0]}</td>
								</tr>
							</c:forEach>
						</tbody>			
					</table>
				</form>
			</section>
			<a href="board">게시글 작성</a>
		</div>
</body>
</html>