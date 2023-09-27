<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판</title>
</head>
<body>
	<div>
	<section id="container">
				<form role="form" method="post" action=${pageContext.request.contextPath}/insertboard2>
					<table>
						<tbody>
							<tr>
								<td>
									<label for="bno">번호</label><input type="text" id="bno" name="bno"/>
								</td>
							</tr>
							<tr>
								<td>
									<label for="tltie">제목</label><input type="text" id="title" name="title"/>
								</td>
							</tr>
							<tr>
								<td>
									<label for="content">내용</label><input type="text" id="content" name="content"/>
								</td>
							</tr>
							<tr>
								<td>
									<label for="writer">작성자</label><input type="text" id="writer" name="writer"/>
								</td>
							</tr>
							<tr>
								<td>
									<button type="submit">작성</button>
								</td>
							</tr>
						</tbody>			
					</table>
				</form>
			</section>
			<a href="list">게시글목록</a>
		</div>
</body>
</html>