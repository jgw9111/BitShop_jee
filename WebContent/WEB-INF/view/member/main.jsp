<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BIT SHOP+회원관리+</title>
<link rel="stylesheet" href="<%=application.getContextPath() %>/resources/css/style.css "/>
</head>
<body>
	<table id="wrapper">
		<tr>
			<td colspan="2">
				<h1 style="text-align: center">BIT SHOP</h1>
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<div class="menubar">
					<ul>
						<li><a href="home.do">홈</a></li>
						<li><a href="member.do"><font color="yellow">회원관리</font></a></li>
						<li><a href="account.do">계좌관리</a></li>
						<li><a href="article.do">게시판</a></li>
						<li><a href="admin.do">관리자</a></li>
					</ul>
				</div>
			</td>
		</tr>
		<tr style="height: 300px;">
			<td id="side-menu">
				<table>
					<tr>
						<td>안녕하세요</td>
					</tr>
					<tr>
						<td>여기는</td>
					</tr>
					<tr>
						<td>회원관리페이지입니다~</td>
					</tr>
				</table>

			</td>
			<td></td>
		</tr>
	</table>
</body>
</html>