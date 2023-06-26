package exam02;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("data1.dat");
            DataInputStream dis = new DataInputStream(fis)) {

            byte num = dis.readByte();
            System.out.println(num);

            char ch = dis.readChar();
            System.out.println(ch);

            String str = dis.readUTF();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
