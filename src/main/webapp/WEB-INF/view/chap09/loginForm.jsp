<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>내가 만든 로그인페이지</title>
</head>
<body>

<form:form commandName="loginCommand">
<form:errors></form:errors><br>
<form:label path="loginType"><spring:message code="login.type"></spring:message></form:label> :<form:select path="loginType" items="${loginTypes}"></form:select><br>
<form:label path="memberId"><spring:message code="login.id"></spring:message></form:label> : <form:input path="memberId"/><br><form:errors path="memberId"/><br>
<form:label path="password"><spring:message code="login.password"></spring:message></form:label> : <form:password path="password"/><br><form:errors path="password"/><br> 
주소 1:<form:input path="address.address1"/><br><form:errors path="address.address1"/><br>
주소 2:<form:input path="address.address2"/><br><form:errors path="address.address2"/><br>

<form:label path="jobCode">직업 : </form:label>
<form:select path="jobCode">
<option value="">--선택하세요--</option>
<form:options items="${jobCodes}" itemLabel="labelString" itemValue="valueString"/>
</form:select> 
<br><br>
<form:label path="likeOs">선호 os :</form:label><form:checkboxes items="${favoriteOsNames}" path="likeOs"/> <br>
<form:checkbox path="contractAgreement" label="약관 동의"/>


<br>
<input type="submit">
</form:form>





</body>
</html>