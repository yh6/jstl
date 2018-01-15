<%@page import="java.util.Map"%>
<%@page import="java.util.LinkedHashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String root = request.getContextPath();
Map<String,String> menuMap = new LinkedHashMap<String,String>();

menuMap.put("UserList",root+"/view/user/list");
%>