<%@page import="com.iot.test.vo.UserInfo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
	<input type="text" name="uiName"> <input type="submit" value="검색">
</form>
	유저리스트<br>	
	
	<table border="1">
		<tr>
			<th>이름</th>
			<th>나이</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>주소</th>
		
		</tr>
		<c:forEach items="${userList}" var="ui">
		<tr>
		<td>${ui.uiName}</td>
		<td>${ui.uiAge}</td>
		<td>${ui.uiId}</td>
		<td>${ui.uiPwd}</td>
		<td>${ui.address}</td>

		</tr>
		</c:forEach>
	</table>

</body>
</html>