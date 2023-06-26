package exam02;

public class Ex03 {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();
        th1.run();
        System.out.println("------------------");
        th1.start();
    }
}


class Thread1 extends Thread {
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}