<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h2>リザルトページ</h2>
<c:out value="${str0}" />
<c:out value="${str1}" />
<c:out value="${str2}" />
<table>
    <tbody>
        <tr>
            <th>曲ID</th>
            <td><c:out value="${song.id}" /></td>
        </tr>
        <tr>
            <th>曲名</th>
            <td><c:out value="${song.title}" /></td>
        </tr>
        <tr>
            <th>コメント</th>
            <td><c:out value="${song.comment}" /></td>
        </tr>
        <tr>
            <th>作曲年月日</th>
            <td><fmt:formatDate value="${song.composition}"
                    pattern="yyyy-MM-dd" /></td>
        </tr>
        <tr>
            <th>アーティスト番号</th>
            <td><c:out value="${song.artist_num}" /></td>
        </tr>
        <tr>
            <th>曲調</th>
            <td><c:out value="${song.tune_num}" /></td>
        </tr>
        <tr>
            <th>シリーズ</th>
            <td><c:out value="${song.series_num}" /></td>
        </tr>
    </tbody>
</table>