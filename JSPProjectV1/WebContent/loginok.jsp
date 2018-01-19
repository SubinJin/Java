<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>

<c:set var="uid" value="${param.uid}"></c:set>
<c:set var="pwd" value="${param.pwd}"></c:set>

<sql:query var="rs" dataSource="jdbc/oracle" sql="select userid, name, regdate from member where uid=? and pwd=?">
<sql:param value:"${uid}" />
<sql:param value:"${pwd}" />
</sql:query>

<c:forEach var="row" items="${rs.rows}">
	<c:if test="${not empty row.userid}">
		<c:redirect url = "index.jsp" />
	</c:if>
	<c:if test="${empty row.userid}">
		<c:redirect url = "join.jsp" />
	</c:if>
	<c:out value="${row.userid}" />
</c:forEach>