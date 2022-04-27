<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>리다이렉트</h2>
	<%
	String userid="java";
	int birthyear = 2006;
	//주소가 이동됨
	//주소도 바뀌고 화면도 바뀐다
	//대량의 데이터 전송 안됨
	response.sendRedirect("20220328_14_result.jsp?userid="+userid+"&birthyear="+birthyear);
	//문자 + 숫자열 = 문자
	
	%>
</body>
</html>