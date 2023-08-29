<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글등록</title>
</head>
<body>
<script>
	var msg = '${msg}';
	if(msg){
		alter(msg);
	}
</script>
<form action="${pageContext.request.contextPath }/board/insert" method="post" enctype="multipart/form-data">
	제목:<input type="text" name="btitle"><br>
	내용:<input type="text" name="bcontent"><br>
	
	<!-- type="file"의 name명은 VO/DTO의 field명과 다르게 지어야 함 -->
	<input type="file" name="updoadFile1">
	<input type="file" name="updoadFile2">
	<input type="file" name="updoadFile">
	<input type="file" name="updoadFile">
	<input type="file" name="updoadFile">
	<input type="checkbox" name="hobby" value="a">a<br>
	<input type="checkbox" name="hobby" value="b">b<br>
	<input type="checkbox" name="hobby" value="c">c<br>
	<input type="submit" value="등록">
	<input type="hidden" name="${_csrf.parameterName }" value="${_csrf.token }">
</form>
</body>
</html>