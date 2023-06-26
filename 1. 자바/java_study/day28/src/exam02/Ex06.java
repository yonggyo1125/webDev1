package exam02;

public class Ex06 {
    public static void main(String[] args) {
        Thread mainTh = Thread.currentThread();
        System.out.println(mainTh.getThreadGroup());

        Thread4 th = new Thread4();
        System.out.println(th.getThreadGroup());

        th.setDaemon(true);
        th.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Thread4 extends Thread {
    public void run() {
        while(true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("문서 저장 완료!");
        }
    }
}
