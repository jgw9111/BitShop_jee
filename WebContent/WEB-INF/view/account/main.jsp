<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BIT SHOP+계좌관리 페이지+</title>
<link rel="stylesheet" href="<%=application.getContextPath() %>/resources/css/style.css "/>
</head>
<body>
<table id="wrapper">
	<tr>
		<%@ include file="../home/header.jsp" %>
	</tr>
	<tr>
		<td colspan="2">
			<%@ include file="../home/navi-bar.jsp" %>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td style="width: 30%">
			<%@ include file="side-menu.jsp" %>
		</td>
		<td>
			<div>
				<form action="account.do">
					<h1>계좌 개설</h1>
					입금액 : <input type="text" name="money" />
					<input type="submit" id="btn" value="확 인" />
					<input type="hidden" name="cmd" value="open-account" />
					<input type="hidden" name="page" value="open-result" />
				</form>
			</div>
		</td>
	</tr>
	<tr>
		<td colspan="2">
		<%@ include file="../home/footer.jsp" %>
		</td>
	</tr>
</table>
</body>
</html>