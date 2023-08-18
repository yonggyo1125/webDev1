package exam02.models.member;

public class ServiceManager {
    public MemberDao memberDao() {
        return new MemberDao();
    }

    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    public JoinService joinService() {
       return new JoinService(memberDao(), joinValidator());
    }

    public ListService listService() {
        ListService service = new ListService();
        service.setMemberDao(memberDao());

        return service;
    }
}
