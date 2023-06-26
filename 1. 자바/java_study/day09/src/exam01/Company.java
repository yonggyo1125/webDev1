package exam01;

public class Company {
    private static Company instance;

    private Company() {}

    public static Company getInstance() {
        if (instance == null) { // 객체가 생성되지 않은 경우
            instance = new Company();
        }

        return instance;
    }
}
