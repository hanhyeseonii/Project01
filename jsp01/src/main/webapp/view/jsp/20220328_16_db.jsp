<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>db에 저장</h2>
	<form action="20220328_16_insert.jsp" method="post">
		id  <input type="text" name="userid"><br>
		passwd  <input type="password" name="passwd"><br>
		name  <input type="text" name="name"><br>
		email  <input type="email" name="email"><br>
		<button>가입</button>
	</form>
	메세지 : <%=request.getParameter("msg") %>
</body>
</html>