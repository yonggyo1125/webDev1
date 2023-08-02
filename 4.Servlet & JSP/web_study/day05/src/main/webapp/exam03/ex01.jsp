<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<c:set var="date" value="<%=new Date()%>" />

<fmt:formatDate value="${date}" type="date" /><br>
<fmt:formatDate value="${date}" type="time" /><br>
<fmt:formatDate value="${date}" type="both" /><br>
