<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String ssn = request.getParameter("ssn");
	String pass = request.getParameter("pass");
	String year = "";
	String month = "";
	String day = "";
	String gender=" ";
	String bmi = "";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>가입한 id : <%=id %></h3> <br />
	<<h3>이름 : <%=name %></h3>
	<h3>생년 월일: <%=year %>년 <%= month %> 월 <%= day %> 일 생</h3> <br />
	<h3>가입한 비밀번호 : ******* </h3> <br />
	<h3>성별 : <%=gender %></h3> <br />
	<h3>BMI : <%= bmi %></h3><br /> 
	<a href="">로그인으로 이동</a>
	<a href="">홈으로 이동</a>
</html>