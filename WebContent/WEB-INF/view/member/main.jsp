<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../home/head.jsp" %>
<body>
	<table id="wrapper">
		<tr>
			<%@ include file = "../home/header.jsp" %>
		</tr>
		<tr>
			<td colspan="2">
				<%@ include file="../home/navi-bar.jsp" %>
			</td>
		</tr>
		<tr style="height: 300px;">
			<td id="side-menu">
			<%
			String dest = request.getAttribute("dest")+"";
			if(dest.equals("join-form")){
				%>
				<%@ include file="side-join.jsp" %>
				<%
			}else{
				%>
				<%@ include file="side-menu.jsp" %>
				<%
			}
			%>
			</td>
			<td>
			<%
			dest = request.getAttribute("dest")+"";
			System.out.println("member메인 dest ::" + dest);
			switch(dest){
			case "NONE" : case "myPage":
				break;
			case "join-form": 
				%>
				<%@ include file="join-form.jsp" %>
				<%
				break;	
			case "member-detail": 
				%> 
					<%@ include file="memberdetail.jsp" %>
				<% 
				break;
			case "member-update":
				%>
					<%@ include file="memberupdate.jsp" %>
				<%
				break;
			
			}
				%>
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