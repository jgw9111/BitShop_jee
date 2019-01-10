<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="domain.MemberBean" %>
<%
	MemberBean user = (MemberBean) request.getAttribute("member");
	//String name = request.getAttribute("name").toString();
	
%> 
	<%=user.getName() %>님 환영합니다 <br />
	<a href="member.do?cmd=logout">LOGOUT</a>
<%
	
%>