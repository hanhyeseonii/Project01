<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>결과창</h2>
	<%
	int age =(int)request.getAttribute("age");
	String result =(String)request.getAttribute("result");
	
	%>
	당신은<%=age%>살, <%=result %>입니다.
</body>
</html>