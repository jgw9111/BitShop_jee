<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String ssn = request.getParameter("ssn");
	String pass = request.getParameter("pass");

	double w = Double.parseDouble(request.getParameter("weight"));
	double h = Double.parseDouble(request.getParameter("height"));
	double bmi = w/(h*h*0.001);
	String bmiRes = "";
	if(bmi > 40){
		bmiRes = "과체중";
	}else if(bmi > 35){
		bmiRes = "중등도 비만";
	}else if(bmi >30 ){
		bmiRes = "경도 비만";
	}else if(bmi > 25 ){
		bmiRes = "과체중";
	}else if(bmi > 18.5 ){
		bmiRes = "정상";
	}else {
		bmiRes = "저체중";
	}
	
		
	String[] ssnArr = ssn.split("");
	String year = ssnArr[0]+ssnArr[1];
	String month = ssnArr[2]+ssnArr[3];
	String day = ssnArr[4]+ssnArr[5];
	String gender1= "";
	//char ch = ssn.charAt(7);
	//String ch = ssnArr[7];
	//System.out.print(ch);
	/* if(ssnArr[7]=="1" ||ssnArr[7]=="3"){
		gender1 = "남자";
	} * else if(ch =='2' || ch =='4'){
		gender1 = "여자";
	}else if(ch =='5' || ch =='6'){
		gender1 = "외국인";
	}else if(ch == '7' || ch == '8' || ch == '9' || ch =='0'){
		gender1 = "잘못 입력";
	} */
	
switch(ssnArr[7]){
	case "1": case"3":
		gender1 = "남자";
		break;
	case "2": case"4":
		gender1 = "여자";
		break;
	case "5": case "6":
		gender1 = "외국인";
		break;
	default:
		gender1 = "다시 입력하세요";
		break;
}

	  
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>가입한 id : <%=id %></h3> <br />
	<h3>이름 : <%=name %></h3>
	<h3>생년 월일: <%=year %>년 <%= month %> 월 <%= day %> 일생</h3> <br />
	<h3>가입한 비밀번호 : ******* </h3> <br />
	<h3>성별 : <%=gender1 %></h3> <br />
	<h3>BMI : <%= bmi %> : <%= bmiRes %></h3><br /> 
	<a href="login-form.jsp">로그인으로 이동</a>
	<a href="../index.jsp">홈으로 이동</a>
</html>