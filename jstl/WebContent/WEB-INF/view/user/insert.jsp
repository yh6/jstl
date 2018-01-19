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
	<form>
		<table>
			<tr>
				<h1>insertUser</h1>
				
				<th>이름</th>
				<td><input type="text" id="uiName" name="uiName" align="right" autofocus></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="text" id="uiAge" name="uiAge" align="right"></td>
			</tr>
			<tr>
				<th>아이디</th>
				<td><input type="text" id="uiId" name="uiId" align="right"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" id="uiPwd" name="uiPwd" align="right"></td>
			</tr>

			<tr>
				<th>주소</th>
				<td><input type="text" id="address" name="address" align="right"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" id="singnBtn" value="완 료"></td>
			</tr>
		</table>
	</form>
</body>
</html>