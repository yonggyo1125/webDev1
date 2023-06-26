package exam02;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
    public static void main(String[] args) {
        int[] scores = { 90, 80, 88, 65, 78, 100 };
        try (FileOutputStream fos = new FileOutputStream("score.dat");
             DataOutputStream dos = new DataOutputStream(fos)) {
            for (int score : scores) {
                dos.writeInt(score);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
