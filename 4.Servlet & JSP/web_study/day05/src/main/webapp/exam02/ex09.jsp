<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%--<c:redirect url="https://www.naver.com" />--%>
<c:redirect url="ex08.jsp">
    <c:param name="key1" value="value1" />
    <c:param name="key2" value="value2" />
</c:redirect>