<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${flush != null}">
    <div id="flush_success">
        <c:out value="${flush}"></c:out>
    </div>
</c:if>
<h2>これはMUSIC_DBデータ検索用のフォームです</h2>
<p>下からフィールド名を選んでください<br>
   フィールド名を選択したら、【GetList】ボタンをクリックします
</p>

<form method="GET" action="<c:url value='/next' />">
    <select name="select">
        <option value="アーティスト">アーティスト</option>
        <option value="シリーズ">シリーズ</option>
        <option value="曲調">曲調</option>
    </select>
    <input type="hidden" name = "select"/>
    <button type="submit">GetList</button>
</form>
