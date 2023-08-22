package exam06.models.member;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JoinService {

    private final MemberDao memberDao;

    @NonNull
    private JoinValidator validator;


    public void join(Member member) {
        validator.check(member);

        memberDao.register(member);
    }

}
