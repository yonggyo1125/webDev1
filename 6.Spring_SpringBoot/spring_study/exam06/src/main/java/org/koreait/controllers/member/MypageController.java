package org.koreait.controllers.member;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.commons.MemberUtil;
import org.koreait.models.member.MemberInfo;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Slf4j
@Controller
@RequestMapping("/mypage")
@RequiredArgsConstructor
public class MypageController {

    private final MemberUtil memberUtil;

    @GetMapping
    @ResponseBody
    public void index() {
        log.info("로그인 여부 : " + memberUtil.isLogin());
        if (memberUtil.isLogin()) {
            MemberInfo member = memberUtil.getMember();
            log.info(member.toString());
        }
    }
    /**
    public void index() {
        MemberInfo member = (MemberInfo)SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        log.info(member.toString());
    }
    */

    /**
    public void index(@AuthenticationPrincipal MemberInfo member) {
        log.info(member.toString());
    }

    /*
    public void index(Principal principal) {
        String userId = principal.getName();
        log.info(userId);
    }
     */
}
