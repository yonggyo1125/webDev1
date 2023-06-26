package exam01;

public class Ex03 {
    public static void main(String[] args) {
        ThreadEx03_1 th1 = new ThreadEx03_1();
        ThreadEx03_2 th2 = new ThreadEx03_2();
        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        /**
        try {
            Thread.sleep(3000); /// 현재 실행 중인 쓰레드 main
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        */
        System.out.println("작업 종료!!");
    }
}

class ThreadEx03_1 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("|");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("1번 종료!");
    }
}

class ThreadEx03_2 extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print("-");

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("2번 종료!");
    }
}
