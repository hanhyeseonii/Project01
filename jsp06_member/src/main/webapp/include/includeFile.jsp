<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl라이브러리 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<!-- contextpath -->
<script>
	//파라메터 메시지창
	if ('${param.msg}' != ''){
		alert('${param.msg}');
	}
	//requestScope 메시지창
	if ('${msg}' != ''){
		alert('${msg}');
	}
</script>