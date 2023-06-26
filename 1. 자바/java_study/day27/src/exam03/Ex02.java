package exam03;

import java.io.File;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File dir = new File("D:" + File.separator + "tmp");
        File file = File.createTempFile("tmp_", ".log", dir); // 기본 임시 폴더  /tmp
        System.out.println("getName() : " + file.getName());
        System.out.println("getAbsolutePath() : " + file.getAbsolutePath()); // 절대 경로
        file.deleteOnExit();

        Thread.sleep(5000); // 1000 - 1초


    }
}
