<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
				<c:when test="${bno != null }">
					<table>
						<tbody>
							<tr>
								<td>
									${bno.bno}
								</td>
							</tr>
							<tr>
								<td>
									${bno.title}
								</td>
							</tr>
							<tr>
								<td>
									${bno.content}
								</td>
							</tr>
							<tr>
								<td>
									${bno.writer}
								</td>
							</tr>
							<tr>
								<td>
									<label for="regdate">작성날짜</label>
									<fmt:formatDate value="${bno.regdate }" pattern="yyy-MM-dd"/>
								</td>
							</tr>
						</tbody>			
					</table>
			</c:when>
			</section>
			<a href="list">게시글목록</a>
			<a href="board">게시글 작성</a>
		</div>
</body>
</html>