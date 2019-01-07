<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="head.jsp" %>
<body>
<table id="wrapper">
	<tr>
		<%@ include file="header.jsp" %>
	</tr>
	<tr>
		<td colspan="2">
		<%@ include file="navi-bar.jsp" %>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td style = "width:30%">
			<%@ include file="side-menu.jsp" %>
		</td>
		<td > 
			<div id="content">
				<% String compo = String.valueOf(request.getAttribute("compo"));
				if(compo==null){System.out.println("compo가 null");}
				else{System.out.println("=아아=");}
				switch(compo){
				case"login-success":
					%>
					<%@ include file ="login-success.jsp"  %>
					<%
				break;
				}
				
				%>
			</div> 
		</td>
	</tr>
	<tr>
		<td colspan="2"> 
		<%@ include file="footer.jsp" %>
		</td>
	</tr>
</table>
</body>
</html>