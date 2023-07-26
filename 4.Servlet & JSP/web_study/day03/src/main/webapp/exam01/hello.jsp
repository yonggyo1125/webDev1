<%@ page contentType="text/html; charset=UTF-8" %>
<h1>안녕하세요!</h1>
<h2>반갑습니다.</h2>
<%
    int num1 = 10;
    int num2 = 20;
    int result = num1 + num2;
%>

<%!
    int num1 = 30;

    int add(int num1, int num2) {
        return num1 + num2;
    }
%>