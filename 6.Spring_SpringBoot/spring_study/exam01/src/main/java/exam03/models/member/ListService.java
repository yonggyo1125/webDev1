package exam03.models.member;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class ListService {

    private MemberDao memberDao;
    private DateTimeFormatter formatter;

    @Autowired
    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    @Autowired
    public void setMemberDao(MemberDao memberDao) {

        this.memberDao = memberDao;
    }

    public void print() {
        List<Member> members = memberDao.getList();
        members.stream().map(this::toConvert).forEach(System.out::println);
    }

    private Member toConvert(Member member) {
        member.setRegDtStr(formatter.format(member.getRegDt()));

        return member;
    }
}
