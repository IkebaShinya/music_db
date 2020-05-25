<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<p>${name}名</p>

<form method="GET" action="<c:url value='/result' />">
    <select name="select">
        <c:forEach var="table" items="${table}" varStatus="status">
            <option value = "${table.id}&${table.name}&${name}">${table.name}</option>
        </c:forEach>
    </select>
    <input type="hidden" name = "select"/>
    <button type="submit">GetList</button>
</form>