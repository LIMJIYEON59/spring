<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex01</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<body>
	<button  onclick="ex01Fn()">ex01 함수 호출</button>
	
	<script>
		const ex01Fn = () => {
			$.ajax({
				//요청방식: get
				//요청주소: /ex01
				type: "get",
				url: "/ex01",
				//요청이 성공했을 때 실행되는 부분
				success: function() {
					console.log("성공");
				},
				//요청이 실패했을 때 실행되는 부분
				error: function() {
					console.log("실패");
				}
			})
		}
	</script>
</body>
</html>