<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="domain.*" %>
<div id="member-update">
<h1>회원정보 수정</h1>
<%
	MemberBean user = (MemberBean)session.getAttribute("user");
	System.out.print("user :: "+user);
%>
<table>
	<tr>
		<th>\</th>
		<th>내용</th>
	</tr>
	<tr>
		<td>ID</td>
		<td><%=user.getId() %></td>
	</tr>
	<tr>
		<td>PW</td>
		<td>
		현재 비밀번호<input type="text" name="currPass" />
		바꿀 비밀번호<input type="text" name="changePass" />
		</td>
	</tr>
	<tr>
		<td>이름</td>
		<td><%=user.getName() %></td>
	</tr>
	<tr>
		<td>주민번호</td>
		<td><%=user.getSsn() %></td>
	</tr>
</table>
</div>