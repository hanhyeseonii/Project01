<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>데이터 전송(post)</h2>
	<form action="" method="post">
	<!-- method="get"은 생략가능
	post : request객체에 담아서 전송(url에 담기지 않는다.) -->
		아이디 <input type="text" name="id"><br>
		비밀번호 <input type="password" name="passwd"><br>
		<button>로그인</button>
	</form>
	<%
		String id=request.getParameter("id");
		String passwd=request.getParameter("passwd");
		if (id!=null){
	%>
	<fieldset>
		<legend>로그인정보</legend>
		아이디 : <%=id%>
		비밀번호 : <%=passwd%>
	</fieldset>
	<%}%>
</body>
</html>