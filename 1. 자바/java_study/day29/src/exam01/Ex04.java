package exam01;

import javax.swing.*;

public class Ex04 {
    public static void main(String[] args) {
        ThreadEx04 th = new ThreadEx04();
        th.start();

        String str = JOptionPane.showInputDialog("아무거나 입력?");
        System.out.println(str);
        System.out.println("작업 실행?");
        th.interrupt();
    }
}

class ThreadEx04 extends Thread {
    public void run() {
        int i = 10;

        while(!isInterrupted()) { // interrupt() 호출 시  true
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted - false");
                System.out.println("isInterrupted() : " + isInterrupted());
                interrupt(); // true
            }
            if (i <= 0) break;

        }
    }
}
