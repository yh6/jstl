<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/common/common.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
메뉴리스트<br>


<table border="1">
	<tr>
		<th>번호</th>
		<th>Url</th>
		<th>이름</th>
		<th>정보</th>
	<tr>
<c:forEach items="${menuList}" var="Menu">
	<tr>
		<th>${Menu.mNum}</th>
		<th>${Menu.mUrl}</th>
		<th>${Menu.mName}</th>
		<th>${Menu.mDesc}</th>
	</tr>
</c:forEach>
</table>

</body>
</html>