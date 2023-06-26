package exam01;

public class Ex05 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        try {
            service.login("user01", "1234");

            System.out.println("로그인 이후 실행될 아주 중요한 코드!!!!, 로그인 안되면 절대 실행 X");
        } catch (UserIdIncorrectException | UserPwIncorrectException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
