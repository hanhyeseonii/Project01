<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>표현식</h2>
	<%
		int a=10, b=20;
		out.println("<div id='add'>합:"+(a+b)+"</div>");
	%>
	<hr>
	<!-- 변수, 값 -->
	<div id="add">
		합:<%=a+b%>
	</div>
	<hr>
	<!-- 나이가 20살 이상이면 성인, 아니면 미성년자 dom에 출력(표현식) -->
	<%-- <%
	int c=21;
	String s=null;
	if (c>=20){
		/* out.println(c+"살은 성인"); */
		s = c+"살은 성인";
	}else
		/* out.println(c+"살은 미성년자"); */
		s = c+"살은 성인";
	%>
	<%=s %> <!-- 표현식 --> --%>
	<hr>
	<!-- 표현식으로 -->
	<%-- <%
	Scanner sc=new Scanner(System.in);
	System.out.print("몇살?");
	int c=sc.nextInt();
	if (c>=20){
	%>
		<%=c%>살은 성인
	<%}else
		%>
		<%=c%>살은 미성년자
	<hr> --%>
	<%-- <h5>구구단출력(2단)</h5>
	<% 
		int dan=2;
		for(int i=1; i<10; i++){
	%>	
		<%=dan%>*<%=i%>=<%=dan*i%><br>
		
		
	<% }
	%> --%>	
	<!-- 2~9단 출력 -->
	<%
		for (int i=1; i<10; i++){
	%>		
			<div>♥<%=i%>단♥</div>
		<%	for (int j=1; j<10; j++){
	%>	
		<%=i%>*<%=j%>=<%=i*j%><br>
	<%}
	}%>
	
	
</body>
</html>