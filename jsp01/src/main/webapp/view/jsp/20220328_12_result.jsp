<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>원의넓이 구하기 결과창</h2>
	<%
		double area=(double)request.getAttribute("area");
	
	%>
	원의넓이 : <%=area %>
</body>
</html>