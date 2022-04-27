<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입 정보</h2>
	<%
	//post방식일 경우 인코딩 UTF-8
	request.setCharacterEncoding("UTF-8");
	String userid = request.getParameter("userid");
	String passwd = request.getParameter("passwd");
	String eamail = request.getParameter("eamail");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String route = request.getParameter("route");
	String[] times = request.getParameterValues("time");
	
	
	%>
	아이디 : <%=userid %><br>
	비밀번호 : <%=passwd %><br>
	이메일 : <%=eamail %><br>
	이름  :<%=name %><br>
	성별 : <%=gender %><br>
	가입경로 : <%=route %><br>
	알바가능시간대 :
	<%
		for(String time:times){
	%>	
			<%=time %>
	<%
		}
	
	%>
</body>
</html>