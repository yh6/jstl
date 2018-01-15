<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	 클래스리스트<br>	
	
	<table border="1">
		<tr>
			<th>반이름</th>
			<th>반정보</th>
		</tr>
		<c:forEach items="${classList}" var="ci">
		<tr>
		<td>${ci.ciName}</td>
		<td>${ci.ciDesc}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>