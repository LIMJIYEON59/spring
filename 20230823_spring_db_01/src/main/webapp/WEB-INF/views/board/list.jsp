<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board list</title>
</head>
<body>
<script>
	var msg = '${msg}';
	if(msg){
		alert(msg);
	}
	var msg = '${msg2}';
	if(msg){
		alert(msg);
	}
</script>
<h2>Board List</h2>
<a href="/board/get/${bno }"></a>	<!-- 컨트롤러에서 경로 정하고 여기 jsp에서도 수정하면 -->
[[
${boardList}
]]
</body>
</html>