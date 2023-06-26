package exam03;

import java.io.File;

public class Ex05 {
    public static void main(String[] args) {
        File dir = new File("D:\\");
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
            if (file.isFile()) {
                System.out.printf("용량 : %d%n", file.length());
            }
        }
    }
}
