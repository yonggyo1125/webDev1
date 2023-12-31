package org.koreait.controllers.member;

import lombok.RequiredArgsConstructor;
import org.koreait.repositories.MemberRepository;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@RequiredArgsConstructor
public class JoinValidator implements Validator {

    private final MemberRepository repository;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(JoinForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        JoinForm form = (JoinForm) target;

        /**
         * 1. 아이디 중복 여부 체크 -> 중복 X
         * 2. 비밀번호, 비밀번호 확인 일치 여부
         * 3. 휴대전화번호 -> 형식 체크
         */

        // 1. 아이디 중복 여부 체크
        String userId = form.getUserId();
        if (userId != null && !userId.isBlank() && repository.exists(userId)) {
            errors.rejectValue("userId", "duplicate");
        }


        // 2. 비밀번호, 비밀번호 확인 일치 여부
        String userPw = form.getUserPw();
        String userPwRe = form.getUserPwRe();
        if (userPw != null && !userPw.isBlank() && userPwRe != null && !userPwRe.isBlank()
            && !userPw.equals(userPwRe)) {
            errors.rejectValue("userPwRe", "mismatch");
        }

        // 3. 휴대전화번호 -> 형식 체크
        String mobile = form.getMobile();
        if (mobile != null && !mobile.isBlank()) {
            /**
             * 010-1111-1111, 010.1111.1111 01011111111 -> 형식을 숫자만 남기고 제거
             * 011, 016
             */
            mobile = mobile.replaceAll("\\D", "");
            String pattern = "^01[016]\\d{3,4}\\d{4}$";
            if (!mobile.matches(pattern)) {
                errors.rejectValue("mobile", "Mobile");
            }

            form.setMobile(mobile);
        }
    }
}
