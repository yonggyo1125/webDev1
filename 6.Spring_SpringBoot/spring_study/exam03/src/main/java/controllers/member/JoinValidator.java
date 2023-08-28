package controllers.member;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
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
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "required", "아이디를 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPw", "required", "비밀번호를 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPwRe", "required", "비밀번호를 확인하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userNm", "required", "회원명을 입력하세요.");
    }
}
