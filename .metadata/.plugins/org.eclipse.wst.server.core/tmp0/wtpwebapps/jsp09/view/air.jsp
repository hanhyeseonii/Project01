<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	if('${param.msg}'!='')
		alert('${param.msg}');

</script>
</head>
<body>
	<h2>미세먼지 경보 현황</h2>
	<form action="${path}/pasing.air">
		<fieldset>
			<legend>파싱</legend>
			<input type="number" name="year">
			<button>파싱</button>
		</fieldset>
	</form>
	<form action="${path}/list.air">
		지역명 <input type="text" name="districtName">
		<button>조회</button>
	</form>
	${clist}
	<hr>
	<c:forEach var="air" items="${clist}">
	<%-- ${map} --%>
	<table border="1">
		<tr>
			<th>순번</th>
			<td colspan="3">${dust.SN}</td>
		</tr>
		<tr>
			<th>지역명</th>
			<td>${dust.DISTRICTNAME}</td>
			<th>권역명</th>
			<td>${dust.MOVENAME}</td>
		</tr>
		<tr>
			<th>항목명</th>
			<td>${dust.ITEMCODE}</td>
			<th>경보단계</th>
			<td>${dust.ISSUEGBN}</td>
		</tr>
		<tr>
			<th>발령일시</th>
			<td>${dust.ISSUEDATE} ${dust.ISSUETIME}</td>
			<th>발령농도</th>
			<td>${dust.ISSUEVAL}</td>
		</tr>
		<tr>
			<th>해제일</th>
			<td>${dust.CLEARDATE} ${dust.CLEARTIME}</td>
			<th>발령농도</th>
			<td>${dust.CLEARVAL}</td>
		</tr>
	</table>
	</c:forEach>
</body>
</html>