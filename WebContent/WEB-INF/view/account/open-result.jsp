<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BIT SHOP+계좌관리 페이지+</title>
<style>

</style>
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
                        <li><a href="member.do">회원관리</a></li>
                        <li ><a href="account.do" ><font color="yellow">계좌관리</font></a></li>
                        <li><a href="article.do">게시판</a>
                        <li><a href="admin.do">관리자</a>
                    </ul>
                </div>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td id="side-menu">
			<table>
				<tr>
					<td>계좌개설</td>
				</tr>
				<tr>
					<td>계좌목록</td>
				</tr>
				<tr>
					<td>계좌검색(이름)</td>
				</tr>
				<tr>
					<td>계좌검색(계좌번호)</td>
				</tr>
				<tr>
					<td>총계좌수</td>
				</tr>
				<tr>
					<td>계좌번호체크</td>
				</tr>
				<tr>
					<td>입금</td>
				</tr>
				<tr>
					<td>출금</td>
				</tr>
				<tr>
					<td>계좌삭제</td>
				</tr>
			</table>
		</td>
		<td>
			<div>
				<h2>성공적으로 개설 되었습니다.</h2>
				<h3>계좌번호 : </h3>
				<h3>잔 액 : </h3>
			</div>
		</td>
	</tr>
</table>
</body>
</html>