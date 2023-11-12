<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<table>
	<tbody>
	<c:forEach var="item" items="사과,포도,청포도,수박">
		<tr>
			<td>과일:${item}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>
</body>
</html>
