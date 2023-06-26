package exam02;

public class Ex03 {
    public static void main(String[] args) {
        try {
            String str = null;
            str = str.toUpperCase(); // throw new NullPointerException(....);

            // str null 이면 절대로 실행되면 안되는 코드
            System.out.println("str이 있어야 오류 없이 실행되는 코드...");

        } catch (NullPointerException e) {
           // System.out.println("적절한 예외 처리...");
            //String message = e.getMessage();
            //System.out.println(message);
            e.printStackTrace();
        }

        System.out.println("매우 중요한 코드!!");
    }
}
