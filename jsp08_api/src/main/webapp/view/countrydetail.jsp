<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	
</style>
</head>
<body>
	<h2>상세조회</h2>
	<%-- ${country} --%>
	<table border="1">
		<tr>
			<th>안전공지ID</th>
			<td>${country.sfty_notice_id}</td>
		</tr>
		<tr>
			<th>대륙코드</th>
			<td>${country.continent_cd}</td>
		</tr>
		<tr>
			<th>대륙영어이름</th>
			<td>${country.continent_eng_nm}</td>
		</tr>
		<tr>
			<th>대륙한국이름</th>
			<td>${country.continent_nm}</td>
		</tr>
		<tr>
			<th>iso</th>
			<td>${country.country_iso_alp2}</td>
		</tr>
		<tr>
			<th>나라영어이름</th>
			<td>${country.country_eng_nm}</td>
		</tr>
		<tr>
			<th>나라한국이름</th>
			<td>${country.country_nm}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${country.title}</td>
		</tr>
		<tr>
			<th>파일갯수</th>
			<td>${country.file_cnt}</td>
		</tr>
		<tr>
			<th>파일</th>
			<td><a href="${country.file_download_url}">${country.file_path}</a></td>
		</tr>
		<tr>
			<th>html원본파일</th>
			<td>html_origin_cn</td>
		</tr>	
	</table>
</body>
</html>