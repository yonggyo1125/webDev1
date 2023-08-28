package controllers.member;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(JoinForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        JoinForm joinForm = (JoinForm)target;

        /**
         * 1. 필수 항목 검증 (userId, userPw, userPwRe, userNm), null, "   "
         *
         */
        String userId = joinForm.getUserId();
        String userPw = joinForm.getUserPw();
        String userPwRe = joinForm.getUserPwRe();
        String userNm = joinForm.getUserNm();

        if (userId == null || userId.isBlank()) {
            errors.rejectValue("userId", "required", "아이디를 입력하세요.");
        }

        if (userPw == null || userPw.isBlank()) {
            errors.rejectValue("userPw", "required", "비밀번호를 입력하세요.");
        }

        if (userPwRe == null || userPwRe.isBlank()) {
            errors.rejectValue("userPwRe", "required", "비밀번호를 확인하세요.");
        }

        if (userNm == null || userNm.isBlank()) {
            errors.rejectValue("userNm", "required", "회원명을 입력하세요.");
        }
    }
}
