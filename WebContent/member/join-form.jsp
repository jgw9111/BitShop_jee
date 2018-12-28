<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원관리</h1>
	<p>회원 가입</p>
	<form action="join-result.jsp">
		id 입력 <input type="text" name="id" /> <br /> 
		이름 입력<input type="text"	name="name" /> <br /> 
		주민번호 입력<input type="text" name="ssn" /> <br />
		비밀번호 입력<input type="text" name="pass" /> <br /> 
		키 <input type ="" name = "height"> <br />
		몸무게 <input type ="" name = "weight"> <br />
		<input type="submit" id="btn" value="join" />
	</form>
</body>
</html>