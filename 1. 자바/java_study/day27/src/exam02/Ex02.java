package exam02;

import java.io.*;

public class Ex02 {
    public static void main(String[] args) {
        long stime = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream("api.zip");
            BufferedInputStream bis = new BufferedInputStream(fis);
            FileOutputStream fos = new FileOutputStream("api_copied2.zip");
            BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            while(bis.available() > 0) {
                bos.write(bis.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        long etime = System.currentTimeMillis();
        System.out.printf("걸린 시간 : %d%n", etime - stime);
    }
}
