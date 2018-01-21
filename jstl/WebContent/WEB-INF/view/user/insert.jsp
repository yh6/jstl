<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/view/common/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>insert</title>
</head>
<body>
	<form onsubmit="<%=root%>/view/user/list">
		<table border="1">
		<tr>
				<h1>inser tUser</h1><br>
				
			<th>이름</th>
			<th> 나이</th>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>주소</th>
	
		</tr>
		<c:forEach items="${userList}" var="ui">
			<tr>
				<td><input type="text" style="text-align:right;" autofocus>${ui.uiName}</td>
				<td><input type="text" style="text-align:right;">${ui.uiAge}</td>
				<td><input type="text">${ui.uiId}</td>
				<td><input type="text">${ui.uiPwd}</td>
				<td><input type="text">${ui.address}</td>
				<input type="submit" id="singnBtn" value="완 료">
				
			</tr>
		</c:forEach>
	</table>
			
				
				
		
	</form>
</body>
</html>