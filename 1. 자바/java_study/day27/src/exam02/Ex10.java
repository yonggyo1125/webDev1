package exam02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("score2.txt"));
        while(sc.hasNext()) {
            int score = sc.nextInt();
            System.out.println(score);
        }
    }
}
