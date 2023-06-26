package exam02;

public class UserPwIncorrectException extends RuntimeException {
    public UserPwIncorrectException(String message) {
        super(message);
    }
}
