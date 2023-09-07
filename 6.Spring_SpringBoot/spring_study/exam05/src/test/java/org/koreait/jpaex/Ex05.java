package org.koreait.jpaex;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.BeforeEach;
import org.koreait.constants.Role;
import org.koreait.entities.Member;
import org.koreait.repositories.BoardDataRepository;
import org.koreait.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
public class Ex05 {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private BoardDataRepository boardDataRepository;


    @BeforeEach
    void init() {
        Member member = Member.builder()
                .userId("user01")
                .userPw("123456")
                .userNm("사용자01")
                .role(Role.USER)
                .build();

    }
}
