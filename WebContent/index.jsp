<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> 로 그 인 </h1>
	<div>
		<form action="member.do">
			I D <input type="text" name = "id" /> <br />
			P W <input type="text" name = "pass" /> <br />
			<input type="hidden" name ="action" value="login" />
			<input type="submit" id="btn" value = "login" />
		</form>
	</div>
</body>
</html>