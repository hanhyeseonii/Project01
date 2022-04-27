<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name=request.getParameter("name");
		String major=request.getParameter("major");
		System.out.println(name);
		System.out.println(major);
		String prefix =major.substring(0, 1);
		System.out.println(prefix);
		//msg : 계열 메세지
		String msg;
		if (prefix.equals("A"))
			msg="공학계열";
		else if (prefix.equals("B"))
			msg="자연과학계열";
		else
			msg="타계열";	
		
		System.out.println(msg);
		//redirect로 이동
		//자바의인코딩과 url의 인코딩이 다르다
		name=URLEncoder.encode(name, "UTF-8");
		msg=URLEncoder.encode(msg, "UTF-8");
		response.sendRedirect("20220328_15_result.jsp?name="+name+"&msg="+msg);
	%>
	
</body>
</html>