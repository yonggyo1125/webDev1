<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:url var="action" value="/member/join" />

<form method="POST" action="${action}">
    <dl>
        <dt>아이디</dt>
        <dd>
            <input type="text" name="userId" value="${joinForm.userId}">
        </dd>
    </dl>
    <dl>
        <dt>비밀번호</dt>
        <dd>
            <input type="password" name="userPw">
        </dd>
    </dl>
    <dl>
        <dt>비밀번호확인</dt>
        <dd>
            <input type="password" name="userPwRe">
        </dd>
    </dl>
    <dl>
        <dt>회원명</dt>
        <dd>
            <input type="text" name="userNm" value="${joinForm.userNm}">
        </dd>
    </dl>
    <dl>
        <dt>이메일</dt>
        <dd>
            <input type="text" name="email" value="${joinForm.email}">
        </dd>
    </dl>
    <dl>
        <dt>휴대전화번호</dt>
        <dd>
            <input type="text" name="mobile" value="${joinForm.email}">
        </dd>
    </dl>
    <dl>
        <dt>취미</dt>
        <dd>
            <input type="checkbox" name="hobby">
        </dd>
    </dl>
    <div>
        <input type="checkbox" name="agree" value="true" id="agree" >
        <label for="agree">회원가입 약관에 동의합니다.</label>
    </div>
    <button type="submit">가입하기</button>
</form>