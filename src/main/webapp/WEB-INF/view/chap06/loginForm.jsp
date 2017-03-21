<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<spring:hasBindErrors name="memberDto"/>
<form:errors path="memberDto"/>
<form method="post">
<form:errors element="div"/>
아이디 : <input type="text" name="memberId"><form:errors path="memberDto.memberId"/><br>
패스워드 : <input type="text" name="password"><form:errors path="memberDto.password"/><br>
<input type="submit">
</form>

</body>
</html>