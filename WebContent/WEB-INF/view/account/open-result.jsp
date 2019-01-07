<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="domain.*"  %>
<div id="open-result">
	<%
	AccountBean acc = (AccountBean)request.getAttribute("acc");
	String accNum = acc.getAccountNum();
	int money = acc.getMoney();
	String today = acc.getToday();
	%>
	계좌 번호 :<%=accNum %> <br />
	잔 액 : <%= money %> <br />
	계좌 생성일 : <%= today %> <br />
</div>