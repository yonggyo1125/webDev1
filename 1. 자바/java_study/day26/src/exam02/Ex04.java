package exam02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("test2.txt")) {
            for (int i = 0; i < 26; i++) {
                fos.write(i+65);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
