package restcontrollers;

import lombok.RequiredArgsConstructor;
import models.member.Member;
import models.member.MemberDao;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberDao memberDao;

    @GetMapping("/{id}")
    public Member info(@PathVariable("id") String userId) {
        Member member = memberDao.get(userId);

        return member;
    }
}
