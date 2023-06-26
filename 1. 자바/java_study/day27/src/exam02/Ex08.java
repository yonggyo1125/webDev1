package exam02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex08 {
    public static void main(String[] args) throws IOException {
        System.out.printf("아무거나 입력 : ");
        //InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            //char ch = (char)System.in.read();
            //char ch = (char)br.read();
            //System.out.print(ch);
            String line = br.readLine();
            System.out.println(line);
        }
    }
}
