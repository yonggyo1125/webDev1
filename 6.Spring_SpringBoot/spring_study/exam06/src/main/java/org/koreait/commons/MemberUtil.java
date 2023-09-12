package org.koreait.commons;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.koreait.models.member.MemberInfo;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberUtil {

    private final HttpSession session;

    public boolean isLogin() {
        return getMember() != null;
    }

    public MemberInfo getMember() {
        MemberInfo member = (MemberInfo)session.getAttribute("memberInfo");

        return member;
    }
}
