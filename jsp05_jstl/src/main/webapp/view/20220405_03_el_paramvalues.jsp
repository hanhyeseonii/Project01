<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<fieldset>
		<legend>판매메뉴</legend>
		<input type="checkbox" name="menu" value="감자전">감자전
		<input type="checkbox" name="menu" value="뇨끼">뇨끼
		<input type="checkbox" name="menu" value="가츠동">가츠동
		</fieldset>
		<button>선택</button>
	</form>
	<h2>선택메뉴(jsp)</h2>
	<%
		String [] menus=request.getParameterValues("menu");
		if (menus !=null){
			for (String menu :menus){
	%>
			<li><%=menu %></li>
				
	<%		}
		}
	%>
	
	<h2>EL</h2>
	<!-- null자동 처리
	반복문은 jstl -->
	<li>${paramValues.menu[0]}</li>
	<li>${paramValues.menu[1]}</li>
	<li>${paramValues.menu[2]}</li>
	
</body>
</html>