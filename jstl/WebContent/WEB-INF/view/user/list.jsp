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
유저리스트<br>
<form action="<%=root%>/WEB-INF/view/user/list.jsp" method="post">
<table border="1">
<tr>
<th>번호</th>
<th>이름</th>
<th>나이</th>
<th>아이디</th>
<th>비밀번호</th>
<th>주소</th>
</tr>


<c:forEach items="${userList}" var="user">
	번호 : ${user.uiNo}, 이름 : ${user.uiName}, 나이 : ${user.uiAge}, 아이디 : ${user.uiId}, 비밀번호 : ${user.Pwd}, 주소 : ${user.adderss}<br>
</c:forEach>
</body>
</html>