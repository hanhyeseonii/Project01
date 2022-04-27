<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입</h2>
	<form action="20220325_10_result.jsp" method="post">
	아이디<input type="text" name="userid"><br>
	비밀번호<input type="password" name="passwd"><br>
	이메일<input type="email" name="email"><br>
	이름<input type="text" name="name"><br>
	성별<br>
		<input type="radio" name="gender" value="women">여자<br>
		<input type="radio" name="gender" value="man">남자<br>
	가입경로 <select name="route">
		<option>사이트검색</option>
		<option>지인추천</option>
		<option>광고</option>
	</select><br>
	
	알바가능시간대 <br>
	<input type="checkbox" name="time" value="새벽">새벽<br>
	<input type="checkbox" name="time" value=오전>오전<br>
	<input type="checkbox" name="time" value="오후">오후<br>
	<input type="checkbox" name="time" value="저녁">저녁<br>
	<button>가입</button>
	</form>
</body>
</html>