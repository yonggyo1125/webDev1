package exam02.models.member;

public class JoinService {

    private MemberDao memberDao;

    public void JoinService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public void join(Member member) {

        memberDao.register(member);
    }

}
