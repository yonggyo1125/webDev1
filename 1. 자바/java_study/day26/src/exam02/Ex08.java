package exam02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        byte[] bytes = { 'A', 'B', 'C', 'D', 'E', 'F' };
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        while(bis.available() > 0) {
            //System.out.print((char)bis.read());
            bos.write(bis.read());
        }

        byte[] bytes2 = bos.toByteArray();
        System.out.println(Arrays.toString(bytes2));
    }
}
