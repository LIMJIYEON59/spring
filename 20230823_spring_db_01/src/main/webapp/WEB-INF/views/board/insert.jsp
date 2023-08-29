<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	
	<input type="submit" value="등록">
</form>
</body>
</html>