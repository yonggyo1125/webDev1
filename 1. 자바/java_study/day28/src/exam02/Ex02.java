package exam02;

public class Ex02 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        Thread mainThead = Thread.currentThread();

        for (int i = 1; i <= 10; i++) {
            System.out.println(mainThead.getName() + " : " + i);

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
