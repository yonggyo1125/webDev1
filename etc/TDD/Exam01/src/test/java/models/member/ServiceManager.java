package models.member;

public class ServiceManager {

    private static ServiceManager instance;

    public static ServiceManager getInstance() {
        if (instance == null) {
            instance = new ServiceManager();
        }

        return instance;
    }

    public MemberDao memberDao() {
        return new MemberDao();
    }

    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    public LoginValidator loginValidator() {
        return new LoginValidator();
    }


    public JoinService joinService() {

        return new JoinService(memberDao(), joinValidator());
    }

    public LoginService loginService() {
        return new LoginService(loginValidator());
    }
}
