package exam01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
           // String line = sc.nextLine();
            //System.out.println(line);
            System.out.print("두수를 다음과 같이 입력 하세요 예)10 20 / 종료는 q");
            String line = sc.nextLine();

            if (line.equals("q")) { // q가 입력되면 종료
                System.out.println("종료!!");
                break;
            }
            // 10 20 // String:String[] split("문자");
            String[] data = line.split(" ");
            //System.out.println(data[0] + "," + data[1]);
            int num1 = Integer.parseInt(data[0]);
            int num2 = Integer.parseInt(data[1]);

            System.out.printf("합:%d%n", num1 + num2);

        }
    }
}
