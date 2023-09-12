package org.koreait.models.member;

import lombok.RequiredArgsConstructor;
import org.koreait.controllers.member.JoinForm;
import org.koreait.controllers.member.JoinValidator;
import org.koreait.entities.Member;
import org.koreait.repositories.MemberRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

@Service
@RequiredArgsConstructor
public class MemberJoinService {
    private final MemberRepository repository;
    private final JoinValidator joinValidator;
    private final PasswordEncoder encoder;

    public void join(JoinForm form, Errors errors) {
        joinValidator.validate(form, errors);

        if (errors.hasErrors()) {
            return;
        }

        //Member member = new ModelMapper().map(form, Member.class);
        Member member = Member.builder()
                        .userId(form.getUserId())
                        .userPw(encoder.encode(form.getUserPw()))
                        .userNm(form.getUserNm())
                        .email(form.getEmail())
                        .mobile(form.getMobile())
                        .build();

        repository.saveAndFlush(member);
    }
}
