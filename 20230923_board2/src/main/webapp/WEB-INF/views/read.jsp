 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!-- JQuery -->
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<html>
	<head>
	 	<title>게시판</title>
	</head>
	<script>
		$(document).ready(function() {
			var formObj = $("form[name='readForm']");
			
			//수정
			$(".update_btn").on("click", function(){
				formObj.attr("action","/board2/update");
				formObj.submit();
			});
			
			//삭제
			$(".delete_btn").on("click", function(){
				formObj.attr("action", "/board2/delete");
				formObj.submit();
			});
			
			//취소
			$(".list_btn").on("click", function() {
				location.href = "/board2/list";
			});
			
		});
	</script>
	<body>
	
		<div id="root">
			<header>
				<h1> 게시판</h1>
			</header>
			<hr />
			 
			<nav>
			  홈 - 글 작성
			</nav>
			<hr />
			
			<section id="container">
				<form role="form" method="post">
					<table>
						<tbody>
							<tr>
								<td>
									<label for="bno"></label><input type="hidden" id="bno" name="bno" value="${read.bno}"/>
								</td>
							</tr>	
							<tr>
								<td>
									<label for="title">제목</label><input type="text" id="title" name="title" value="${read.title}"/>
								</td>
							</tr>	
							<tr>
								<td>
									<label for="content">내용</label><textarea id="content" name="content"><c:out value="${read.content}" /></textarea>
								</td>
							</tr>
							<tr>
								<td>
									<label for="writer">작성자</label><input type="text" id="writer" name="writer" value="${read.writer}" />
								</td>
							</tr>
							<tr>
								<td>
									<label for="regdate">작성날짜</label>
									<fmt:formatDate value="${read.regdate}" pattern="yyyy-MM-dd"/>					
								</td>
							</tr>		
						</tbody>			
					</table>
					<div>
						<button type="submit" class="update_btn">수정</button>
						<a class="delete_btn">삭제</a>
						<button type="submit" class="list_btn">목록</button>
					</div>
					
				</form>
			</section>
			<hr />
		</div>
	</body>
</html>