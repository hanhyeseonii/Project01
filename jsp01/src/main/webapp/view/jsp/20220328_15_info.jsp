<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>학생의 정보</h2>
	<form action="20220328_15_info_get.jsp">
	이름  <input type="text" name="name">
	전공  <select name="major">
	<option value="A001">프로그래밍학과</option>
	<option value="A002">소프트웨어공학과</option>
	<option value="A003">컴퓨터공학과</option>
	<option value="B001">인공지능학과</option>
	</select>
	<button>정보출력</button>
	</form>
</body>
</html>